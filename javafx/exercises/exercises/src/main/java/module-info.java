module com.mschmidl.javafx.exercises {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mschmidl.javafx.exercises to javafx.fxml;
    exports com.mschmidl.javafx.exercises;
    exports com.mschmidl.javafx.exercises.fishandsharks;
}