package state.withstate.states

import state.withstate.Game

class SquareStateUsed(game:Game, occupiedBy: String) extends SquareState {

  override var occupant: String = occupiedBy

  override def clicked(): Unit = {}

}
