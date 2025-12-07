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
import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

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

    @Nested
    @DisplayName("Area Tests")
    class AreaTests {
        @Test
        @DisplayName("Acres tests")
        void AcreTests() {
            //Acres to Ares
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Acre(ac)");
            toUnit.setValue("Ares(a)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("40.468564", outputDisplay.getText());

            helper.clear();
            //Acres to Hectares
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Acre(ac)");
            toUnit.setValue("Hectares(ha)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.404686", outputDisplay.getText());

            helper.clear();
            //Acres to Square Inch
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Acre(ac)");
            toUnit.setValue("Square Inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("6272640.401449", outputDisplay.getText());

            helper.clear();
            //Acres to Square Feet
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Acre(ac)");
            toUnit.setValue("Square Feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("43560", outputDisplay.getText());

            helper.clear();
            //Acres to Square Centimeter
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Acre(ac)");
            toUnit.setValue("Square Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("40468565.790684", outputDisplay.getText());

            helper.clear();
            //Acres to Square Meter
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Acre(ac)");
            toUnit.setValue("Square Meters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("4046.856422", outputDisplay.getText());
        }
        @Test
        @DisplayName("Ares tests")
        void AresTests() {
            //Ares to Acres
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Ares(a)");
            toUnit.setValue("Acre(ac)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.024711", outputDisplay.getText());

            helper.clear();
            //Ares to Hectares
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Ares(a)");
            toUnit.setValue("Hectares(ha)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.01", outputDisplay.getText());

            helper.clear();
            //Ares to Square Inch
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Ares(a)");
            toUnit.setValue("Square Inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("155000.319921", outputDisplay.getText());

            helper.clear();
            //Ares to Square Feet
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Ares(a)");
            toUnit.setValue("Square Feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1076.391042", outputDisplay.getText());

            helper.clear();
            //Ares to Square Centimeter
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Ares(a)");
            toUnit.setValue("Square Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000000.038714", outputDisplay.getText());

            helper.clear();
            //Ares to Square Meter
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Ares(a)");
            toUnit.setValue("Square Meters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("100", outputDisplay.getText());
        }
        @Test
        @DisplayName("Hectare tests")
        void HectareTests() {
            //Hectares to Acres
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Hectares(ha)");
            toUnit.setValue("Acre(ac)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("2.471054", outputDisplay.getText());

            helper.clear();
            //Hectares to Ares
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Hectares(ha)");
            toUnit.setValue("Ares(a)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("100", outputDisplay.getText());

            helper.clear();
            //Hectares to Square Inches
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Hectares(ha)");
            toUnit.setValue("Square Inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("15500031.992064", outputDisplay.getText());

            helper.clear();
            //Hectares to Square Feet
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Hectares(ha)");
            toUnit.setValue("Square Feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("107639.104167", outputDisplay.getText());

            helper.clear();
            //Hectares to Square Centimeters
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Hectares(ha)");
            toUnit.setValue("Square Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("100000003.871363", outputDisplay.getText());

            helper.clear();
            //Hectares to Square Meters
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Hectares(ha)");
            toUnit.setValue("Square Meters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("10000", outputDisplay.getText());
        }
        @Test
        @DisplayName("Square Inch tests")
        void SquareInchTests() {
            //Square Inch to Acres
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Inches");
            toUnit.setValue("Acre(ac)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());

            helper.clear();
            //Square Inch to Ares
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Inches");
            toUnit.setValue("Ares(a)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000006", outputDisplay.getText());

            helper.clear();
            //Square Inch to Hectares
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Inches");
            toUnit.setValue("Hectares(ha)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());

            helper.clear();
            //Square Inch to Square Feet
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Inches");
            toUnit.setValue("Square Feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.006944", outputDisplay.getText());

            helper.clear();
            //Square Inch to Square Centimeters
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Inches");
            toUnit.setValue("Square Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("6.4516", outputDisplay.getText());

            helper.clear();
            //Square Inch to Square Meters
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Inches");
            toUnit.setValue("Square Meters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000645", outputDisplay.getText());
        }
        @Test
        @DisplayName("Square Foot tests")
        void SquareFootTests() {
            //Square feet to Acres
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Feet");
            toUnit.setValue("Acre(ac)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000023", outputDisplay.getText());

            helper.clear();
            //Square feet to Ares
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Feet");
            toUnit.setValue("Ares(a)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000929", outputDisplay.getText());

            helper.clear();
            //Square feet to Hectares
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Feet");
            toUnit.setValue("Hectares(ha)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000009", outputDisplay.getText());

            helper.clear();
            //Square feet to Square Inches
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Feet");
            toUnit.setValue("Square Inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("144.000009", outputDisplay.getText());

            helper.clear();
            //Square feet to Square Centimeters
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Feet");
            toUnit.setValue("Square Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("929.030436", outputDisplay.getText());

            helper.clear();
            //Square feet to Square Meters
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Feet");
            toUnit.setValue("Square Meters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.092903", outputDisplay.getText());
        }
        @Test
        @DisplayName("Square Centimeter tests")
        void SquareCentimeterTests() {
            //Square Centimeters to Acres
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Centimeters");
            toUnit.setValue("Acre(ac)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());

            helper.clear();
            //Square Centimeters to Ares
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Centimeters");
            toUnit.setValue("Ares(a)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000001", outputDisplay.getText());

            helper.clear();
            //Square Centimeters to Hectares
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Centimeters");
            toUnit.setValue("Hectares(ha)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());

            helper.clear();
            //Square Centimeters to Square Inches
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Centimeters");
            toUnit.setValue("Square Inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.155", outputDisplay.getText());

            helper.clear();
            //Square Centimeters to Square Feet
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Centimeters");
            toUnit.setValue("Square Feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001076", outputDisplay.getText());

            helper.clear();
            //Square Centimeters to Square Meters
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Centimeters");
            toUnit.setValue("Square Meters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.0001", outputDisplay.getText());
        }
        @Test
        @DisplayName("Square Meter tests")
        void SquareMeterTests() {
            //Square Meters to Acres
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Meters");
            toUnit.setValue("Acre(ac)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000247", outputDisplay.getText());

            helper.clear();
            //Square Meters to Ares
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Meters");
            toUnit.setValue("Ares(a)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.01", outputDisplay.getText());

            helper.clear();
            //Square Meters to Hectares
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Meters");
            toUnit.setValue("Hectares(ha)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.0001", outputDisplay.getText());

            helper.clear();
            //Square Meters to Square Inches
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Meters");
            toUnit.setValue("Square Inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1550.003199", outputDisplay.getText());

            helper.clear();
            //Square Meters to Square Feet
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Meters");
            toUnit.setValue("Square Feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("10.76391", outputDisplay.getText());

            helper.clear();
            //Square Meters to Square Centimeters
            category.setValue("Area");
            helper.updateUnitCombos();
            fromUnit.setValue("Square Meters");
            toUnit.setValue("Square Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("10000.000387", outputDisplay.getText());
        }
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


    @Nested
    @DisplayName("Mass Tests")
    class MassTests {
        @Test
        @DisplayName("Gram Tests")
        void testGram() {
            //Gram Tests
            //Gram -> Kilogram
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Grams(g)");
            toUnit.setValue("Kilogram(kg)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultG1 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.001, resultG1, 0.001);

            helper.clear();

            //Gram -> Ounce
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Grams(g)");
            toUnit.setValue("Ounces(oz)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultG2 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.035274, resultG2, .01);

            helper.clear();

            //Gram -> Pounds
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Grams(g)");
            toUnit.setValue("Pounds(lb)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultG3 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.002205, resultG3, 0.01);

            helper.clear();

            //Grams -> Tons(t)
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Grams(g)");
            toUnit.setValue("Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultG4 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.000001, resultG4, 0.01);

            helper.clear();

            //Grams -> UK Tons(t)
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Grams(g)");
            toUnit.setValue("UK Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultG5 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.000001, resultG5, 0.01);

            helper.clear();

            //Grams -> US Tons(t)
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Grams(g)");
            toUnit.setValue("US Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultG6 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.000001, resultG6, 0.000001);
        }

        @Test
        @DisplayName("Kilogram Tests")
        void testKilogram() {
            //Kilogram Tests
            //Kilograms to Grams
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Kilogram(kg)");
            toUnit.setValue("Grams(g)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultK1 = Double.parseDouble(outputDisplay.getText());
            assertEquals(1000.00001, resultK1, 0.001);

            helper.clear();

            //Kilograms to Ounces
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Kilogram(kg)");
            toUnit.setValue("Ounces(oz)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultK2 = Double.parseDouble(outputDisplay.getText());
            assertEquals(35.273962, resultK2, 0.001);

            helper.clear();
            //Kilograms to Pounds
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Kilogram(kg)");
            toUnit.setValue("Pounds(lb)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultK3 = Double.parseDouble(outputDisplay.getText());
            assertEquals(2.204623, resultK3, 0.001);

            helper.clear();
            //Kilograms to Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Kilogram(kg)");
            toUnit.setValue("Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultK4 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.001, resultK4, 0.001);

            helper.clear();

            //Kilograms to UK Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Kilogram(kg)");
            toUnit.setValue("UK Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultK5 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.000984, resultK5, 0.001);

            helper.clear();

            //Kilograms to US Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Kilogram(kg)");
            toUnit.setValue("US Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultK6 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.001102, resultK6, 0.001);
        }

        @Test
        @DisplayName("Ounces Tests")
        void testOunces() {
            //Ounces Tests
            //Ounces to Grams
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Ounces(oz)");
            toUnit.setValue("Grams(g)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultO1 = Double.parseDouble(outputDisplay.getText());
            assertEquals(28.349523, resultO1, 0.001);

            helper.clear();

            //Ounces to Kilograms
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Ounces(oz)");
            toUnit.setValue("Kilogram(kg)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.02835", outputDisplay.getText());

            helper.clear();

            //Ounces to Pounds
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Ounces(oz)");
            toUnit.setValue("Pounds(lb)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.0625", outputDisplay.getText());

            helper.clear();

            //Ounces to Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Ounces(oz)");
            toUnit.setValue("Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000028", outputDisplay.getText());

            helper.clear();

            //Ounces to UK Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Ounces(oz)");
            toUnit.setValue("UK Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000028", outputDisplay.getText());

            helper.clear();

            //Ounces to US Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Ounces(oz)");
            toUnit.setValue("US Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000031", outputDisplay.getText());

        }

        @Test
        @DisplayName("Pounds Tests")
        void testPounds() {
            //Pound Tests
            //Pounds to Grams
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Pounds(lb)");
            toUnit.setValue("Grams(g)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("453.592374", outputDisplay.getText());

            helper.clear();

            //Pounds to Kilograms
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Pounds(lb)");
            toUnit.setValue("Kilogram(kg)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.453592", outputDisplay.getText());

            helper.clear();

            //Pounds to Ounces
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Pounds(lb)");
            toUnit.setValue("Ounces(oz)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("16", outputDisplay.getText());

            helper.clear();

            //Pounds to Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Pounds(lb)");
            toUnit.setValue("Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000454", outputDisplay.getText());

            helper.clear();

            //Pounds to UK Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Pounds(lb)");
            toUnit.setValue("UK Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000446", outputDisplay.getText());

            helper.clear();

            //Pounds to US Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Pounds(lb)");
            toUnit.setValue("US Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.0005", outputDisplay.getText());

        }

        @Test
        @DisplayName("Tons Tests")
        void testTons() {
            //Ton Tests
            //Tons to Grams
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Tons(t)");
            toUnit.setValue("Grams(g)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000000.00991", outputDisplay.getText());

            helper.clear();

            //Tons to Kilograms
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Tons(t)");
            toUnit.setValue("Kilogram(kg)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000", outputDisplay.getText());

            helper.clear();

            //Tons to Ounces
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Tons(t)");
            toUnit.setValue("Ounces(oz)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("35273.96195", outputDisplay.getText());

            helper.clear();

            //Tons to Pounds
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Tons(t)");
            toUnit.setValue("Pounds(lb)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("2204.622622", outputDisplay.getText());

            helper.clear();

            //Tons to UK Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Tons(t)");
            toUnit.setValue("UK Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.984207", outputDisplay.getText());

            helper.clear();

            //Tons to US Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("Tons(t)");
            toUnit.setValue("US Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1.102311", outputDisplay.getText());
        }

        @Test
        @DisplayName("UK Tons Tests")
        void testUKTons() {
            //UK Ton Tests
            //UK Tons to Grams
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("UK Tons(t)");
            toUnit.setValue("Grams(g)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1016046.918869", outputDisplay.getText());

            helper.clear();

            //UK Tons to Kilograms
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("UK Tons(t)");
            toUnit.setValue("Kilogram(kg)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1016.046909", outputDisplay.getText());

            helper.clear();

            //UK Tons to Ounces
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("UK Tons(t)");
            toUnit.setValue("Ounces(oz)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("35840", outputDisplay.getText());

            helper.clear();

            //UK Tons to Pounds
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("UK Tons(t)");
            toUnit.setValue("Pounds(lb)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("2240", outputDisplay.getText());

            helper.clear();

            //UK Tons to Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("UK Tons(t)");
            toUnit.setValue("Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1.016047", outputDisplay.getText());

            helper.clear();

            //UK Tons to US Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("UK Tons(t)");
            toUnit.setValue("US Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1.12", outputDisplay.getText());
        }

        @Test
        @DisplayName("US Tons Tests")
        void testUSTons() {
            //US Ton Tests
            //US Tons to Grams
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("US Tons(t)");
            toUnit.setValue("Grams(g)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("907184.748991", outputDisplay.getText());

            helper.clear();

            //US Tons to Kilograms
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("US Tons(t)");
            toUnit.setValue("Kilogram(kg)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("907.18474", outputDisplay.getText());

            helper.clear();

            //US Tons to Ounces
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("US Tons(t)");
            toUnit.setValue("Ounces(oz)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("32000", outputDisplay.getText());

            helper.clear();

            //US Tons to Pounds
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("US Tons(t)");
            toUnit.setValue("Pounds(lb)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("2000", outputDisplay.getText());

            helper.clear();

            //US Tons to UK Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("US Tons(t)");
            toUnit.setValue("UK Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.892857", outputDisplay.getText());

            helper.clear();

            //US Tons to Tons
            category.setValue("Mass");
            helper.updateUnitCombos();
            fromUnit.setValue("US Tons(t)");
            toUnit.setValue("Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.907185", outputDisplay.getText());
        }
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


    @Nested
    @DisplayName("Time Tests")
    class TimeTests {

        @Test
        @DisplayName("Day Tests")
        void testDay() {
            //Day Tests
            //Day to Hour
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Days(d)");
            toUnit.setValue("Hours(h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("24", outputDisplay.getText());

            helper.clear();

            //Day to Milliseconds
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Days(d)");
            toUnit.setValue("Milliseconds(ms)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("86399827.200346", outputDisplay.getText());

            helper.clear();

            //Day to Seconds
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Days(d)");
            toUnit.setValue("Seconds(s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("86399.999827", outputDisplay.getText());

            helper.clear();

            //Day to Minutes
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Days(d)");
            toUnit.setValue("Minutes(min)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1440", outputDisplay.getText());

            helper.clear();

            //Day to Weeks
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Days(d)");
            toUnit.setValue("Weeks(wk)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.142857", outputDisplay.getText());

        }

        @Test
        @DisplayName("Hour Tests")
        void testHour() {
            //Hour Tests
            //Hour to Day
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Hours(h)");
            toUnit.setValue("Days(d)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.041667", outputDisplay.getText());

            helper.clear();

            //Hour to Milliseconds
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Hours(h)");
            toUnit.setValue("Milliseconds(ms)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3599992.800014", outputDisplay.getText());

            helper.clear();

            //Hour to Seconds
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Hours(h)");
            toUnit.setValue("Seconds(s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3599.999993", outputDisplay.getText());

            helper.clear();

            //Hour to Minutes
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Hours(h)");
            toUnit.setValue("Minutes(min)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("60", outputDisplay.getText());

            helper.clear();

            //Hour to Week
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Hours(h)");
            toUnit.setValue("Weeks(wk)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.005952", outputDisplay.getText());
        }

        @Test
        @DisplayName("Milliseconds Tests")
        void testMilliseconds() {
            //Milliseconds Tests
            //Millisecond to Days
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Milliseconds(ms)");
            toUnit.setValue("Days(d)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());

            helper.clear();

            //Milliseconds to Hours
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Milliseconds(ms)");
            toUnit.setValue("Hours(h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());

            helper.clear();

            //Milliseconds to Seconds
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Milliseconds(ms)");
            toUnit.setValue("Seconds(s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001", outputDisplay.getText());

            helper.clear();

            //Milliseconds to Minutes
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Milliseconds(ms)");
            toUnit.setValue("Minutes(min)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000017", outputDisplay.getText());

            helper.clear();

            //Milliseconds to Weeks
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Milliseconds(ms)");
            toUnit.setValue("Weeks(wk)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
        }

        @Test
        @DisplayName("Seconds Tests")
        void testSeconds() {
            //Seconds Tests
            //Seconds to Days
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Seconds(s)");
            toUnit.setValue("Days(d)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000012", outputDisplay.getText());

            helper.clear();

            //Seconds to Hours
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Seconds(s)");
            toUnit.setValue("Hours(h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000278", outputDisplay.getText());

            helper.clear();

            //Seconds to Milliseconds
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Seconds(s)");
            toUnit.setValue("Milliseconds(ms)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("999.998002", outputDisplay.getText());

            helper.clear();

            //Seconds to Minute
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Seconds(s)");
            toUnit.setValue("Minutes(min)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.016667", outputDisplay.getText());

            helper.clear();
            //Seconds to Week
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Seconds(s)");
            toUnit.setValue("Weeks(wk)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000002", outputDisplay.getText());
        }

        @Test
        @DisplayName("Minutes Tests")
        void testMinutes() {
            //Minute Tests
            //Minute to Days
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Minutes(min)");
            toUnit.setValue("Days(d)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000694", outputDisplay.getText());

            helper.clear();

            //Minutes to Hours
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Minutes(min)");
            toUnit.setValue("Hours(h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.016667", outputDisplay.getText());

            helper.clear();

            //Minutes to Milliseconds
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Minutes(min)");
            toUnit.setValue("Milliseconds(ms)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("59999.88", outputDisplay.getText());

            helper.clear();

            //Minutes to Seconds
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Minutes(min)");
            toUnit.setValue("Seconds(s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("60", outputDisplay.getText());

            helper.clear();

            //Minutes to Weeks
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Minutes(min)");
            toUnit.setValue("Weeks(wk)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000099", outputDisplay.getText());
        }

        @Test
        @DisplayName("Week Tests")
        void testWeek() {
            //Week Tests
            //Week to Days
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Weeks(wk)");
            toUnit.setValue("Days(d)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("7", outputDisplay.getText());

            helper.clear();

            //Week to Hours
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Weeks(wk)");
            toUnit.setValue("Hours(h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("168", outputDisplay.getText());

            helper.clear();

            //Week to Milliseconds
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Weeks(wk)");
            toUnit.setValue("Milliseconds(ms)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("604798790.402419", outputDisplay.getText());

            helper.clear();

            //Week to Seconds
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Weeks(wk)");
            toUnit.setValue("Seconds(s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("604799.99879", outputDisplay.getText());

            helper.clear();

            //Week to Minutes
            category.setValue("Time");
            helper.updateUnitCombos();
            fromUnit.setValue("Weeks(wk)");
            toUnit.setValue("Minutes(min)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("10080", outputDisplay.getText());
        }
    }

    @Nested
    @DisplayName("Temperature Tests")
    class TemperatureTests {

        @Test
        @DisplayName("Fahrenheit Tests")
        void testFahrenheit() {
            //Fahrenheit Tests
            //Fahrenheit to Celsius
            category.setValue("Temperature");
            helper.updateUnitCombos();
            fromUnit.setValue("Fahrenheit");
            toUnit.setValue("Celsius");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("-17.222222", outputDisplay.getText());

            helper.clear();

            //Fahrenheit to Kelvin
            category.setValue("Temperature");
            helper.updateUnitCombos();
            fromUnit.setValue("Fahrenheit");
            toUnit.setValue("Kelvin");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("255.927778", outputDisplay.getText());
        }

        @Test
        @DisplayName("Celsius Tests")
        void testCelsius() {
            //Celsius to Fahrenheit
            category.setValue("Temperature");
            helper.updateUnitCombos();
            fromUnit.setValue("Celsius");
            toUnit.setValue("Fahrenheit");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("33.8", outputDisplay.getText());

            helper.clear();

            //Celsius to Kelvin
            category.setValue("Temperature");
            helper.updateUnitCombos();
            fromUnit.setValue("Celsius");
            toUnit.setValue("Kelvin");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("274.15", outputDisplay.getText());

            helper.clear();
        }

        @Test
        @DisplayName("Kelvin Tests")
        void testKelvin() {
            //Kelvin Tests
            //Kelvin to Celsius
            category.setValue("Temperature");
            helper.updateUnitCombos();
            fromUnit.setValue("Kelvin");
            toUnit.setValue("Celsius");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("-272.15", outputDisplay.getText());

            helper.clear();

            //Kelvin to Fahrenheit
            category.setValue("Temperature");
            helper.updateUnitCombos();
            fromUnit.setValue("Kelvin");
            toUnit.setValue("Fahrenheit");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("-457.87", outputDisplay.getText());
        }
    }
}
