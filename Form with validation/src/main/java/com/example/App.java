package com.example;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage){
        TextField name=new TextField();
        PasswordField pass=new PasswordField();
        Button btn=new Button("Login");
        Label result=new Label();
        btn.setOnAction(e->{
            if(name.getText().length()!=0 && pass.getText().length()!=0){
                result.setText("Welcome ,"+name.getText()+"!");
            }
            else {
                result.setText("Field cannot be Empty");
            }
        });

        HBox h1=new HBox(new Label("Username : "),name);
        HBox h2=new HBox(new Label("Password: "),pass);
        VBox root=new VBox(10,h1,h2,btn,result);
        Scene scene=new Scene(root,600,600);
        stage.setScene(scene);
        stage.setTitle("Login with validation");
        stage.show();
  
    }
    public static void main(String[] args) {
        launch(args);
    }


}