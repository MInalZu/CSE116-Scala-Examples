package state.withstate

import javafx.event.{ActionEvent, EventHandler}
import scalafx.scene.control.Button
import state.withstate.states.{SquareState, SquareStateEmpty}

class Square(game: Game, val x:Int, val y:Int) extends EventHandler[ActionEvent]  {

  var button:Button = _  // set by GUI
  var state: SquareState = new SquareStateEmpty(game, this)

  override def handle(event: ActionEvent): Unit = {
    this.state.clicked()
    button.text.value = this.state.occupant
  }

}
