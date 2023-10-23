module es.ieslosmontecillos.fxmltableview {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.fxmltableview to javafx.fxml;
    exports es.ieslosmontecillos.fxmltableview;
}