package com.example;

import java.time.LocalDate;
import java.util.Date;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application{

    @Override
    public void start(Stage stage){

        TextField name=new TextField();
        TextField email=new TextField();
        ToggleGroup gender=new ToggleGroup();
        RadioButton rb1=new RadioButton("male");
        RadioButton rb2=new RadioButton("Female");
        rb1.setToggleGroup(gender);
        rb2.setToggleGroup(gender);

        PasswordField pass=new PasswordField();
        ComboBox<String> dept=new ComboBox<String>();
       
        dept.getItems().addAll("CSE","EEE","ECE");
        Button submit=new Button("Submit");
        GridPane grid=new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(10));
        grid.add(new Label("Full name:"), 0, 0);
        grid.add(name, 1, 0);
        grid.add(new Label("Email"), 0, 1);
        grid.add(email, 1, 1);
        grid.add(new Label("Password"), 0, 2);
        grid.add(pass, 1, 2);
        grid.add(new Label("Gender"), 0, 3);
        grid.add(rb1, 1, 3);
        grid.add(rb2, 2, 3);
        grid.add(new Label("Department"), 0, 4);
        grid.add(dept, 1, 4);
        grid.add(submit, 0, 5);
        
        Label Result=new Label();
        submit.setOnAction(e->{
            String text="Full Name: ";
            text+=name.getText()+"\n";
            text+="Email:"+email.getText()+"\n";
            RadioButton select=(RadioButton) gender.getSelectedToggle();
            text+="Gender:"+select.getText()+"\n";
            text+="Dept:"+dept.getSelectionModel().getSelectedItem();

            Result.setText(text);
        });
        VBox root=new VBox(10,grid,Result);
        Scene scene=new Scene(root,300,600);
        stage.setScene(scene);
        stage.setTitle("Form Assignment");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }


}