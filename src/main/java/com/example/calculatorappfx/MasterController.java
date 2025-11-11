package com.example.calculatorappfx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MasterController {
    @FXML
    private Pane calculatorPane;

    @FXML
    private Pane converterPane;

    @FXML
    private Pane scientificPane;

    @FXML
    private Pane rootPane;

    @FXML
    private TextField display;

    private CalculateHelper helper;

    private double firstOperand = 0;
    private String pendingOperation = "";
    private boolean startNewNumber = true;

    /**
     * Starts the default view of the calculator (at the basic calculator pane)
     */
    @FXML
    public void initialize() {
        helper = new CalculateHelper(display);
        switchToCalculator();
    }

    /**
     * Switches the currently visible pane to the basic calculator and resizes the window
     */
    @FXML
    public void switchToCalculator() {
        calculatorPane.setVisible(true);
        calculatorPane.setManaged(true);
        converterPane.setVisible(false);
        converterPane.setManaged(false);
        scientificPane.setVisible(false);
        scientificPane.setManaged(false);

        Platform.runLater(() -> resizeStageTo(calculatorPane));
    }

    /**
     * Switches the currently visible pane to the unit converter and resizes the window
     */
    @FXML
    public void switchToConverter() {
        calculatorPane.setVisible(false);
        calculatorPane.setManaged(false);
        converterPane.setVisible(true);
        converterPane.setManaged(true);
        scientificPane.setVisible(false);
        scientificPane.setManaged(false);

        Platform.runLater(() -> resizeStageTo(converterPane));
    }

    /**
     * Switches the currently visible pane to the scientific calculator and resizes the window
     */
    @FXML
    public void switchToScientific() {
        calculatorPane.setVisible(false);
        calculatorPane.setManaged(false);
        scientificPane.setVisible(true);
        scientificPane.setManaged(true);
        converterPane.setVisible(false);
        converterPane.setManaged(false);

        Platform.runLater(() -> resizeStageTo(scientificPane));
    }

    /**
     * This function handles any number being clicked and adds it to the display
     * @param event - any number button being clicked
     */
    @FXML
    private void handleNumber(ActionEvent event) {
        Button btn = (Button) event.getSource();
        helper.append(btn.getText());
    }

    /**
     * This function handles any operator button being clicked and adds it to the display
     * @param event - any operation button being clicked
     */
    @FXML
    private void handleOperator(ActionEvent event) {
        Button btn = (Button) event.getSource();
        helper.setOperation(btn.getText());
    }

    /**
     * This function handles the event of the equals button being clicked and calls the method to evaluate the display
     * @param event - the '=' button being clicked
     */
    @FXML
    private void handleEquals(ActionEvent event) {
        helper.calculateResult();
    }

    /**
     * This function handles the event of the clear button being clicked and clears the display textfield
     * @param event - the 'C' button being clicked
     */
    @FXML
    private void handleClear(ActionEvent event) {
        helper.clear();
    }

    /**
     * This function resizes the display window based on the pane currently visible.
     *  - The Scientific Calculator Pane is wider than the other two
     *  - The Unit Converter Pane is slightly longer than the basic calculator
     * @param pane - which pane the window is being resized for (Basic, Scientific, Unit)
     */
    private void resizeStageTo(Node pane) {
        Stage stage = (Stage) rootPane.getScene().getWindow();
        stage.sizeToScene();
    }
}
