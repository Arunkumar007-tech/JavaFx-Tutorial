package arun.example;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.skin.LabelSkin;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

class Student{
    SimpleStringProperty name;
    SimpleStringProperty age;
    SimpleStringProperty Gender;
    SimpleStringProperty Dept;

    public Student(String a, String b, String c, String d){
        this.name=new SimpleStringProperty(a);
        this.age=new SimpleStringProperty(b);
        this.Gender=new SimpleStringProperty(c);
        this.Dept=new SimpleStringProperty(d);
    }

    public String getName() {
        return name.get();
    }
    public String getage(){
        return age.get();
    }
    public String getGender(){
        return Gender.get();
    }
    public SimpleStringProperty getDept(){
        return Dept;
    }
}
public class App extends Application {
    @Override
    public void start(Stage stage) {
        TableView<Student> table=new TableView<>();
        TableColumn<Student, String> nameCol = new TableColumn<>("Name");
        TableColumn<Student,String> agecol=new TableColumn<>("Age");
        TableColumn<Student,String> gendercol=new TableColumn<>("Gender");
        TableColumn<Student,String> deptcol=new TableColumn<>("Department");
        nameCol.setCellValueFactory(data -> data.getValue().name);
        agecol.setCellValueFactory(data -> data.getValue().age);
        deptcol.setCellValueFactory(data->data.getValue().getDept());
        gendercol.setCellValueFactory(data->data.getValue().Gender);

        table.getColumns().addAll(nameCol,agecol,gendercol,deptcol);
        TextField name=new TextField();
        TextField age=new TextField();
        TextField gender=new TextField();
        TextField dept=new TextField();
        ObservableList<Student> data=FXCollections.observableArrayList();

        Button add=new Button("Add Student");
        add.setOnAction(e->{
            data.add(new Student(name.getText(),age.getText(),gender.getText(),dept.getText()));
            table.setItems(data);
        });
        Button clear=new Button("Clear");
        clear.setOnAction(e->{
            name.clear();
            age.clear();
            gender.clear();
            dept.clear();
            data.clear();
        });
        VBox root=new VBox(10,new Label("name:"),name,
                new Label("age:"),age,
                new Label("Gender:"),gender,
                new Label("Department:"),dept,
                add,clear,table
        );
        Scene scene=new Scene(root,600,400);
        stage.setScene(scene);
        stage.setTitle("Student form");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
