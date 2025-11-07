package com.example.calculatorappfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class ScientificController {

    @FXML
    private TextField sciDisplay;

    @FXML
    private GridPane sciGrid;

    private VBox pane;

    public ScientificController(VBox pane) {
        this.pane = pane;
        // Attach listeners or initialize buttons here if needed
    }

    @FXML
    private void handleSciFunction(javafx.event.ActionEvent event) {
        Button button = (Button) event.getSource();
        String function = button.getText();
        // Handle scientific functions like sin, cos, sqrt
    }
}
