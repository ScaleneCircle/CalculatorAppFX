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
        if (display.getText() == null || display.getText().isEmpty()) {
            display.setText("0");
        }
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

        if(isUnaryOperation(operation)) {
            executeUnaryOperation(operation);
            return;
        };

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

    public boolean isUnaryOperation(String operation) {
        return operation.equals("sin") || operation.equals("cos") || operation.equals("tan") ||
                operation.equals("ln") || operation.equals("log") || operation.equals("1/x") ||
                operation.equals("|x|") || operation.equals("√") || operation.equals("x²") || operation.equals("eˣ");
    }

    public void executeUnaryOperation(String operation) {
        double currentValue = Double.parseDouble(display.getText());
        double result = switch (operation) {
            case "sin" -> Math.sin(currentValue);
            case "cos" -> Math.cos(currentValue);
            case "tan" -> Math.tan(currentValue);
            case "ln" -> Math.log(currentValue);
            case "log" -> Math.log10(currentValue);
            case "1/x" -> 1 / currentValue;
            case "|x|" -> Math.abs(currentValue);
            case "√" -> Math.sqrt(currentValue);
            case "x²" -> Math.pow(currentValue, 2);
            case "eˣ" -> Math.pow(Math.E, currentValue);
            default -> currentValue;
        };
        display.setText(formatResult(result));
        startNewNumber = true;
    }

    public void insertConstant(String constant) {
        double value = switch (constant) {
            case "π" -> Math.PI;
            case "e" -> Math.E;
            default -> 0;
        };
        display.setText(formatResult(value));
        startNewNumber = true;
    }

    /**
     * This functions executes the calculation and displays the results back on the screen
     */
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

    public void negate() {
        String current = display.getText().trim();

        if (current.isEmpty() || current.equals("0")) {
            return;
        }

        if (!pendingOperation.isEmpty() && startNewNumber) {
            firstOperand = -firstOperand;
            display.setText(String.valueOf(firstOperand));
            return;
        }

        if (current.startsWith("-")) {
            display.setText(current.substring(1));
        } else {
            display.setText("-" + current);
        }
    }

    private String formatResult(double value) {
        if (value % 1 == 0 && Math.abs(value) < 1e10) {
            return String.valueOf((long) value);
        } else {
            return String.valueOf(value);
        }
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
            case "xʸ" -> Math.pow(a, b);
            default -> b;
        };
    }
}
