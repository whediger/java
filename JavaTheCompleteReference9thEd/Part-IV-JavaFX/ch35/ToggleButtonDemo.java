
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.geometry.*;

public class ToggleButtonDemo extends Application {

  ToggleButton tbOnOff;
  Label response;

  public static void main(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){

    stage.setTitle("toggle button stuff");

    FlowPane rootNode = new FlowPane(10, 10);

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 220, 120);

    stage.setScene(scene);

    response = new Label("Push a button");

    tbOnOff = new ToggleButton("On/Off");

    tbOnOff.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        if(tbOnOff.isSelected()) response.setText("switch ON");
        else response.setText("Switch OFF");
      }
    });

    rootNode.getChildren().addAll(tbOnOff, response);

    stage.show();
  }
}
