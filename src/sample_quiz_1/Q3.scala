package sample_quiz_1

object Q3 {
  def main(args: Array[String]): Unit = {
    val worth: Double = 10000.0
    val theHeist: Heist = new Heist(new Loot(worth))
    theHeist.manageRisk()
    theHeist.manageRisk()
    println(theHeist.theTake.worth)
  }
}

class Heist(val theTake: Loot){

  def manageRisk(): Unit = {
    theTake.worth -= 1000
  }

}

class Loot(var worth: Double){

}