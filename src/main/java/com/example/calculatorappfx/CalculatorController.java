package com.example.calculatorappfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class CalculatorController {

    @FXML
    private TextField display;

    @FXML
    private GridPane buttonGrid;

    private VBox pane;

    public CalculatorController(VBox pane) {
        this.pane = pane;
        // Attach listeners or initialize buttons here if needed
    }

    @FXML
    private void handleNumberClick(javafx.event.ActionEvent event) {
        Button button = (Button) event.getSource();
        display.appendText(button.getText());
    }
}