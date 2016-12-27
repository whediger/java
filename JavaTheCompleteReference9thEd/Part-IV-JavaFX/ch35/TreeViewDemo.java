
import javafx.application.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.beans.value.*;

public class TreeViewDemo extends Application {

  Label response;

  public static void main(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){

    stage.setTitle("tree demo");

    FlowPane rootNode = new FlowPane(10,10);

    rootNode.setAlignment(Pos.CENTER);

    Scene scene = new Scene(rootNode, 310, 460);

    stage.setScene(scene);

    response = new Label("No Selection");

    TreeItem<String> tiRoot = new TreeItem<String>("Food");

    TreeItem<String> tiFruit = new TreeItem<String>("Fruit");

    TreeItem<String> tiApples = new TreeItem<String>("Apples");

    tiApples.getChildren().add(new TreeItem<String>("Fugi"));
    tiApples.getChildren().add(new TreeItem<String>("Red"));
    tiApples.getChildren().add(new TreeItem<String>("yellow"));

    tiFruit.getChildren().add(tiApples);
    tiFruit.getChildren().add(new TreeItem<String>("Pears"));
    tiFruit.getChildren().add(new TreeItem<String>("Oranges"));

    tiRoot.getChildren().add(tiFruit);

    TreeItem<String> tiVegtables = new TreeItem<String>("Vegtables");
    tiVegtables.getChildren().add(new TreeItem<String>("Corn"));
    tiVegtables.getChildren().add(new TreeItem<String>("Peas"));
    tiVegtables.getChildren().add(new TreeItem<String>("Broccoli"));
    tiVegtables.getChildren().add(new TreeItem<String>("beans"));
    tiRoot.getChildren().add(tiVegtables);

    TreeItem<String> tiNuts = new TreeItem<String>("Nuts");
    tiNuts.getChildren().add(new TreeItem<String>("Walnuts"));
    tiNuts.getChildren().add(new TreeItem<String>("Peanuts"));
    tiNuts.getChildren().add(new TreeItem<String>("Pecans"));
    tiRoot.getChildren().add(tiNuts);

    TreeView<String> tvFood = new TreeView<String>(tiRoot);

    MultipleSelectionModel<TreeItem<String>> tvSelModel = tvFood.getSelectionModel();

    tvSelModel.selectedItemProperty().addListener(new ChangeListener<TreeItem<String>>(){
      @Override
      public void changed(
      ObservableValue<? extends TreeItem<String>> changed, TreeItem<String> oldVal, TreeItem<String> newVal){
        if(newVal != null) {
          String path = newVal.getValue();
          TreeItem<String> tmp = newVal.getParent();
          while(tmp != null){
            path = tmp.getValue() + " -> " + path;
            tmp = tmp.getParent();
          }
          response.setText("Selection is " + newVal.getValue() + "\nComplete path is " + path);
        }
      }
    });
    rootNode.getChildren().addAll(tvFood, response);

    stage.show();
  }
}
