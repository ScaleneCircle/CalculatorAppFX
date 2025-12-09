package com.example.calculatorappfxtests;

import com.example.calculatorappfx.CalculateHelper;
import javafx.application.Platform;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTests {

    private CalculateHelper helper;
    private TextField display;

    @BeforeAll
    static void initToolkit() {
        try {
            Platform.startup(() -> {});
        } catch (IllegalStateException e) {

        }
    }

    @BeforeEach
    void setUp() {
        display = new TextField();
        helper = new CalculateHelper(display);
    }

    @Test
    @DisplayName("Trigonometric Function Tests")
    void trigonometricFunctionTests() {
        //Test One: sin(0) = 0
        helper.append("0");
        helper.setOperation("sin");
        assertEquals("0", display.getText());

        helper.clear();

        //Test Two: sin(90) = .894 rad
        helper.append("9");
        helper.append("0");
        helper.setOperation("sin");
        double result = Double.parseDouble(display.getText());
        assertEquals(1, result, 0.001);

        helper.clear();

        //Test Three: cos(0) = 1
        helper.append("0");
        helper.setOperation("cos");
        assertEquals("1", display.getText());

        helper.clear();

        //Test Four: cos(60)
        helper.append("6");
        helper.append("0");
        helper.setOperation("cos");
        double result2 = Double.parseDouble(display.getText());
        assertEquals(0.5000000000000001, result2, 0.001);

        helper.clear();

        //Test Five: tan(45)
        helper.append("4");
        helper.append("5");
        helper.setOperation("tan");
        double result3 = Double.parseDouble(display.getText());
        assertEquals(0.9999999999999999, result3, 0.001);

        helper.clear();

        //Test Six: inverse sin
        helper.append(".5");
        helper.setOperation("sin⁻¹");
        double result6 = Double.parseDouble(display.getText());
        assertEquals(Math.toDegrees(Math.asin(.5)), result6, 0.001);

        helper.clear();
        //Test Seven: inverse cos
        helper.append("1");
        helper.setOperation("cos⁻¹");
        double result7 = Double.parseDouble(display.getText());
        assertEquals(Math.acos(1), result7, 0.001);

        helper.clear();
        //Test Eight inverse tan
        helper.append("4");
        helper.append("5");
        helper.setOperation("tan⁻¹");
        double result8 = Double.parseDouble(display.getText());
        assertEquals(Math.toDegrees(Math.atan(45)), result8, 0.001);

        helper.clear();
        //Test Nine: sinh
        helper.append("4");
        helper.append("5");
        helper.setOperation("sinh");
        double result9 = Double.parseDouble(display.getText());
        assertEquals(Math.sinh(45), result9, 0.001);

        helper.clear();
        //Test ten: cosh
        helper.append("4");
        helper.append("5");
        helper.setOperation("cosh");
        double result10 = Double.parseDouble(display.getText());
        assertEquals(Math.cosh(45), result10, 0.001);

        helper.clear();
        //Test Eleven: tanh
        helper.append("4");
        helper.append("5");
        helper.setOperation("tanh");
        double result11 = Double.parseDouble(display.getText());
        assertEquals(Math.tanh(45), result11, 0.001);

        helper.clear();
        //Test Twelve: inverse sinh
        helper.append("3");
        helper.append("0");
        helper.setOperation("sinh⁻¹");
        double result12 = Double.parseDouble(display.getText());
        assertEquals(4.09462222433053, result12, 0.001);

        helper.clear();
        //Test thirteen: inverse cosh
        helper.append("4");
        helper.append("5");
        helper.setOperation("cosh⁻¹");
        double result13 = Double.parseDouble(display.getText());
        assertEquals(4.499686190671499, result13, 0.001);

        helper.clear();
        //Test Fourteen: inverse tanh
        helper.append(".5");
        helper.setOperation("tanh⁻¹");
        double result14 = Double.parseDouble(display.getText());
        assertEquals(0.5493061443340549, result14, 0.001);
    }

    @Test
    @DisplayName("Logarithmic Tests")
    void logarithmicTests() {
        //Test One: ln(1)
        helper.append("1");
        helper.setOperation("ln");
        assertEquals("0", display.getText());

        helper.clear();

        //Test Two: ln(~e)
        helper.append("2");
        helper.append(".");
        helper.append("7");
        helper.append("1");
        helper.append("8");
        helper.setOperation("ln");
        double result = Double.parseDouble(display.getText());
        assertEquals(1.0, result, 0.01);

        helper.clear();

        //Test three: log(10)
        helper.append("1");
        helper.append("0");
        helper.setOperation("log");
        assertEquals("1", display.getText());

        helper.clear();

        //Test four: log(100)
        helper.append("1");
        helper.append("0");
        helper.append("0");
        helper.setOperation("log");
        assertEquals("2", display.getText());

        helper.clear();

        //Test five: log(1000)
        helper.append("1");
        helper.append("0");
        helper.append("0");
        helper.append("0");
        helper.setOperation("log");
        assertEquals("3", display.getText());
    }

    @Test
    @DisplayName("Reciprocal Tests")
    void reciprocalTests() {
        //Test One: 1/2
        helper.append("2");
        helper.setOperation("1/x");
        assertEquals("0.5", display.getText());

        helper.clear();

        //Test Two: 1/4
        helper.append("4");
        helper.setOperation("1/x");
        assertEquals("0.25", display.getText());

        helper.clear();

        //Test Three: 1/10
        helper.append("1");
        helper.append("0");
        helper.setOperation("1/x");
        assertEquals("0.1", display.getText());
    }

    @Test
    @DisplayName("Absolute Value Tests")
    void absoluteValueTests() {
        //Test One: abs(5)
        helper.append("5");
        helper.setOperation("|x|");
        assertEquals("5", display.getText());

        helper.clear();

        //Test Two: abs(-5)
        helper.append("5");
        helper.negate();
        helper.setOperation("|x|");
        assertEquals("5", display.getText());

        helper.clear();

        //Test Three: abs(0)
        helper.append("0");
        helper.setOperation("|x|");
        assertEquals("0", display.getText());
    }

    @Test
    @DisplayName("Square Root Tests")
    void squareRootTests() {
        //Test One: sqrt(4)
        helper.append("4");
        helper.setOperation("√");
        assertEquals("2", display.getText());

        helper.clear();

        //Test Two: sqrt(16)
        helper.append("1");
        helper.append("6");
        helper.setOperation("√");
        assertEquals("4", display.getText());

        helper.clear();

        //Test Three: sqrt(9)
        helper.append("9");
        helper.setOperation("√");
        assertEquals("3", display.getText());

        helper.clear();

        //Test Four: sqrt(100)
        helper.append("1");
        helper.append("0");
        helper.append("0");
        helper.setOperation("√");
        assertEquals("10", display.getText());

        helper.clear();
        //Test Six: cube root(27)
        helper.append("27");
        helper.setOperation("³√");
        assertEquals("3", display.getText());


    }

    @Test
    @DisplayName("Constant Tests")
    void constantTests() {
        //Test One: pi
        helper.insertConstant("π");
        double result = Double.parseDouble(display.getText());
        assertEquals(Math.PI, result, 0.0001);

        helper.clear();

        //Test Two: e
        helper.insertConstant("e");
        double result2 = Double.parseDouble(display.getText());
        assertEquals(Math.E, result2, 0.0001);

        helper.clear();

        //Test Three: pi + 1
        helper.insertConstant("π");
        helper.setOperation("+");
        helper.append("1");
        helper.calculateResult();
        double result3 = Double.parseDouble(display.getText());
        assertEquals(Math.PI + 1, result3, 0.0001);

        helper.clear();

        //Test four: e * 2
        helper.insertConstant("e");
        helper.setOperation("x");
        helper.append("2");
        helper.calculateResult();
        double result4 = Double.parseDouble(display.getText());
        assertEquals(Math.E * 2, result4, 0.0001);
    }

    @Test
    @DisplayName("Exponent Tests")
    void exponentTests() {
        // squared test
        helper.append("7");
        helper.setOperation("x²");
        helper.calculateResult();
        double result = Double.parseDouble(display.getText());
        assertEquals(49, result, 0.0001);

        helper.clear();
        // cubed test
        helper.append("3");
        helper.setOperation("x³");
        double result2 = Double.parseDouble(display.getText());
        assertEquals(27, result2, 0.0001);

        helper.clear();
        // x ^ y test
        helper.append("6");
        helper.setOperation("xʸ");
        helper.append("4");
        helper.calculateResult();
        double result3 = Double.parseDouble(display.getText());
        assertEquals(1296, result3, 0.0001);

        helper.clear();
        // e ^ x test
        helper.append("3");
        helper.setOperation("eˣ");
        helper.calculateResult();
        double result4 = Double.parseDouble(display.getText());
        assertEquals(20.085536923187664, result4, 0.0001);

        helper.clear();
        // 2 ^ x test
        helper.append("8");
        helper.setOperation("2ˣ");
        helper.calculateResult();
        double result5 = Double.parseDouble(display.getText());
        assertEquals(256, result5, 0.0001);
    }


    @Test
    @DisplayName("Mixed Equation Tests")
    void mixedEquationTests() {
        //Test One: sin(30) + cos(60)
        helper.append("3");
        helper.append("0");
        helper.setOperation("sin");
        helper.setOperation("+");
        helper.append("6");
        helper.append("0");
        helper.setOperation("cos");
        helper.calculateResult();
        double result = Double.parseDouble(display.getText());
        assertEquals(1, result, 0.0001);

        helper.clear();

        //Test Two: sqrt(16) * 3 = 12
        helper.append("1");
        helper.append("6");
        helper.setOperation("√");
        helper.setOperation("x");
        helper.append("3");
        helper.calculateResult();
        assertEquals("12", display.getText());

        helper.clear();

        //Test Three: 10 + ln(e)
        helper.append("1");
        helper.append("0");
        helper.setOperation("+");
        helper.insertConstant("e");
        helper.setOperation("ln");
        helper.calculateResult();
        double result2 = Double.parseDouble(display.getText());
        assertEquals(11.0, result2, 0.01);

        helper.clear();

        //Test Four: 15 + 5!
        helper.append("1");
        helper.append("5");
        helper.setOperation("+");
        helper.append("5");
        helper.setOperation("x!");
        helper.calculateResult();
        double result3 = Double.parseDouble(display.getText());
        assertEquals(135, result3, 0.0001);
    }

}
