package concurrency

import java.net.InetSocketAddress

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import akka.io.{IO, Tcp}
import akka.util.ByteString



case class SendToClients(message: String)

class SocketServer extends Actor {

  import Tcp._
  import context.system

  IO(Tcp) ! Bind(self, new InetSocketAddress("localhost", 8000))

  var clients: Set[ActorRef] = Set()

  override def receive: Receive = {
    case b: Bound => println("Listening on port: " + b.localAddress.getPort)
    case c: Connected =>
      println("Client Connected: " + c.remoteAddress)
      this.clients = this.clients + sender()
      sender() ! Register(self)
    case PeerClosed =>
      println("Client Disconnected: " + sender())
      this.clients = this.clients - sender()
    case r: Received =>
      println("Received: " + r.data.utf8String)
    case send: SendToClients =>
      println("Sending: " + send.message)
      this.clients.foreach((client: ActorRef) => client ! Write(ByteString(send.message)))
  }

}


object SocketServer{

  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem()

    import scala.concurrent.duration._
    import actorSystem.dispatcher

    val server = actorSystem.actorOf(Props(classOf[SocketServer]))

    actorSystem.scheduler.schedule(0 milliseconds, 2000 milliseconds, server, SendToClients("Ping from server"))
  }
}
