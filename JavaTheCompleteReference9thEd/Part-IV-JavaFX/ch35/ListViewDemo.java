
import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.collections.*;
import javafx.beans.value.*;

public class ListViewDemo extends Application {

  Label response;

  public static void main(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){
    stage.setTitle("list view");

    FlowPane rootNode = new FlowPane(10, 10);

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 350, 220);

    stage.setScene(scene);

    response = new Label("Select transport type");

    ObservableList<String> transportTypes =
                    FXCollections.observableArrayList("Trains", "Planes", "Automobiles");

    ListView<String> lvTransport = new ListView<String>(transportTypes);

    lvTransport.setPrefSize(90, 90);

    MultipleSelectionModel<String> lvSelMod = lvTransport.getSelectionModel();

    lvSelMod.selectedItemProperty().addListener(new ChangeListener<String>(){
      @Override
      public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal){
        response.setText("Transport selected: " + newVal);
      }
    });

    rootNode.getChildren().addAll(lvTransport, response);

    stage.show();
  }
}
