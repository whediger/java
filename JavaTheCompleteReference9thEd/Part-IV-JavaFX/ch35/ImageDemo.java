
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.stage.*;
import javafx.geometry.*;

public class ImageDemo extends Application {

  public static void main(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){

    stage.setTitle("Image stuff");

    FlowPane rootNode = new FlowPane();

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 300, 200);

    stage.setScene(scene);

    Image hourglass = new Image("hourglass.gif");

    ImageView hourglassIV = new ImageView(hourglass);

    rootNode.getChildren().add(hourglassIV);

    stage.show();
  }
}
