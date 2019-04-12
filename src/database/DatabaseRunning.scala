package database

import physics.PhysicsVector

object DatabaseRunning {

  def main(args: Array[String]): Unit = {
    Database.setupTable()

    Database.createPlayer("mario", new PhysicsVector(2.5, -3.9, 0.0))
    Database.createPlayer("luigi", new PhysicsVector(0.4, 8.3, 0.0))
    Database.createPlayer("peach", new PhysicsVector(5.1, 3.2, 0.0))

    val marioLocation = Database.getPlayerLocation("mario")
    println("Mario: " + marioLocation)

    var peachScore = Database.getPlayerScore("peach")
    println("Peach score: " + peachScore)

    Database.updatePlayer("peach", new PhysicsVector(10.0, 5.5, 0.0), 50)

    peachScore = Database.getPlayerScore("peach")
    println("Peach score: " + peachScore)

    val peachLocation = Database.getPlayerLocation("peach")
    println("Peach: " + peachLocation)

    val allScores = Database.getAllScores()
    println(allScores)
  }

}
