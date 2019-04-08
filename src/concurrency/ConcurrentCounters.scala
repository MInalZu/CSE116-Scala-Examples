package concurrency

import akka.actor._


case object Start


class Counter(name: String) extends Actor {

  def countDown(n: Int): Unit = {
    if (n >= 0) {
      println(this.name + " - " + n)
      countDown(n - 1)
    }else{
      println(this.name + " finished")
    }
  }

  def receive: Receive = {
    case Start => countDown(20)
  }

}


object CounterTest extends App {
  val system = ActorSystem("CountingSystem")

  val one = system.actorOf(Props(classOf[Counter], "1"))
  val two = system.actorOf(Props(classOf[Counter], "2"))
  val three = system.actorOf(Props(classOf[Counter], "3"))

  one ! Start
  two ! Start
  three ! Start
}