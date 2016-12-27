
import javafx.application.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;

public class MenuDemo extends Application {

  Label response;

  public static void amin(String args[])
  {
    launch(args);
  }

  @Override
  public void start(Stage stage){

    stage.setTitle("menu bar stuff");

    BorderPane rootNode = new BorderPane();

    Scene scene = new Scene(rootNode, 300, 300);

    stage.setScene(scene);

    response = new Label("Menu Demo");

    MenuBar mb = new MenuBar();

    //file menu +==]========>
    Menu fileMenu = new Menu("_File");
    MenuItem open = new MenuItem("_Open");
    MenuItem close = new MenuItem("_Close");
    MenuItem save = new MenuItem("_Save");
    MenuItem exit = new MenuItem("_Exit");
    fileMenu.getItems().addAll(open, close, save, new SeparatorMenuItem(), exit);

    mb.getMenus().add(fileMenu);

    //options menu +==]========>
    Menu optionsMenu = new Menu("Options");

    //colors menu  +==]========>
    Menu colorsMenu = new Menu("Colors");
    MenuItem red = new MenuItem("Red");
    MenuItem green = new MenuItem("Green");
    MenuItem blue = new MenuItem("Blue");

    colorsMenu.getItems().addAll(red, green, blue);
    optionsMenu.getItems().add(colorsMenu);

    //priority +==]========>
    Menu priorityMenu = new Menu("Priority");
    MenuItem high = new MenuItem("High");
    MenuItem low = new MenuItem("Low");
    priorityMenu.getItems().addAll(high, low);
    optionsMenu.getItems().add(priorityMenu);

    optionsMenu.getItems().add(new SeparatorMenuItem());

    //reset +==]========>
    MenuItem reset = new MenuItem("Reset");
    optionsMenu.getItems().add(reset);

    mb.getMenus().add(optionsMenu);

    // help +==]========>
    Menu helpMenu = new Menu("Help");
    MenuItem about = new MenuItem("About");
    helpMenu.getItems().add(about);

    mb.getMenus().add(helpMenu);

    EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent ae){
        String name = ((MenuItem)ae.getTarget()).getText();
        if(name.equals("Exit")) Platform.exit();

        response.setText(name + " selected");
      }
    };
    open.setOnAction(MEHandler);
    close.setOnAction(MEHandler);
    save.setOnAction(MEHandler);
    exit.setOnAction(MEHandler);
    red.setOnAction(MEHandler);
    green.setOnAction(MEHandler);
    blue.setOnAction(MEHandler);
    high.setOnAction(MEHandler);
    low.setOnAction(MEHandler);
    reset.setOnAction(MEHandler);
    about.setOnAction(MEHandler);

    //add accelerators +==]========>
    open.setAccelerator(KeyCombination.keyCombination("shortcut+o"));
    close.setAccelerator(KeyCombination.keyCombination("shortcut+c"));
    save.setAccelerator(KeyCombination.keyCombination("shortcut+s"));
    exit.setAccelerator(KeyCombination.keyCombination("shortcut+e"));

    rootNode.setTop(mb);
    rootNode.setCenter(response);

    stage.show();
  }
}
