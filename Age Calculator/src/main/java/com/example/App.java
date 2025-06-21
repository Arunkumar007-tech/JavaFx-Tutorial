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
       DatePicker birthdate=new DatePicker();
       Label result=new Label();
       birthdate.setOnAction (e->{
        LocalDate date=birthdate.getValue();
        int curryear=date.now().getYear();
        int age=curryear-date.getYear();
        result.setText("You are "+age+" years old ");
       });

       HBox root=new HBox(new Label("Choose your Birth day:"),birthdate);
       VBox r1=new VBox(root,result);
       Scene scene=new Scene(r1,500,600);
       stage.setScene(scene);
       stage.setTitle("Age CalCulator");
       stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }


}