package com.example;

import java.time.LocalDate;

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
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application{

    @Override
    public void start(Stage stage){
        TextField name=new TextField();
        PasswordField pass=new PasswordField();
        Button login=new Button("Login");
        GridPane grid=new GridPane();
        grid.setPadding(new Insets(5));
        grid.setVgap(5);
        grid.setHgap(5);
        grid.add(new Label("Name: "), 0, 0);
        grid.add(name, 1, 0);
        grid.add(new Label("Password:"), 0, 1);
        grid.add(pass, 1, 1);
        grid.add(login, 1, 2);

        Label header=new Label("Welcome to login page");
        header.setFont(Font.font(16));
        BorderPane root=new BorderPane();
        root.setTop(header);
        BorderPane.setAlignment(header, Pos.CENTER);
        root.setCenter(grid);

        Scene scene=new Scene(root,500,600);
        stage.setScene(scene);
        stage.setTitle("Login form using Layout Manager Demo");
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }


}