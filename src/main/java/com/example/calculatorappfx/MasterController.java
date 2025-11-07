package com.example.calculatorappfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class MasterController {
    @FXML
    private Pane calculatorPane;

    @FXML
    private Pane converterPane;

    @FXML
    private Pane scientificPane;

    @FXML
    private CalculatorController calculatorController;

    @FXML
    private ConverterController converterController;

    @FXML
    private ScientificController scientificController;

    @FXML
    public void initialize() {
        switchToCalculator();
    }

    @FXML
    public void switchToCalculator() {
        calculatorPane.setVisible(true);
        converterPane.setVisible(false);
        //scientificPane.setVisible(false);
    }

    @FXML
    public void switchToConverter() {
        calculatorPane.setVisible(false);
        converterPane.setVisible(true);
        //scientificPane.setVisible(false);
    }

}
