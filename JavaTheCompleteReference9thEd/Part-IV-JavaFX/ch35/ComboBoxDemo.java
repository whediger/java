
import javafx.application.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.collections.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class ComboBoxDemo extends Application {

  ComboBox<String> cbTransport;
  Label response;

  public static void main(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){
    stage.setTitle("combo boxes");

    FlowPane rootNode = new FlowPane(10, 10);

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 280, 120);

    stage.setScene(scene);

    response = new Label();

    ObservableList<String> transportTypes =
                  FXCollections.observableArrayList("Trains", "Planes", "Automobiles");

    cbTransport = new ComboBox<String>(transportTypes);

    cbTransport.setValue("Train");

    response.setText("Selected transport is: " + cbTransport.getValue());

    cbTransport.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent ae){
        response.setText("Selected transport is: " + cbTransport.getValue());
      }
    });

    rootNode.getChildren().addAll(cbTransport, response);

    stage.show();
  }
}
