package state.withstate.states

import state.withstate.{Game, Square}

class SquareStateEmpty(game:Game, square: Square) extends SquareState {
  override var occupant: String = " "

  override def clicked(): Unit = {
    square.state = new SquareStateUsed(game, game.playerTurn())
    game.takeTurn()
  }
}
