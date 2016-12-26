
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class JavaFXLabelDemo extends Application {

  public static void main(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){

    stage.setTitle("label practice");

    FlowPane rootNode = new FlowPane();

    Scene scene = new Scene(rootNode, 300, 200);

    stage.setScene(scene);

    Label lbl = new Label("howdy everybody!");

    rootNode.getChildren().add(lbl);

    stage.show();
  }
}
