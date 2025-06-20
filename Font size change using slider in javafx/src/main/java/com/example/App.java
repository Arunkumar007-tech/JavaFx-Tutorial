package com.example;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage){
        Label label=new Label("Adjust font size!");
        Slider slider=new Slider(10,40,16);
        label.setFont(Font.font(slider.getValue()));
        slider.valueProperty().addListener((obs,oldv,newv)->{
            label.setFont(Font.font(newv.doubleValue()));
        });
        VBox root=new VBox(10,slider,label);
        root.setPadding(new Insets(10));
        Scene scene=new Scene(root,300,500);
        stage.setScene(scene);
        stage.setTitle("Slider font Resizer");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }


}