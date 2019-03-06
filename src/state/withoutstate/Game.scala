package state.withoutstate

class Game {

  var playerTurn = "X"

  val movesMade = Array(
    Array(" ", " ", " "),
    Array(" ", " ", " "),
    Array(" ", " ", " ")
  )

  def buttonClicked(x:Int, y:Int): Unit = {
    if(this.movesMade(y)(x) == " "){
      this.movesMade(y)(x) = this.playerTurn
      this. playerTurn = if(this.playerTurn == "X") "O" else "X"
    }
  }

}
