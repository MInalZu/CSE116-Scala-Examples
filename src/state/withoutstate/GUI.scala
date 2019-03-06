package state.withoutstate

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.Button
import scalafx.scene.layout.GridPane

object GUI extends JFXApp {

  val game = new Game()

  stage = new PrimaryStage {
    title = "Tic-Tac-Toe"
    scene = new Scene() {
      content = List(
        new GridPane {
          hgap = 0.0
          vgap = 0.0

          for (j <- game.movesMade.indices) {
            for (i <- game.movesMade(j).indices) {
              add(
                new Button {
                  val size = 100
                  minWidth = size
                  minHeight = size
                  style = "-fx-font: 30 ariel;"
                  onAction = new MoveAction(game, this, i, j)
                }, i, j
              )
            }

          }
        }
      )
    }
  }
}
