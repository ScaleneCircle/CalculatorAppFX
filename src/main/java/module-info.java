module com.example.calculatorappfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.calculatorappfx to javafx.fxml;
    exports com.example.calculatorappfx;
}