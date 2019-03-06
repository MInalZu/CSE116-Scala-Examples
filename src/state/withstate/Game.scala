package state.withstate

import state.withstate.states.{GameState, GameStateXTurn}

class Game {

  var gameState: GameState = new GameStateXTurn(this)

  val boardSize = 3

  val squares: Array[Square] = (
    for {i <- 0 until boardSize
         j <- 0 until boardSize} yield {
      new Square(this, i, j)
    }).toArray


  def playerTurn(): String = {
    this.gameState.playerTurn()
  }

  def takeTurn(): Unit = {
    this.gameState.takeTurn()
  }

}
