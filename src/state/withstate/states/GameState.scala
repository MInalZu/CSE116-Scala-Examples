package state.withstate.states

trait GameState {

  def playerTurn(): String
  def takeTurn(): Unit

}
