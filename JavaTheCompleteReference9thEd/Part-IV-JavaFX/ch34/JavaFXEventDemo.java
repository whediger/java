
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

  @Override
  public void start(Stage stage){

    stage.setTitle("Now featuring!");

    //creates vertical and hrizontal gaps at 10, 10
    FlowPane rootNode = new FlowPane(10, 10);

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 300, 100);

    stage.setScene(scene);

    response = new Label("Push a button");

    Button btnAlpha = new Button("Alpha");
    Button btnBeta = new Button("Beta");

    btnAlpha.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent ae){
        response.setText("Alpha pushed");
      }
    });

    btnBeta.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent ae){
        response.setText("Beta pressed");
      }
    });

    rootNode.getChildren().addAll(btnAlpha, btnBeta, response);

    stage.show();
  }
}
