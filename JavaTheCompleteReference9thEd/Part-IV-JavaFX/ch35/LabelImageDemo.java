
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.stage.*;
import javafx.geometry.*;

public class LabelImageDemo extends Application {
  public static void main(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){

    stage.setTitle("image with text");

    FlowPane rootNode = new FlowPane();

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 300, 200);

    stage.setScene(scene);

    ImageView hourglassIV = new ImageView("hourglass.gif");

    Label hourglasslabel = new Label("Hourglass", hourglassIV);

    rootNode.getChildren().add(hourglasslabel);

    stage.show();
  }
}
