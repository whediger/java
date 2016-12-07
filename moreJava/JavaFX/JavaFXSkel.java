//JavaFX skelleton

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class JavaFXSkel extends Application {
  public static void main(String args[])
  {
    System.out.println("Launching JavaFX Application");

    //start application by callng launch();
    launch(args);
  }

  public void init() {
    System.out.println("inside the init method");
  }

  //override the start() method
  public void start(Stage myStage) {
    System.out.println("Inside the start method");

    //give title
    myStage.setTitle("Title");

    //create root node. in this case Flow layout is used. others exist
    FlowPane rootNode = new FlowPane();

    //create scene
    Scene myScene = new Scene(rootNode, 300, 200);

    //set scene on Stage
    myStage.setScene(myScene);

    //show stage and scene
    myStage.show();
  }

  //override stop() method
  public void stop() {
    System.out.println("inside stop method");
  }
}
