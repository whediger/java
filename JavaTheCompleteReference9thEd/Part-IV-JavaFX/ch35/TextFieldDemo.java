
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.geometry.*;

public class TextFieldDemo extends Application {

  TextField tf;
  Label response;

  public static void main(String args[])
  {
    launch();
  }

  @Override
  public void start(Stage stage){
    stage.setTitle("text field");

    FlowPane rootNode = new FlowPane(10, 10);

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 230, 140);

    stage.setScene(scene);

    response = new Label("Search String: ");

    Button btnGetText = new Button("Get search string");

    tf = new TextField();

    tf.setPromptText("Enter Search String");

    tf.setPrefColumnCount(15);

    tf.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        response.setText("Search String: " + tf.getText());
      }
    });

    btnGetText.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        response.setText("Search string: " + tf.getText());
      }
    });

    Separator sep = new Separator();
    sep.setPrefWidth(200);

    rootNode.getChildren().addAll(tf, btnGetText, sep, response);

    stage.show();
  }
}
