
import javafx.application.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class RadioButtonDemo2 extends Application {

  Label response;
  ToggleGroup tg;

  public static void main(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){
    stage.setTitle("program controled");

    FlowPane rootNode = new FlowPane(10, 10);

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 300, 240);

    stage.setScene(scene);

    Label choose = new Label(" select transport type ");
    response = new Label("no transport selected");

    Button btnConfirm = new Button("Confirm transport selection");

    RadioButton rbt = new RadioButton("Trains");
    RadioButton rbp = new RadioButton("Planes");
    RadioButton rba = new RadioButton("Automobiles");

    tg = new ToggleGroup();

    rbt.setToggleGroup(tg);
    rbp.setToggleGroup(tg);
    rba.setToggleGroup(tg);

    rbt.setSelected(true);

    btnConfirm.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        //get button currently selected
        RadioButton rb = (RadioButton)tg.getSelectedToggle();
        //displey it
        response.setText("you selected: " + rb.getText());
      }
    });

    Separator sep = new Separator();
    sep.setPrefWidth(180);

    rootNode.getChildren().addAll(rbt, rbp, rba, response, choose, sep, btnConfirm);

    stage.show();
  }
}
