
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class CheckBoxDemo extends Application {

  CheckBox cbSmartphone;
  CheckBox cbTablet;
  CheckBox cbNotebook;
  CheckBox cbDesktop;

  Label response;
  Label selected;

  String computers;

  public static void main(String args[])
  {
    launch(args);
  }

  //override start
  public void start(Stage myStage){

    myStage.setTitle("demo checkboxes");

    FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);

    rootNode.setAlignment(Pos.CENTER);

    Scene myScene = new Scene(rootNode, 530, 200);

    myStage.setScene(myScene);

    Label heading = new Label("what computers do you own?");

    response = new Label("");

    selected = new Label("");

    cbSmartphone = new CheckBox("Smartphone");
    cbTablet = new CheckBox("tablet");
    cbNotebook = new CheckBox("Notebook");
    cbDesktop = new CheckBox("Desktop");

    cbSmartphone.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent ae){
        if(cbSmartphone.isSelected())
          response.setText("you selected smartphone:PPPP this is lame!!!");
        else
          response.setText("smartphone cleared");

        showAll();
      }
    });

    cbTablet.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent ae){
        if(cbTablet.isSelected())
          response.setText("tablet");
        else
          response.setText("tablet cleared");

        showAll();
      }
    });

    cbNotebook.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent ae){
        if(cbNotebook.isSelected())
          response.setText("notebook");
        else
          response.setText("notebook cleared");

        showAll();
      }
    });

    cbDesktop.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent ae){
        if(cbDesktop.isSelected())
          response.setText("desktop");
        else
          response.setText("desktop cleared");

        showAll();
      }
    });

    rootNode.getChildren().addAll(heading, cbSmartphone, cbTablet, cbNotebook, cbDesktop, response, selected);

    myStage.show();

    showAll();
  }

  void showAll() {
    computers = "";
    if(cbSmartphone.isSelected()) computers = "Smartphone ";
    if(cbTablet.isSelected()) computers += "Tablet ";
    if(cbNotebook.isSelected()) computers += "notebook ";
    if(cbDesktop.isSelected()) computers += "desktop";

    selected.setText("computers selected: " + computers);
  }
}
