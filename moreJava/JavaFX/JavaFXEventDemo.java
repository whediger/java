
//demonstrate JAvaFX events and buttons

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class JavaFXEventDemo extends Application {

  Label response;

  public static void main(String args[])
  {
    launch(args);
  }

  //override start method
  public void start(Stage myStage) {

    //gitve statge a Title
    myStage.setTitle("Use Javafx buttons and events");

    //use flow pane for the root node.
    FlowPane rootNode = new FlowPane(10, 10);

    //center controls
    rootNode.setAlignment(Pos.CENTER);

    Scene myScene = new Scene(rootNode, 300, 100);

    myStage.setScene(myScene);

    response = new Label("Push a Button");

    Button btnUp = new Button("Up");
    Button btnDown = new Button("Down");

    btnUp.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent ae) {
        response.setText("You pressed up.");
      }
    });

    btnDown.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent ae) {
        response.setText("You pressed Down.");
      }
    });

    rootNode.getChildren().addAll(btnUp, btnDown, response);

    myStage.show();
  }
}
