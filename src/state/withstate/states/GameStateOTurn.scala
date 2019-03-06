package state.withstate.states

import state.withstate.Game

class GameStateOTurn(game: Game) extends GameState {

  override def playerTurn(): String = "O"

  override def takeTurn(): Unit = game.gameState = new GameStateXTurn(game)

}
