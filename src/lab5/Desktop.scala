package lab5

import javafx.scene.input.KeyEvent
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.TextArea
import scalafx.scene.layout.GridPane


// When editing the GUI in response to a socket message don't forget to use runLater
//     Platform.runLater(() => {
//      *Your code here*
//    })


object Desktop extends JFXApp {


  var document: TextArea = new TextArea

  document.addEventHandler(KeyEvent.KEY_RELEASED, (event: KeyEvent) => {
    /* Code here is executed when the user edits the text */
  })

  this.stage = new PrimaryStage {
    title = "CSE116 Docs"
    scene = new Scene() {
      content = List(
        new GridPane {
          add(document, 0, 0)
        }
      )
    }

  }

}
