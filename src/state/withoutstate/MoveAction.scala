package state.withoutstate

import javafx.event.{ActionEvent, EventHandler}
import scalafx.scene.control.Button

class MoveAction(game: Game, button: Button, i:Int, j:Int) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    game.buttonClicked(i, j)
    button.text.value = game.movesMade(j)(i)
  }
}