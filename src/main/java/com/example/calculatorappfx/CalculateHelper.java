package com.example.calculatorappfx;

import javafx.scene.control.TextField;

/**
 * Helper class for Basic and Scientific Calculator. It handles all the calculations and passes the
 * results forward to the Master controller to be displayed
 */
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
     * This function handles the backspace button, deleting any user input one space at a time.
     * If the input would be fully cleared it sets the text to 0
     */
    public void backspace() {
        String curr = display.getText();
        if( curr.isEmpty() || curr.equals("0")) {
            return;
        }

        if(curr.length() == 1 || curr.equals("-")) {
            display.setText("0");
            startNewNumber = true;
            return;
        }

        String back = curr.substring(0, curr.length() - 1);

        if(back.equals("-")){
            display.setText("0");
            startNewNumber = true;
        } else {
            display.setText(back);
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

    /**
     * This function checks if the current operation is a unary operation
     * @param operation - the operation being checked
     * @return - true if unary, false if not
     */
    public boolean isUnaryOperation(String operation) {
        return operation.equals("sin") || operation.equals("cos") || operation.equals("tan") ||
                operation.equals("sin⁻¹") || operation.equals("cos⁻¹") || operation.equals("tan⁻¹") ||
                operation.equals("sinh") || operation.equals("cosh") || operation.equals("tanh") ||
                operation.equals("sinh⁻¹") || operation.equals("cosh⁻¹") || operation.equals("tanh⁻¹") ||
                operation.equals("ln") || operation.equals("log") || operation.equals("1/x") ||
                operation.equals("2ˣ") || operation.equals("x³") || operation.equals("x!") || operation.equals("³√") ||
                operation.equals("|x|") || operation.equals("√") || operation.equals("x²") || operation.equals("eˣ");
    }

    /**
     * This function executes Unary operations (those which only require one number to have been entered) and sets
     * the display to the result
     * @param operation - the operation to execute
     */
    public void executeUnaryOperation(String operation) {
        double currentValue = Double.parseDouble(display.getText());
        double result = switch (operation) {
            case "sin" -> Math.sin(currentValue);
            case "cos" -> Math.cos(currentValue);
            case "tan" -> Math.tan(currentValue);
            case "sin⁻¹" -> Math.asin(currentValue);
            case "cos⁻¹" -> Math.acos(currentValue);
            case "tan⁻¹" -> Math.atan(currentValue);
            case "sinh" -> Math.sinh(currentValue);
            case "cosh" -> Math.cosh(currentValue);
            case "tanh" -> Math.tanh(currentValue);
            case "sinh⁻¹" -> Math.log(currentValue + Math.sqrt(currentValue * currentValue + 1));
            case "cosh⁻¹" -> Math.log(currentValue + Math.sqrt(currentValue * currentValue - 1));
            case "tanh⁻¹" -> 0.5 * Math.log((1 + currentValue) / (1 - currentValue));
            case "ln" -> Math.log(currentValue);
            case "log" -> Math.log10(currentValue);
            case "1/x" -> 1 / currentValue;
            case "|x|" -> Math.abs(currentValue);
            case "2ˣ" -> Math.pow(2, currentValue);
            case "√" -> Math.sqrt(currentValue);
            case "³√" -> Math.cbrt(currentValue);
            case "x²" -> Math.pow(currentValue, 2);
            case "x³" -> Math.pow(currentValue, 3);
            case "eˣ" -> Math.pow(Math.E, currentValue);
            case "x!" -> factorial(currentValue);
            default -> currentValue;
        };
        display.setText(formatResult(result));
        startNewNumber = true;
    }

    /**
     * Helper function for Unary Operation to handle factorials
     * @param x - the number which the factorial is being taken of
     * @return - the result of the x!
     */
    private double factorial(double x) {
        if(x < 0) return Double.NaN;
        if(x == 0 || x == 1) return 1;
        if(x != Math.floor(x)) return Double.NaN;
        if(x > 170) return Double.POSITIVE_INFINITY;

        double factorial = 1;
        for(int i = 2; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Handles constants being added to the display
     * @param constant - the  constant that was pressed
     */
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

    /**
     * This functions handles the negate button. If a number is currently positive it makes it negative
     * and if its currently negative it makes it positive. It updates the display by adding/removing the '-' character
     * based on the result
     */
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

    /**
     * Formats the result so it is not in float format if only ints were entered
     * @param value - value to format
     * @return - formatted result to display
     */
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
