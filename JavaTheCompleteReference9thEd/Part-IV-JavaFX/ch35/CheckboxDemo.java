
import javafx.application.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class CheckboxDemo extends Application {
  CheckBox cbWeb;
  CheckBox cbDesktop;
  CheckBox cbMobile;

  Label response;
  Label allTargets;

  String targets = "";

  public static void main(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){
    stage.setTitle("checkboxes 8P");

    FlowPane rootNode = new FlowPane();

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 230, 140);

    stage.setScene(scene);

    Label heading = new Label("Select deployment options");

    response = new Label("no deployment selected");

    allTargets = new Label("Target list <none>");

    cbWeb = new CheckBox("Web");
    cbDesktop = new CheckBox("Desktop");
    cbMobile = new CheckBox("Mobile");

    cbWeb.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        if(cbWeb.isSelected())
          response.setText("Web Deployment selected");
        else
          response.setText("Web Deployment cleared");

        showAll();
      }
    });

    cbDesktop.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        if(cbDesktop.isSelected())
          response.setText("Desktop Deployment selected");
        else
          response.setText("Desktop Deployment cleared");

        showAll();
      }
    });

    cbMobile.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        if(cbMobile.isSelected())
          response.setText("Mobile Deployment selected");
        else
          response.setText("Mobile Deployment cleared");

        showAll();
      }
    });

    Separator sep = new Separator();
    sep.setPrefWidth(200);

    rootNode.getChildren().addAll(heading, cbWeb, cbDesktop, cbMobile, sep, response, allTargets);

    stage.show();
  }

  void showAll(){
    targets = "";
    if(cbWeb.isSelected()) targets += "Web ";
    if(cbDesktop.isSelected()) targets += "Desktop ";
    if(cbMobile.isSelected()) targets += "Mobile";

    if(targets.equals("")) targets = "<none>";

    allTargets.setText("Target List: " + targets);
  }
}
