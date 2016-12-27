
import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.transform.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;

public class EffectsAndTransformsDemo extends Application {

  double angle = 0.0;
  double glowVal = 0.0;
  double scaleFactor = 1.0;
  boolean shadow;

  //create initial effects and transforms
  Glow glow = new Glow(0.0);
  InnerShadow innerShadow = new InnerShadow(10.0, Color.RED);
  Rotate rotate = new Rotate();
  Scale scale = new Scale(scaleFactor, scaleFactor);

  Button btnRotate = new Button("Rotate");
  Button btnGlow = new Button("Glow");
  Button btnShadow = new Button("Shadow OFF");
  Button btnScale = new Button("Scale");

  public static void main(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){
    stage.setTitle("transform stuff");

    FlowPane rootNode = new FlowPane(10, 10);

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 300, 100);

    stage.setScene(scene);

    btnGlow.setEffect(glow);

    btnRotate.getTransforms().add(rotate);

    btnScale.getTransforms().add(scale);

    btnRotate.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        angle += 30.0;

        rotate.setAngle(angle);
        rotate.setPivotX(btnRotate.getWidth()/2);
        rotate.setPivotY(btnRotate.getHeight()/2);
      }
    });

    btnScale.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        //buttons scale is changed on each button process
        scaleFactor += 0.1;
        if(scaleFactor > 1.0) scaleFactor = 0.4;

        scale.setX(scaleFactor);
        scale.setY(scaleFactor);
      }
    });

    btnGlow.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        glowVal += 0.1;
        if(glowVal > 1.0) glowVal = 0.0;
        glow.setLevel(glowVal);
      }
    });

    btnShadow.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        //Shadow status changes on each click
        shadow = !shadow;
        if(shadow) {
          btnShadow.setEffect(innerShadow);
          btnShadow.setText("Shadow OFF");
        } else {
          btnShadow.setEffect(null);
          btnShadow.setText("Shadow  ON");
        }
      }
    });
    rootNode.getChildren().addAll(btnRotate, btnScale, btnGlow, btnShadow);

    stage.show();
  }
}
