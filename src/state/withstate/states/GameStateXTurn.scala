package state.withstate.states

import state.withstate.Game

class GameStateXTurn(game: Game) extends GameState {

  override def playerTurn(): String = "X"

  override def takeTurn(): Unit = game.gameState = new GameStateOTurn(game)

}
