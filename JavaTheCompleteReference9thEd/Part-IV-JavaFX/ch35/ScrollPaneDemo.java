
import javafx.application.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ScrollPaneDemo extends Application {

  ScrollPane scrlPane;

  public static void main(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){

    stage.setTitle("scroll pane");

    FlowPane rootNode = new FlowPane(10,10);

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 200, 200);

    stage.setScene(scene);

    Label scrlLabel = new Label("A Scroolpane strealines the process of\n" +
                          "adding scroll bars to a window whose\n" +
                          "contents exceed the window's dimensions.\n" +
                          "It also enables a control to fit in a\n" +
                          "smaller space than it otherwise would.\n" +
                          "As such, it often provides a superior\n" +
                          "approach over using individual scroll bars.");

    scrlPane = new ScrollPane(scrlLabel);

    scrlPane.setPrefViewportWidth(130);
    scrlPane.setPrefViewportHeight(80);

    scrlPane.setPannable(true);

    Button btnReset = new Button("Reset Scroll Bar Positions");

    btnReset.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        scrlPane.setVvalue(0);
        scrlPane.setHvalue(0);
      }
    });

    rootNode.getChildren().addAll(scrlPane, btnReset);

    stage.show();
  }
}
