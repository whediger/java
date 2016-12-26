
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.shape.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;

public class DirectDrawDemo extends Application {

  GraphicsContext gc;

  Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.BLACK };
  int colorIdx = 0;

  public static void main(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){

    stage.setTitle("ello mate");

    FlowPane rootNode = new FlowPane();

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 450, 450);

    stage.setScene(scene);

    Canvas canvas = new Canvas(400, 400);

    gc = canvas.getGraphicsContext2D();

    Button btnChangeColor = new Button("Change Color");

    btnChangeColor.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        gc.setStroke(colors[colorIdx]);
        gc.setFill(colors[colorIdx]);

        //redraw line, text, and filled rectangle in new color
        //leaving color of other nodes un changed.
        gc.strokeLine(0, 0, 200, 200);
        gc.fillText("This is drawn on canvas", 60, 50);
        gc.fillRect(100, 320, 30, 40);

        //change color
        colorIdx++;
        if(colorIdx == colors.length) colorIdx = 0;
      }
    });

    //draw initial output to canvas
    gc.strokeLine(0, 0, 200, 200);
    gc.strokeOval(100, 100, 200, 200);
    gc.strokeRect(0, 200, 50, 200);
    gc.fillOval(0, 0, 20, 20);
    gc.fillRect(100, 320, 300, 40);

    gc.setFont(new Font(20));
    gc.fillText("This is drawn on canvas", 60, 50);

    rootNode.getChildren().addAll(canvas, btnChangeColor);

    stage.show();
  }
}
