package com.example;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage){
        Label label=new Label("Select you birthday:");
        DatePicker datapic=new DatePicker();
        Label result=new Label();

        datapic.setOnAction(e->{
            LocalDate date=datapic.getValue();
            result.setText("YOu selected: "+date.toString());
        });

        VBox root=new VBox(10,label,datapic,result);
        Scene scene=new Scene(root,500,800);
        stage.setScene(scene);
        stage.setTitle("Date Picker Demo");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }


}