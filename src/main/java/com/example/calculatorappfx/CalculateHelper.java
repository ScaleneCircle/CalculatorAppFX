package com.example.calculatorappfx;

import javafx.scene.control.TextField;

public class CalculateHelper {

    private TextField display;

    private double firstOperand = 0;
    private String pendingOperation = "";
    private boolean startNewNumber = true;

    /**
     * The default display setting
     * @param display - the text in the display
     */
    public CalculateHelper(TextField display) {
        this.display = display;
        display.setEditable(false); // user cannot type
        display.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        display.setText("");
    }

    /**
     * This function appends a number/decimal point to the display
     * @param value - the value clicked
     */
    public void append(String value) {
        if (startNewNumber) {
            display.setText(value.equals(".") ? "0." : value);
            startNewNumber = false;
        } else {
            if (value.equals(".") && display.getText().contains(".")) return;
            display.setText(display.getText() + value);
        }
    }

    /**
     * This functions sets the current operation
     * @param operation - the operation that was clicked
     */
    public void setOperation(String operation) {
        double currentNumber = Double.parseDouble(display.getText());

        if (!pendingOperation.isEmpty()) {
            firstOperand = doCalculation(firstOperand, currentNumber, pendingOperation);
            display.setText(String.valueOf(firstOperand));
        } else {
            firstOperand = currentNumber;
        }

        pendingOperation = operation;
        startNewNumber = true;
    }

    /**
     * This functions executes the calculation and displays the results back on the screen
     */
    //TODO: When number is returned check if after decimal is 0 and return as int
    public void calculateResult() {
        if (!pendingOperation.isEmpty()) {
            double secondOperand = Double.parseDouble(display.getText());
            firstOperand = doCalculation(firstOperand, secondOperand, pendingOperation);
            if(firstOperand % 1 == 0){
                display.setText(String.valueOf((int)firstOperand));
            } else {
                display.setText(String.valueOf(firstOperand));
            }
            pendingOperation = "";
            startNewNumber = true;
        }
    }

    /**
     * Clears the display and resets the variables tracking the display
     */
    public void clear() {
        display.setText("0");
        firstOperand = 0;
        pendingOperation = "";
        startNewNumber = true;
    }

    /**
     * The main calculte function, it evaluates the current expression
     * @param a - the first number
     * @param b - the second number
     * @param operation - the operation
     * @return - the result of the evaluation
     */
    private double doCalculation(double a, double b, String operation) {
        return switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "x" -> a * b;
            case "/" -> a / b;
            case "%" -> a % b;
            // Scientific functions (operate on a single number)
            case "sin" -> Math.sin(b);
            case "cos" -> Math.cos(b);
            case "tan" -> Math.tan(b);
            case "ln" -> Math.log(b);
            case "log" -> Math.log10(b);
            case "1/x" -> 1 / b;
            case "|x|" -> Math.abs(b);
            case "π" -> Math.PI;
            case "e" -> Math.E;
            default -> b; // fallback for unknown operations
        };
    }
}
