package com.example;

import java.time.LocalDate;
import java.util.Date;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application{

    @Override
    public void start(Stage stage){
    Label Result=new Label();

       MenuBar menu=new MenuBar();
       Menu File=new Menu("File");
       MenuItem New=new MenuItem("New");
       MenuItem Open=new MenuItem("Open");
       MenuItem save=new MenuItem("Save");
       MenuItem Exit=new MenuItem("Exit");
       File.getItems().addAll(New,Open,save,Exit);
       Exit.setOnAction(e->{
        stage.close();
       });
       New.setOnAction(e->{
        Result.setText("New File Created!");
       });
       Open.setOnAction(e->{
        Result.setText("file is Opening");
       });
       save.setOnAction(e->Result.setText("File is Saving"));

       Menu Edit=new Menu("Edit");
       MenuItem cut=new MenuItem("Cut");
       MenuItem Copy=new MenuItem("copy");
       MenuItem Paste=new MenuItem("paste");
       Edit.getItems().addAll(cut,Copy,Paste);

       menu.getMenus().addAll(File,Edit);

       cut.setOnAction(e->Result.setText("File is Cut"));
       Copy.setOnAction(e->Result.setText("File copied Successfully"));
       Paste.setOnAction(e->Result.setText("File paste Successfully"));
       VBox root=new VBox(menu,Result);
       Scene scene=new Scene(root,500,600);
       stage.setScene(scene);
       stage.setTitle("Menubar Example");
       stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }


}