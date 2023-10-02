module com.github.yoruhinda.clickcount {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.github.yoruhinda.clickcount to javafx.fxml;
    exports com.github.yoruhinda.clickcount;
}