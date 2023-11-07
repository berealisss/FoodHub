module com.example.foodhub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.foodhub to javafx.fxml;
    exports com.example.foodhub;
}