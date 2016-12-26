
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.*;

public class ButtonImageDemo extends Application {

  Label response;

  public static void main(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){
    stage.setTitle("image button");

    FlowPane rootNode = new FlowPane(10, 10);

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 250, 450);

    stage.setScene(scene);

    response = new Label("Push a button");

    Button btnHourglass = new Button("Hourglass", new ImageView("hourglass.gif"));
    Button btnAnalog = new Button("Analog", new ImageView("Analog.png"));

    btnHourglass.setContentDisplay(ContentDisplay.TOP);
    btnAnalog.setContentDisplay(ContentDisplay.TOP);

    btnHourglass.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        response.setText("Hourglass Presssed");
      }
    });

    btnAnalog.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        response.setText("Analog Pressed");
      }
    });

    rootNode.getChildren().addAll(btnAnalog, btnHourglass, response);

    stage.show();
  }
}
