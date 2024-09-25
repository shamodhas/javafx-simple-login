module lk.ijse.gdse.simplelogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.gdse.simplelogin.controller to javafx.fxml;
    exports lk.ijse.gdse.simplelogin;
}