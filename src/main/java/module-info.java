module arun.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens arun.example to javafx.fxml;
    exports arun.example;
}
