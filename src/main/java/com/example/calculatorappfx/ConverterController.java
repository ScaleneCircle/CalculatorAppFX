package com.example.calculatorappfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ConverterController {

    @FXML
    private TextField inputField;

    @FXML
    private TextField outputField;

    private VBox pane;

    public ConverterController(VBox pane) {
        this.pane = pane;
        // Attach listeners or initialize buttons here if needed
    }

    @FXML
    private void handleConvert() {
        // Example: convert input to some unit
        try {
            double input = Double.parseDouble(inputField.getText());
            double output = input * 2.54; // example: inches to cm
            outputField.setText(String.valueOf(output));
        } catch (NumberFormatException e) {
            outputField.setText("Error");
        }
    }
}
