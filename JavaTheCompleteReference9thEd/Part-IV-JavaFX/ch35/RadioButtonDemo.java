
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.event.*;


public class RadioButtonDemo extends Application {

  Label response;

  public static void main(String args[])
  {
    launch(args);
  }

  public void start(Stage stage){

    stage.setTitle("radio buttons killed the analog switch");

    FlowPane rootNode = new FlowPane(10, 10);

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 220, 120);

    stage.setScene(scene);

    response = new Label("");

    RadioButton rbt = new RadioButton("trains");
    RadioButton rbp = new RadioButton("planes");
    RadioButton rba = new RadioButton("automobiles");

    ToggleGroup tg = new ToggleGroup();

    rbt.setToggleGroup(tg);
    rbp.setToggleGroup(tg);
    rba.setToggleGroup(tg);

    rbt.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        response.setText("Trains");
      }
    });

    rbp.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        response.setText("Planes");
      }
    });

    rba.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        response.setText("Automobiles");
      }
    });

    rbt.fire(); //fire event to get first response

    rootNode.getChildren().addAll(rbt, rbp, rba, response);

    stage.show();
  }
}
