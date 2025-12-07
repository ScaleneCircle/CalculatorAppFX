package com.example.calculatorappfx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * This class is responsible for managing the UI. It switches visible panes and buttons as well as manages button press
 * actions and displays
 */
public class MasterController {
    //UI Panes for the calculators
    @FXML
    public Pane calculatorPane;

    @FXML
    public Pane converterPane;

    @FXML
    public Pane scientificPane;

    @FXML
    public Pane rootPane;

    // Displays for the calculators
    @FXML
    public TextField basicDisplay;

    @FXML
    public TextField scientificDisplay;

    @FXML
    public TextField inputDisplay;

    @FXML
    public TextField outputDisplay;

    @FXML
    public TextField activeDisplay;

    //Unit converter specific settings
    @FXML
    public ComboBox<String> fromUnit;

    @FXML
    public ComboBox<String> toUnit;

    @FXML
    public ComboBox<String> category;

    // Scientific Calculator Buttons switched by toggle
    @FXML
    private Button sinButton;
    @FXML
    private Button cosButton;
    @FXML
    private Button tanButton;
    @FXML
    private Button lnButton;
    @FXML
    private Button logButton;
    @FXML
    private Button reciprocalButton;
    @FXML
    private Button expButton;
    @FXML
    private Button squareButton;
    @FXML
    private Button powerButton;
    @FXML
    private Button absButton;
    @FXML
    private Button piButton;
    @FXML
    private Button eButton;
    @FXML
    private Button sqrtButton;

    private boolean showingAltFunctions = false;

    //Helpers that manage the buttons/ui for each calculator
    public CalculateHelper basicHelper;

    public CalculateHelper scientificHelper;

    public ConverterHelper converterHelper;


    /**
     * Starts the default view of the calculator (at the basic calculator pane)
     */
    @FXML
    public void initialize() {
        basicHelper = new CalculateHelper(basicDisplay);

        scientificHelper = new CalculateHelper(scientificDisplay);

        converterHelper = new ConverterHelper(
                inputDisplay,
                outputDisplay,
                fromUnit,
                toUnit,
                category
        );

        // Set up listeners
        category.setOnAction(e -> converterHelper.updateUnitCombos());
        inputDisplay.textProperty().addListener((obs, old, val) ->
                { if ( activeDisplay == inputDisplay) {
                    performConversion();
                }});
        outputDisplay.textProperty().addListener((obs, old, val) -> {
            if (activeDisplay == outputDisplay) {
                performConversion();
            }
        });
        fromUnit.setOnAction(e -> performConversion());
        toUnit.setOnAction(e -> performConversion());

        activeDisplay = inputDisplay;

        switchToCalculator();
    }

    private CalculateHelper getCurrentHelper(){
        if (scientificPane.isVisible()) {
            return scientificHelper;
        } else {
            return basicHelper;
        }
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
        getCurrentHelper().append(btn.getText());
    }

    /**
     * This function handles any unit being converted and passes in the display value to be converted and displayed
     * on the opposite display
     * @param event - A number being entered in a converter display
     */
    @FXML
    private void handleNumberConvert(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String curr = activeDisplay.getText();
        if( btn.getText().equals(".") && curr.contains(".")) return;
        activeDisplay.setText(curr + btn.getText());
    }

    /**
     * This function negates the current number
     * @param event - Negate button being clicked
     */
    @FXML
    private void negate(ActionEvent event) {
        getCurrentHelper().negate();
    }

    /**
     * This function is identical to negate except it is for the Unit Converter, so it negates both values (If applicable)
     * @param event - Negate button being clicked
     */
    @FXML
    private void negateConvert(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String curr = activeDisplay.getText();
        if(curr.startsWith("-")) {
            activeDisplay.setText(curr.substring(1));
        } else {
            activeDisplay.setText("-" + curr);
        }
    }

    /**
     * This function does a backspace on the current number being displayed
     * @param event - the backspace button being clicked
     */
    @FXML
    private void back(ActionEvent event) {
        getCurrentHelper().backspace();
    }

    /**
     * This function is identical to backspace except for the Unit Converter so it backspaces from both displays
     * @param event - Backspace being clicked
     */
    @FXML
    private void backConvert(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String curr = activeDisplay.getText();
        if(!curr.isEmpty()) {
            activeDisplay.setText(curr.substring(0, curr.length() - 1));
        }
    }

    /**
     * This function handles any operator button being clicked and adds it to the display
     * @param event - any operation button being clicked
     */
    @FXML
    private void handleOperator(ActionEvent event) {
        Button btn = (Button) event.getSource();
        getCurrentHelper().setOperation(btn.getText());
    }

    /**
     * This function handles one of the constant buttons being clicked and adds that constant to the display
     * @param event - one of the constant buttons being clicked
     */
    @FXML
    private void handleConstant(ActionEvent event) {
        Button btn = (Button) event.getSource();
        getCurrentHelper().insertConstant(btn.getText());
    }

    /**
     * This function handles the event of the equals button being clicked and calls the method to evaluate the display
     * @param event - the '=' button being clicked
     */
    @FXML
    private void handleEquals(ActionEvent event) {
        getCurrentHelper().calculateResult();
    }

    /**
     * This function handles the event of the clear button being clicked and clears the display textfield
     * @param event - the 'C' button being clicked
     */
    @FXML
    private void handleClear(ActionEvent event) {
        if(converterPane.isVisible()){
            converterHelper.clear();
        }else {
            getCurrentHelper().clear();
        }
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

    /**
     * Swaps the current 'input' and 'output' display so the user can switch which display they type into.
     * It also centers the users cursor into the swapped display so they know which one they can edit
     * @param event - User clicking one of the two swap buttons (↑ and ↓)
     */
    @FXML
    private void handleSwap(ActionEvent event) {
        if(activeDisplay == inputDisplay){
            activeDisplay = outputDisplay;
            outputDisplay.setEditable(true);
            inputDisplay.setEditable(false);
            outputDisplay.requestFocus();
            outputDisplay.positionCaret(outputDisplay.getText().length());
        } else {
            activeDisplay = inputDisplay;
            inputDisplay.setEditable(true);
            outputDisplay.setEditable(false);
            inputDisplay.requestFocus();
            inputDisplay.positionCaret(inputDisplay.getText().length());
        }
    }

    /**
     * Calls the helper method from ConverterHelper to do the conversion between the entered numbers
     */
    private void performConversion() {
        if(activeDisplay == inputDisplay) {
            converterHelper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        } else {
            converterHelper.convert(outputDisplay, inputDisplay, toUnit.getValue(), fromUnit.getValue());
        }
    }

    /**
     * This function handles the double arrow button in scientific calculator that toggles to display more options
     * @param event - the toggle button being clicked
     */
    @FXML
    private void handleToggle(ActionEvent event) {
        showingAltFunctions = !showingAltFunctions;

        if(showingAltFunctions) {
            sinButton.setText("sin⁻¹");
            cosButton.setText("cos⁻¹");
            tanButton.setText("tan⁻¹");
            lnButton.setText("sinh");
            logButton.setText("cosh");
            reciprocalButton.setText("tanh");
            squareButton.setText("sinh⁻¹");
            powerButton.setText("cosh⁻¹");
            expButton.setText("tanh⁻¹");
            absButton.setText("2ˣ");
            piButton.setText("x³");
            eButton.setText("x!");
            sqrtButton.setText("³√");
        } else {
            sinButton.setText("sin");
            cosButton.setText("cos");
            tanButton.setText("tan");
            lnButton.setText("ln");
            logButton.setText("log");
            reciprocalButton.setText("1/x");
            squareButton.setText("x²");
            powerButton.setText("xʸ");
            expButton.setText("eˣ");
            absButton.setText("|x|");
            piButton.setText("π");
            eButton.setText("e");
            sqrtButton.setText("√");
        }
    }
}
