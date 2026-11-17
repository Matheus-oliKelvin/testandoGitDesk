module main.testandogit {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.testandogit to javafx.fxml;
    exports main.testandogit;
}