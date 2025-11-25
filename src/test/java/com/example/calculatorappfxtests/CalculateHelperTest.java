package com.example.calculatorappfxtests;

import com.example.calculatorappfx.CalculateHelper;
import javafx.application.Platform;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateHelperTest {

    private CalculateHelper helper;
    private TextField display;

    @BeforeAll
    static void initToolkit() {
        try {
            Platform.startup(() -> {});
        } catch (IllegalStateException e) {
            // Toolkit already initialized, ignore
        }
    }

    @BeforeEach
    void setUp() {
        display = new TextField();
        helper = new CalculateHelper(display);
    }

    @Test
    @DisplayName("Basic Addition Tests")
    void testBasicAddition() {
        // First test: 5 + 3 = 8
        helper.append("5");
        helper.setOperation("+");
        helper.append("3");
        helper.calculateResult();
        assertEquals("8", display.getText());

        helper.clear();

        // Second test: 10 + 25 = 35
        helper.append("1");
        helper.append("0");
        helper.setOperation("+");
        helper.append("2");
        helper.append("5");
        helper.calculateResult();
        assertEquals("35", display.getText());

        helper.clear();

        // Third test: 100 + 200 = 300
        helper.append("1");
        helper.append("0");
        helper.append("0");
        helper.setOperation("+");
        helper.append("2");
        helper.append("0");
        helper.append("0");
        helper.calculateResult();
        assertEquals("300", display.getText());
    }

    @Test
    @DisplayName("Basic Subtraction Tests")
    void testBasicSubtraction() {
        //First Test: 10 - 3 = 7
        helper.append("1");
        helper.append("0");
        helper.setOperation("-");
        helper.append("3");
        helper.calculateResult();
        assertEquals("7", display.getText());

        helper.clear();

        // Second Test: 100 - 99 = 1
        helper.append("5");
        helper.append("0");
        helper.setOperation("-");
        helper.append("2");
        helper.append("5");
        helper.calculateResult();
        assertEquals("25", display.getText());

        helper.clear();

        //Third Test: 10 - 11 = -1
        helper.append("1");
        helper.append("0");
        helper.setOperation("-");
        helper.append("1");
        helper.append("1");
        helper.calculateResult();
        assertEquals("-1", display.getText());
    }

    @Test
    @DisplayName("Basic Multiplacation Tests")
    void testBasicMultiplication() {
        //First Test: 4 * 5 = 20
        helper.append("4");
        helper.setOperation("x");
        helper.append("5");
        helper.calculateResult();
        assertEquals("20", display.getText());

        helper.clear();

        //Second Test: 12 * 3 = 36
        helper.append("1");
        helper.append("2");
        helper.setOperation("x");
        helper.append("3");
        helper.calculateResult();
        assertEquals("36", display.getText());

        helper.clear();

        //Third Test: 7 * 8 = 56
        helper.append("7");
        helper.setOperation("x");
        helper.append("8");
        helper.calculateResult();
        assertEquals("56", display.getText());
    }

    @Test
    @DisplayName("Basic Division Tests")
    void testBasicDivision() {
        //First Test: 15 / 3 = 5
        helper.append("1");
        helper.append("5");
        helper.setOperation("/");
        helper.append("3");
        helper.calculateResult();
        assertEquals("5", display.getText());

        helper.clear();

        //Second Test: 100 / 10 = 10
        helper.append("1");
        helper.append("0");
        helper.append("0");
        helper.setOperation("/");
        helper.append("1");
        helper.append("0");
        helper.calculateResult();
        assertEquals("10", display.getText());

        helper.clear();

        //Third Test: 50 / 2 = 25
        helper.append("5");
        helper.append("0");
        helper.setOperation("/");
        helper.append("2");
        helper.calculateResult();
        assertEquals("25", display.getText());
    }

    @Test
    @DisplayName("Basic Mixed Equation Tests")
    void testBasicMixedEquation() {
        //First Test 5 + 3 * 2 = 16
        helper.append("5");
        helper.setOperation("+");
        helper.append("3");
        helper.setOperation("x");
        helper.append("2");
        helper.calculateResult();
        assertEquals("16", display.getText());

        helper.clear();

        //Second Test: 10 - 2 + 5 = 13
        helper.append("1");
        helper.append("0");
        helper.setOperation("-");
        helper.append("2");
        helper.setOperation("+");
        helper.append("5");
        helper.calculateResult();
        assertEquals("13", display.getText());

        helper.clear();

        //Third Test: 20 / 4 * 3 = 15
        helper.append("2");
        helper.append("0");
        helper.setOperation("/");
        helper.append("4");
        helper.setOperation("x");
        helper.append("3");
        helper.calculateResult();
        assertEquals("15", display.getText());

        helper.clear();

        //Fourth Test
        helper.append("1");
        helper.append("0");
        helper.append("0");
        helper.setOperation("-");
        helper.append("5");
        helper.append("0");
        helper.setOperation("/");
        helper.append("2");
        helper.calculateResult();
        assertEquals("25", display.getText());
    }

    @Test
    @DisplayName("Basic Decimal Testing")
    void testBasicDecimal() {
        //First Test (Decimal Addition): 5.5 + 2.5 = 8
        helper.append("5");
        helper.append(".");
        helper.append("5");
        helper.setOperation("+");
        helper.append("2");
        helper.append(".");
        helper.append("5");
        helper.calculateResult();
        assertEquals("8", display.getText());

        helper.clear();

        //Second Test (Decimal Subtraction): 10.5 - 3.2 = 7.3
        helper.append("1");
        helper.append("0");
        helper.append(".");
        helper.append("5");
        helper.setOperation("-");
        helper.append("3");
        helper.append(".");
        helper.append("2");
        helper.calculateResult();
        assertEquals("7.3", display.getText());

        helper.clear();

        //Third Test (Decimal Multiplication): 2.5 * 4 = 10
        helper.append("2");
        helper.append(".");
        helper.append("5");
        helper.setOperation("x");
        helper.append("4");
        helper.calculateResult();
        assertEquals("10", display.getText());

        helper.clear();

        //Fourth Test (Decimal Division): 7.5 / 2.5 = 3
        helper.append("7");
        helper.append(".");
        helper.append("5");
        helper.setOperation("/");
        helper.append("2");
        helper.append(".");
        helper.append("5");
        helper.calculateResult();
        assertEquals("3", display.getText());

        helper.clear();

        //Fifth Test (Decimal Division 2): 5 / 2 = 2.5
        helper.append("5");
        helper.setOperation("/");
        helper.append("2");
        helper.calculateResult();
        assertEquals("2.5", display.getText());

        helper.clear();

        // Sixth Test (Prevent Multiple Decimals)
        helper.append("5");
        helper.append(".");
        helper.append("5");
        helper.append(".");
        helper.append("3");
        assertEquals("5.53", display.getText());
    }

    @Test
    @DisplayName("Basic Negative Number Tests")
    void testBasicNegativeNumber() {
        //First Test ( Double Negation): 5 -> -5 -> 5
        helper.append("5");
        helper.negate();
        helper.negate();
        assertEquals("5", display.getText());

        helper.clear();

        //Second Test (Negative Addition): -5 + 3 = -2
        helper.append("5");
        helper.negate();
        helper.setOperation("+");
        helper.append("3");
        helper.calculateResult();
        assertEquals("-2", display.getText());

        helper.clear();

        //Third Test (Negative Subtraction): -10 - 5 = -15
        helper.append("1");
        helper.append("0");
        helper.negate();
        helper.setOperation("-");
        helper.append("5");
        helper.calculateResult();
        assertEquals("-15", display.getText());

        helper.clear();

        //Fourth Test (Negative Multiplication): -4 * 5 = -20
        helper.append("4");
        helper.negate();
        helper.setOperation("x");
        helper.append("5");
        helper.calculateResult();
        assertEquals("-20", display.getText());

        helper.clear();

        //Fifth Test (Negative Division): -15 / 3 = -5
        helper.append("1");
        helper.append("5");
        helper.negate();
        helper.setOperation("/");
        helper.append("3");
        helper.calculateResult();
        assertEquals("-5", display.getText());

        helper.clear();

        //Sixth Test (Subtracting Negative Number): 5 - -3 = 8
        helper.append("5");
        helper.setOperation("-");
        helper.append("3");
        helper.negate();
        helper.calculateResult();
        assertEquals("8", display.getText());

        helper.clear();

        //Seventh Test (Negative * Negative): -5 * -3 = 15
        helper.append("5");
        helper.negate();
        helper.setOperation("x");
        helper.append("3");
        helper.negate();
        helper.calculateResult();
        assertEquals("15", display.getText());
    }
}
