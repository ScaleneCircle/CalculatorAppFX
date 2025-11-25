package com.example.calculatorappfxtests;

import com.example.calculatorappfx.CalculateHelper;
import com.example.calculatorappfx.ConverterHelper;
import javafx.application.Platform;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitConverterTests {

    private ConverterHelper helper;
    private TextField inputDisplay;
    private TextField outputDisplay;
    private ComboBox<String> fromUnit;
    private ComboBox<String> toUnit;
    private ComboBox<String> category;

    @BeforeAll
    static void initToolkit() {
        try {
            Platform.startup(() -> {});
        } catch (IllegalStateException e) {

        }
    }

    @BeforeEach
    void setUp() {
        inputDisplay = new TextField();
        outputDisplay = new TextField();
        fromUnit = new ComboBox<>();
        toUnit = new ComboBox<>();
        category = new ComboBox<>();

        helper = new ConverterHelper(inputDisplay, outputDisplay, fromUnit, toUnit, category);
    }

    @Test
    @DisplayName("Area tests")
    void testArea() {
        //Test One: Acre to sq ft
        category.setValue("Area");
        helper.updateUnitCombos();
        fromUnit.setValue("Acre(ac)");
        toUnit.setValue("Square Feet");
        inputDisplay.setText("1");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        assertEquals("43560", outputDisplay.getText());

        helper.clear();

        //Test Two: Square Ft to Acre
        category.setValue("Area");
        helper.updateUnitCombos();
        fromUnit.setValue("Square Feet");
        toUnit.setValue("Acre(ac)");
        inputDisplay.setText("10000");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        double result = Double.parseDouble(outputDisplay.getText());
        assertEquals(0.2296, result, 0.001);
    }

    @Test
    @DisplayName("Length Tests")
    void testLength() {
        //Test One: Mile to Ft
        category.setValue("Length");
        helper.updateUnitCombos();
        fromUnit.setValue("Mile");
        toUnit.setValue("Foot");
        inputDisplay.setText("1");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        double result = Double.parseDouble(outputDisplay.getText());
        assertEquals(5280.0, result, 0.1);

        helper.clear();

        //Test Two: Meters to Km
        category.setValue("Length");
        helper.updateUnitCombos();
        fromUnit.setValue("Meter");
        toUnit.setValue("Kilometer");
        inputDisplay.setText("100");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        assertEquals("0.1", outputDisplay.getText());

        helper.clear();

        //Test Three: Inches to Ft
        category.setValue("Length");
        helper.updateUnitCombos();
        fromUnit.setValue("Inch");
        toUnit.setValue("Foot");
        inputDisplay.setText("12");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        assertEquals("1", outputDisplay.getText());

    }

    @Test
    @DisplayName("Volume Tests")
    void testVolume() {
        //Test One: US Gallon to Liters
        category.setValue("Volume");
        helper.updateUnitCombos();
        fromUnit.setValue("US Gallons");
        toUnit.setValue("Liters");
        inputDisplay.setText("1");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        double result = Double.parseDouble(outputDisplay.getText());
        assertEquals(3.785411784, result, 0.001);

        helper.clear();

        //Test Two: Milliliters to liters
        category.setValue("Volume");
        helper.updateUnitCombos();
        fromUnit.setValue("Milliliters");
        toUnit.setValue("Liters");
        inputDisplay.setText("1000");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        assertEquals("1", outputDisplay.getText());
    }

    @Test
    @DisplayName("Mass Tests")
    void testMass() {
        //Test One: Kg to Lb
        category.setValue("Mass");
        helper.updateUnitCombos();
        fromUnit.setValue("Kilogram(kg)");
        toUnit.setValue("Pounds(lb)");
        inputDisplay.setText("1");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        double result = Double.parseDouble(outputDisplay.getText());
        assertEquals(2.2046226218, result, 0.001);

        helper.clear();

        //Test Two: Oz to Lb
        category.setValue("Mass");
        helper.updateUnitCombos();
        fromUnit.setValue("Ounces(oz)");
        toUnit.setValue("Pounds(lb)");
        inputDisplay.setText("16");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        assertEquals("1", outputDisplay.getText());
    }

    @Test
    @DisplayName("Data Tests")
    void testData() {
        //Test One: Bytes to Kibibytes
        category.setValue("Data");
        helper.updateUnitCombos();
        fromUnit.setValue("Bytes(B)");
        toUnit.setValue("Kibibytes(KiB)");
        inputDisplay.setText("1024");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        assertEquals("1", outputDisplay.getText());

        helper.clear();

        //Test Two: Kb to Mb
        category.setValue("Data");
        helper.updateUnitCombos();
        fromUnit.setValue("Kilobytes(KB)");
        toUnit.setValue("Megabytes(MB)");
        inputDisplay.setText("1000");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        assertEquals("1", outputDisplay.getText());

        helper.clear();

        //Test Three: bits to bytes
        category.setValue("Data");
        helper.updateUnitCombos();
        fromUnit.setValue("Bits(bit)");
        toUnit.setValue("Bytes(B)");
        inputDisplay.setText("8");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        assertEquals("0.1", outputDisplay.getText());
    }

    @Test
    @DisplayName("Speed Tests")
    void testSpeed() {
        //Test One: KPH to MPH
        category.setValue("Speed");
        helper.updateUnitCombos();
        fromUnit.setValue("Kilometers per hour (km/h)");
        toUnit.setValue("Miles per hour (mi/h)");
        inputDisplay.setText("100");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        double result = Double.parseDouble(outputDisplay.getText());
        assertEquals(62.137, result, 0.1);

        helper.clear();

        //Test Two: MPH to Feet per second
        category.setValue("Speed");
        helper.updateUnitCombos();
        fromUnit.setValue("Miles per hour (mi/h)");
        toUnit.setValue("Feet per second (ft/s)");
        inputDisplay.setText("60");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        assertEquals("88", outputDisplay.getText());
    }

    @Test
    @DisplayName("Time Tests")
    void testTime() {
        //Test One: Minutes to Hours
        category.setValue("Time");
        helper.updateUnitCombos();
        fromUnit.setValue("Minutes(min)");
        toUnit.setValue("Hours(h)");
        inputDisplay.setText("60");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        assertEquals("1", outputDisplay.getText());

        helper.clear();

        //Test Two: Days to Week
        category.setValue("Time");
        helper.updateUnitCombos();
        fromUnit.setValue("Days(d)");
        toUnit.setValue("Weeks(wk)");
        inputDisplay.setText("7");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        assertEquals("1", outputDisplay.getText());

        helper.clear();

        //Test Three: Milliseconds to Second
        category.setValue("Time");
        helper.updateUnitCombos();
        fromUnit.setValue("Milliseconds(ms)");
        toUnit.setValue("Seconds(s)");
        inputDisplay.setText("1000");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        double result = Double.parseDouble(outputDisplay.getText());
        assertEquals(1, result, 0.1);
    }

    @Test
    @DisplayName("Temperature Tests")
    void testTemperature() {
        //Test One: C to F
        category.setValue("Temperature");
        helper.updateUnitCombos();
        fromUnit.setValue("Celsius");
        toUnit.setValue("Fahrenheit");
        inputDisplay.setText("0");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        assertEquals("32", outputDisplay.getText());

        helper.clear();

        //Test Two: K to C
        category.setValue("Temperature");
        helper.updateUnitCombos();
        fromUnit.setValue("Kelvin");
        toUnit.setValue("Celsius");
        inputDisplay.setText("0");
        helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
        assertEquals("-273.15", outputDisplay.getText());
    }
}
