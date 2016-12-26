
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class JavaFXSkel extends Application {

  public static void main(String args[])
  {
    System.out.println("Launching javafx application");

    //start javafx by calling launch()
    launch(args);
  }

  @Override //start and use Stage - CANNOT USE the init() method
  public void start(Stage myStage){
    System.out.println("inside the init method");

    //give statge a title
    myStage.setTitle("JavaFX Skeliton");

    //create rootnode, in this case(several others exist), a flow layout pane
    FlowPane rootNode = new FlowPane();

    //create scene
    Scene myScene = new Scene(rootNode, 300, 200);

    //set the scene on the Stage
    myStage.setScene(myScene);

    //show the scene and the Stage
    myStage.show();
  }

  @Override
  public void stop(){
    System.out.println("inside the stop method");
  }
}
