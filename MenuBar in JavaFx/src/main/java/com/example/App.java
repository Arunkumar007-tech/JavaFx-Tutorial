package com.example;

import java.time.LocalDate;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application{

    @Override
    public void start(Stage stage){
        MenuBar menuBar=new MenuBar();
        Menu file=new Menu("file");
        MenuItem newfile=new MenuItem("New");
        MenuItem exit=new MenuItem("Exit");
        file.getItems().addAll(newfile,exit);
        menuBar.getMenus().add(file);

        Label result=new Label("Choose a menu Option:");
        newfile.setOnAction(e->{
            result.setText("New file created!");
        });
        exit.setOnAction(e->{
            stage.close();
        });

        VBox root=new VBox(menuBar,result);
        Scene scene=new Scene(root,300,500);
        stage.setScene(scene);
        stage.setTitle("Menubar example");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }


}