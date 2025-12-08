package com.example.calculatorappfxtests;

import com.example.calculatorappfx.ConverterHelper;
import javafx.application.Platform;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

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

        @BeforeEach
        void setLengthCategory(){
            category.setValue("Area");
            helper.updateUnitCombos();
        }

        @Test
        @DisplayName("Acres tests")
        void AcreTests() {
            //Acres to Ares
            fromUnit.setValue("Acre(ac)");
            toUnit.setValue("Ares(a)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("40.468564", outputDisplay.getText());

            helper.clear();
            //Acres to Hectares
            fromUnit.setValue("Acre(ac)");
            toUnit.setValue("Hectares(ha)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.404686", outputDisplay.getText());

            helper.clear();
            //Acres to Square Inch
            fromUnit.setValue("Acre(ac)");
            toUnit.setValue("Square Inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("6272640.401449", outputDisplay.getText());

            helper.clear();
            //Acres to Square Feet
            fromUnit.setValue("Acre(ac)");
            toUnit.setValue("Square Feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("43560", outputDisplay.getText());

            helper.clear();
            //Acres to Square Centimeter
            fromUnit.setValue("Acre(ac)");
            toUnit.setValue("Square Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("40468565.790684", outputDisplay.getText());

            helper.clear();
            //Acres to Square Meter
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
            fromUnit.setValue("Ares(a)");
            toUnit.setValue("Acre(ac)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.024711", outputDisplay.getText());

            helper.clear();
            //Ares to Hectares
            fromUnit.setValue("Ares(a)");
            toUnit.setValue("Hectares(ha)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.01", outputDisplay.getText());

            helper.clear();
            //Ares to Square Inch
            fromUnit.setValue("Ares(a)");
            toUnit.setValue("Square Inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("155000.319921", outputDisplay.getText());

            helper.clear();
            //Ares to Square Feet
            fromUnit.setValue("Ares(a)");
            toUnit.setValue("Square Feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1076.391042", outputDisplay.getText());

            helper.clear();
            //Ares to Square Centimeter
            fromUnit.setValue("Ares(a)");
            toUnit.setValue("Square Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000000.038714", outputDisplay.getText());

            helper.clear();
            //Ares to Square Meter
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
            fromUnit.setValue("Hectares(ha)");
            toUnit.setValue("Acre(ac)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("2.471054", outputDisplay.getText());

            helper.clear();
            //Hectares to Ares
            fromUnit.setValue("Hectares(ha)");
            toUnit.setValue("Ares(a)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("100", outputDisplay.getText());

            helper.clear();
            //Hectares to Square Inches
            fromUnit.setValue("Hectares(ha)");
            toUnit.setValue("Square Inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("15500031.992064", outputDisplay.getText());

            helper.clear();
            //Hectares to Square Feet
            fromUnit.setValue("Hectares(ha)");
            toUnit.setValue("Square Feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("107639.104167", outputDisplay.getText());

            helper.clear();
            //Hectares to Square Centimeters
            fromUnit.setValue("Hectares(ha)");
            toUnit.setValue("Square Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("100000003.871363", outputDisplay.getText());

            helper.clear();
            //Hectares to Square Meters
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
            fromUnit.setValue("Square Inches");
            toUnit.setValue("Acre(ac)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());

            helper.clear();
            //Square Inch to Ares
            fromUnit.setValue("Square Inches");
            toUnit.setValue("Ares(a)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000006", outputDisplay.getText());

            helper.clear();
            //Square Inch to Hectares
            fromUnit.setValue("Square Inches");
            toUnit.setValue("Hectares(ha)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());

            helper.clear();
            //Square Inch to Square Feet
            fromUnit.setValue("Square Inches");
            toUnit.setValue("Square Feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.006944", outputDisplay.getText());

            helper.clear();
            //Square Inch to Square Centimeters
            fromUnit.setValue("Square Inches");
            toUnit.setValue("Square Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("6.4516", outputDisplay.getText());

            helper.clear();
            //Square Inch to Square Meters
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
            fromUnit.setValue("Square Feet");
            toUnit.setValue("Acre(ac)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000023", outputDisplay.getText());

            helper.clear();
            //Square feet to Ares
            fromUnit.setValue("Square Feet");
            toUnit.setValue("Ares(a)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000929", outputDisplay.getText());

            helper.clear();
            //Square feet to Hectares
            fromUnit.setValue("Square Feet");
            toUnit.setValue("Hectares(ha)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000009", outputDisplay.getText());

            helper.clear();
            //Square feet to Square Inches
            fromUnit.setValue("Square Feet");
            toUnit.setValue("Square Inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("144.000009", outputDisplay.getText());

            helper.clear();
            //Square feet to Square Centimeters
            fromUnit.setValue("Square Feet");
            toUnit.setValue("Square Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("929.030436", outputDisplay.getText());

            helper.clear();
            //Square feet to Square Meters
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
            fromUnit.setValue("Square Centimeters");
            toUnit.setValue("Acre(ac)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());

            helper.clear();
            //Square Centimeters to Ares
            fromUnit.setValue("Square Centimeters");
            toUnit.setValue("Ares(a)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000001", outputDisplay.getText());

            helper.clear();
            //Square Centimeters to Hectares
            fromUnit.setValue("Square Centimeters");
            toUnit.setValue("Hectares(ha)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());

            helper.clear();
            //Square Centimeters to Square Inches
            fromUnit.setValue("Square Centimeters");
            toUnit.setValue("Square Inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.155", outputDisplay.getText());

            helper.clear();
            //Square Centimeters to Square Feet
            fromUnit.setValue("Square Centimeters");
            toUnit.setValue("Square Feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001076", outputDisplay.getText());

            helper.clear();
            //Square Centimeters to Square Meters
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
            fromUnit.setValue("Square Meters");
            toUnit.setValue("Acre(ac)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000247", outputDisplay.getText());

            helper.clear();
            //Square Meters to Ares
            fromUnit.setValue("Square Meters");
            toUnit.setValue("Ares(a)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.01", outputDisplay.getText());

            helper.clear();
            //Square Meters to Hectares
            fromUnit.setValue("Square Meters");
            toUnit.setValue("Hectares(ha)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.0001", outputDisplay.getText());

            helper.clear();
            //Square Meters to Square Inches
            fromUnit.setValue("Square Meters");
            toUnit.setValue("Square Inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1550.003199", outputDisplay.getText());

            helper.clear();
            //Square Meters to Square Feet
            fromUnit.setValue("Square Meters");
            toUnit.setValue("Square Feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("10.76391", outputDisplay.getText());

            helper.clear();
            //Square Meters to Square Centimeters
            fromUnit.setValue("Square Meters");
            toUnit.setValue("Square Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("10000.000387", outputDisplay.getText());
        }
    }

    @Nested
    @DisplayName("Length Tests")
    class LengthTests {
        @BeforeEach
        void setLengthCategory(){
            category.setValue("Length");
            helper.updateUnitCombos();
        }


        @Test
        @DisplayName("Millimeter tests")
        void MillimeterTests() {
            // Millimeter to Centimeter
            fromUnit.setValue("Millimeter");
            toUnit.setValue("Centimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.1", outputDisplay.getText());
            helper.clear();

            // Millimeter to Meter
            fromUnit.setValue("Millimeter");
            toUnit.setValue("Meter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001", outputDisplay.getText());
            helper.clear();

            // Millimeter to Kilometer
            fromUnit.setValue("Millimeter");
            toUnit.setValue("Kilometer");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000001", outputDisplay.getText());
            helper.clear();

            // Millimeter to Inch
            fromUnit.setValue("Millimeter");
            toUnit.setValue("Inch");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.03937", outputDisplay.getText());
            helper.clear();

            // Millimeter to Foot
            fromUnit.setValue("Millimeter");
            toUnit.setValue("Foot");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.003281", outputDisplay.getText());
            helper.clear();

            // Millimeter to Yard
            fromUnit.setValue("Millimeter");
            toUnit.setValue("Yard");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001094", outputDisplay.getText());
            helper.clear();

            // Millimeter to Mile
            fromUnit.setValue("Millimeter");
            toUnit.setValue("Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000001", outputDisplay.getText());
            helper.clear();

            // Millimeter to Nautical Mile
            fromUnit.setValue("Millimeter");
            toUnit.setValue("Nautical Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000001", outputDisplay.getText());
            helper.clear();

            // Millimeter to Mils
            fromUnit.setValue("Millimeter");
            toUnit.setValue("Mils");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("39.370079", outputDisplay.getText());
            helper.clear();
        }

        @Test
        @DisplayName("Centimeter tests")
        void CentimeterTests() {
            // Centimeter to Millimeter
            fromUnit.setValue("Centimeter");
            toUnit.setValue("Millimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("10", outputDisplay.getText());
            helper.clear();

            // Centimeter to Meter
            fromUnit.setValue("Centimeter");
            toUnit.setValue("Meter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.01", outputDisplay.getText());
            helper.clear();

            // Centimeter to Kilometer
            fromUnit.setValue("Centimeter");
            toUnit.setValue("Kilometer");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.00001", outputDisplay.getText());
            helper.clear();

            // Centimeter to Inch
            fromUnit.setValue("Centimeter");
            toUnit.setValue("Inch");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.393701", outputDisplay.getText());
            helper.clear();

            // Centimeter to Foot
            fromUnit.setValue("Centimeter");
            toUnit.setValue("Foot");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.032808", outputDisplay.getText());
            helper.clear();

            // Centimeter to Yard
            fromUnit.setValue("Centimeter");
            toUnit.setValue("Yard");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.010936", outputDisplay.getText());
            helper.clear();

            // Centimeter to Mile
            fromUnit.setValue("Centimeter");
            toUnit.setValue("Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000006", outputDisplay.getText());
            helper.clear();

            // Centimeter to Nautical Mile
            fromUnit.setValue("Centimeter");
            toUnit.setValue("Nautical Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000005", outputDisplay.getText());
            helper.clear();

            // Centimeter to Mils
            fromUnit.setValue("Centimeter");
            toUnit.setValue("Mils");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("393.700787", outputDisplay.getText());
            helper.clear();
        }

        @Test
        @DisplayName("Meter tests")
        void MeterTests() {
            // Meter to Millimeter
            fromUnit.setValue("Meter");
            toUnit.setValue("Millimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000", outputDisplay.getText());
            helper.clear();

            // Meter to Centimeter
            fromUnit.setValue("Meter");
            toUnit.setValue("Centimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("100", outputDisplay.getText());
            helper.clear();

            // Meter to Kilometer
            fromUnit.setValue("Meter");
            toUnit.setValue("Kilometer");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001", outputDisplay.getText());
            helper.clear();

            // Meter to Inch
            fromUnit.setValue("Meter");
            toUnit.setValue("Inch");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("39.370079", outputDisplay.getText());
            helper.clear();

            // Meter to Foot
            fromUnit.setValue("Meter");
            toUnit.setValue("Foot");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3.28084", outputDisplay.getText());
            helper.clear();

            // Meter to Yard
            fromUnit.setValue("Meter");
            toUnit.setValue("Yard");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1.093613", outputDisplay.getText());
            helper.clear();

            // Meter to Mile
            fromUnit.setValue("Meter");
            toUnit.setValue("Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000621", outputDisplay.getText());
            helper.clear();

            // Meter to Nautical Mile
            fromUnit.setValue("Meter");
            toUnit.setValue("Nautical Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.00054", outputDisplay.getText());
            helper.clear();

            // Meter to Mils
            fromUnit.setValue("Meter");
            toUnit.setValue("Mils");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("39370.07874", outputDisplay.getText());
            helper.clear();
        }

        @Test
        @DisplayName("Kilometer tests")
        void KilometerTests() {
            // Kilometer to Millimeter
            fromUnit.setValue("Kilometer");
            toUnit.setValue("Millimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000000", outputDisplay.getText());
            helper.clear();

            // Kilometer to Centimeter
            fromUnit.setValue("Kilometer");
            toUnit.setValue("Centimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("100000", outputDisplay.getText());
            helper.clear();

            // Kilometer to Meter
            fromUnit.setValue("Kilometer");
            toUnit.setValue("Meter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000", outputDisplay.getText());
            helper.clear();

            // Kilometer to Inch
            fromUnit.setValue("Kilometer");
            toUnit.setValue("Inch");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("39370.07874", outputDisplay.getText());
            helper.clear();

            // Kilometer to Foot
            fromUnit.setValue("Kilometer");
            toUnit.setValue("Foot");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3280.839895", outputDisplay.getText());
            helper.clear();

            // Kilometer to Yard
            fromUnit.setValue("Kilometer");
            toUnit.setValue("Yard");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1093.613298", outputDisplay.getText());
            helper.clear();

            // Kilometer to Mile
            fromUnit.setValue("Kilometer");
            toUnit.setValue("Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.621371", outputDisplay.getText());
            helper.clear();

            // Kilometer to Nautical Mile
            fromUnit.setValue("Kilometer");
            toUnit.setValue("Nautical Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.539957", outputDisplay.getText());
            helper.clear();

            // Kilometer to Mils
            fromUnit.setValue("Kilometer");
            toUnit.setValue("Mils");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("39370078.740157", outputDisplay.getText());
            helper.clear();
        }

        @Test
        @DisplayName("Inch tests")
        void InchTests() {
            // Inch to Millimeter
            fromUnit.setValue("Inch");
            toUnit.setValue("Millimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("25.4", outputDisplay.getText());
            helper.clear();

            // Inch to Centimeter
            fromUnit.setValue("Inch");
            toUnit.setValue("Centimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("2.54", outputDisplay.getText());
            helper.clear();

            // Inch to Meter
            fromUnit.setValue("Inch");
            toUnit.setValue("Meter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.0254", outputDisplay.getText());
            helper.clear();

            // Inch to Kilometer
            fromUnit.setValue("Inch");
            toUnit.setValue("Kilometer");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000025", outputDisplay.getText());
            helper.clear();

            // Inch to Foot
            fromUnit.setValue("Inch");
            toUnit.setValue("Foot");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.083333", outputDisplay.getText());
            helper.clear();

            // Inch to Yard
            fromUnit.setValue("Inch");
            toUnit.setValue("Yard");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.027778", outputDisplay.getText());
            helper.clear();

            // Inch to Mile
            fromUnit.setValue("Inch");
            toUnit.setValue("Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000016", outputDisplay.getText());
            helper.clear();

            // Inch to Nautical Mile
            fromUnit.setValue("Inch");
            toUnit.setValue("Nautical Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000014", outputDisplay.getText());
            helper.clear();

            // Inch to Mils
            fromUnit.setValue("Inch");
            toUnit.setValue("Mils");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000", outputDisplay.getText());
            helper.clear();
        }

        @Test
        @DisplayName("Foot tests")
        void FootTests() {
            // Foot to Millimeter
            fromUnit.setValue("Foot");
            toUnit.setValue("Millimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("304.8", outputDisplay.getText());
            helper.clear();

            // Foot to Centimeter
            fromUnit.setValue("Foot");
            toUnit.setValue("Centimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("30.48", outputDisplay.getText());
            helper.clear();

            // Foot to Meter
            fromUnit.setValue("Foot");
            toUnit.setValue("Meter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.3048", outputDisplay.getText());
            helper.clear();

            // Foot to Kilometer
            fromUnit.setValue("Foot");
            toUnit.setValue("Kilometer");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000305", outputDisplay.getText());
            helper.clear();

            // Foot to Inch
            fromUnit.setValue("Foot");
            toUnit.setValue("Inch");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("12", outputDisplay.getText());
            helper.clear();

            // Foot to Yard
            fromUnit.setValue("Foot");
            toUnit.setValue("Yard");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.333333", outputDisplay.getText());
            helper.clear();

            // Foot to Mile
            fromUnit.setValue("Foot");
            toUnit.setValue("Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000189", outputDisplay.getText());
            helper.clear();

            // Foot to Nautical Mile
            fromUnit.setValue("Foot");
            toUnit.setValue("Nautical Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000165", outputDisplay.getText());
            helper.clear();

            // Foot to Mils
            fromUnit.setValue("Foot");
            toUnit.setValue("Mils");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("12000", outputDisplay.getText());
            helper.clear();
        }

        @Test
        @DisplayName("Yard tests")
        void YardTests() {
            // Yard to Millimeter
            fromUnit.setValue("Yard");
            toUnit.setValue("Millimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("914.4", outputDisplay.getText());
            helper.clear();

            // Yard to Centimeter
            fromUnit.setValue("Yard");
            toUnit.setValue("Centimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("91.44", outputDisplay.getText());
            helper.clear();

            // Yard to Meter
            fromUnit.setValue("Yard");
            toUnit.setValue("Meter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.9144", outputDisplay.getText());
            helper.clear();

            // Yard to Kilometer
            fromUnit.setValue("Yard");
            toUnit.setValue("Kilometer");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000914", outputDisplay.getText());
            helper.clear();

            // Yard to Inch
            fromUnit.setValue("Yard");
            toUnit.setValue("Inch");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("36", outputDisplay.getText());
            helper.clear();

            // Yard to Foot
            fromUnit.setValue("Yard");
            toUnit.setValue("Foot");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3", outputDisplay.getText());
            helper.clear();

            // Yard to Mile
            fromUnit.setValue("Yard");
            toUnit.setValue("Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000568", outputDisplay.getText());
            helper.clear();

            // Yard to Nautical Mile
            fromUnit.setValue("Yard");
            toUnit.setValue("Nautical Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000494", outputDisplay.getText());
            helper.clear();

            // Yard to Mils
            fromUnit.setValue("Yard");
            toUnit.setValue("Mils");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("36000", outputDisplay.getText());
            helper.clear();
        }

        @Test
        @DisplayName("Mile tests")
        void MileTests() {
            // Mile to Millimeter
            fromUnit.setValue("Mile");
            toUnit.setValue("Millimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1609344", outputDisplay.getText());
            helper.clear();

            // Mile to Centimeter
            fromUnit.setValue("Mile");
            toUnit.setValue("Centimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("160934.4", outputDisplay.getText());
            helper.clear();

            // Mile to Meter
            fromUnit.setValue("Mile");
            toUnit.setValue("Meter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1609.344", outputDisplay.getText());
            helper.clear();

            // Mile to Kilometer
            fromUnit.setValue("Mile");
            toUnit.setValue("Kilometer");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1.609344", outputDisplay.getText());
            helper.clear();

            // Mile to Inch
            fromUnit.setValue("Mile");
            toUnit.setValue("Inch");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("63360", outputDisplay.getText());
            helper.clear();

            // Mile to Foot
            fromUnit.setValue("Mile");
            toUnit.setValue("Foot");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("5280", outputDisplay.getText());
            helper.clear();

            // Mile to Yard
            fromUnit.setValue("Mile");
            toUnit.setValue("Yard");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1760", outputDisplay.getText());
            helper.clear();

            // Mile to Nautical Mile
            fromUnit.setValue("Mile");
            toUnit.setValue("Nautical Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.868976", outputDisplay.getText());
            helper.clear();

            // Mile to Mils
            fromUnit.setValue("Mile");
            toUnit.setValue("Mils");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("63360000", outputDisplay.getText());
            helper.clear();
        }

        @Test
        @DisplayName("Nautical Mile tests")
        void NauticalMileTests() {
            // Nautical Mile to Millimeter
            fromUnit.setValue("Nautical Mile");
            toUnit.setValue("Millimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1852000", outputDisplay.getText());
            helper.clear();

            // Nautical Mile to Centimeter
            fromUnit.setValue("Nautical Mile");
            toUnit.setValue("Centimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("185200", outputDisplay.getText());
            helper.clear();

            // Nautical Mile to Meter
            fromUnit.setValue("Nautical Mile");
            toUnit.setValue("Meter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1852", outputDisplay.getText());
            helper.clear();

            // Nautical Mile to Kilometer
            fromUnit.setValue("Nautical Mile");
            toUnit.setValue("Kilometer");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1.852", outputDisplay.getText());
            helper.clear();

            // Nautical Mile to Inch
            fromUnit.setValue("Nautical Mile");
            toUnit.setValue("Inch");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("72913.385827", outputDisplay.getText());
            helper.clear();

            // Nautical Mile to Foot
            fromUnit.setValue("Nautical Mile");
            toUnit.setValue("Foot");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("6076.115486", outputDisplay.getText());
            helper.clear();

            // Nautical Mile to Yard
            fromUnit.setValue("Nautical Mile");
            toUnit.setValue("Yard");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("2025.371829", outputDisplay.getText());
            helper.clear();

            // Nautical Mile to Mile
            fromUnit.setValue("Nautical Mile");
            toUnit.setValue("Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1.150779", outputDisplay.getText());
            helper.clear();

            // Nautical Mile to Mils
            fromUnit.setValue("Nautical Mile");
            toUnit.setValue("Mils");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("72913385.826772", outputDisplay.getText());
            helper.clear();
        }
        @Test
        @DisplayName("Mils tests")
        void MilsTests() {
            // Mils to Millimeter
            fromUnit.setValue("Mils");
            toUnit.setValue("Millimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.0254", outputDisplay.getText());
            helper.clear();

            // Mils to Centimeter
            fromUnit.setValue("Mils");
            toUnit.setValue("Centimeter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.00254", outputDisplay.getText());
            helper.clear();

            // Mils to Meter
            fromUnit.setValue("Mils");
            toUnit.setValue("Meter");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000025", outputDisplay.getText());
            helper.clear();

            // Mils to Kilometer
            fromUnit.setValue("Mils");
            toUnit.setValue("Kilometer");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();

            // Mils to Inch
            fromUnit.setValue("Mils");
            toUnit.setValue("Inch");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001", outputDisplay.getText());
            helper.clear();

            // Mils to Foot
            fromUnit.setValue("Mils");
            toUnit.setValue("Foot");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000083", outputDisplay.getText());
            helper.clear();

            // Mils to Yard
            fromUnit.setValue("Mils");
            toUnit.setValue("Yard");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000028", outputDisplay.getText());
            helper.clear();

            // Mils to Mile
            fromUnit.setValue("Mils");
            toUnit.setValue("Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();

            // Mils to Nautical Mile
            fromUnit.setValue("Mils");
            toUnit.setValue("Nautical Mile");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();
        }
    }

    @Nested
    @DisplayName("Volume Tests")
    class VolumeTests {

        @BeforeEach
        void setVolumeCategory() {
            category.setValue("Volume");
            helper.updateUnitCombos();
        }

        @Test
        @DisplayName("UK Gallons tests")
        void UKGallonsTests() {
            // UK Gallons -> US Gallons
            fromUnit.setValue("UK Gallons");
            toUnit.setValue("US Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1.20095", outputDisplay.getText());

            helper.clear();
            // UK Gallons -> Liters
            toUnit.setValue("Liters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("4.54609", outputDisplay.getText());

            helper.clear();
            // UK Gallons -> Milliliters
            toUnit.setValue("Milliliters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("4546.09", outputDisplay.getText());

            helper.clear();
            // UK Gallons -> Cubic Centimeters
            toUnit.setValue("Cubic Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("4546.09", outputDisplay.getText());

            helper.clear();
            // UK Gallons -> Cubic meters
            toUnit.setValue("Cubic meters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.004546", outputDisplay.getText());

            helper.clear();
            // UK Gallons -> Cubic inches
            toUnit.setValue("Cubic inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("277.419433", outputDisplay.getText());

            helper.clear();
            // UK Gallons -> Cubic feet
            toUnit.setValue("Cubic feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.160544", outputDisplay.getText());
        }

        @Test
        @DisplayName("US Gallons tests")
        void USGallonsTests() {
            // US Gallons -> UK Gallons
            fromUnit.setValue("US Gallons");
            toUnit.setValue("UK Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.832674", outputDisplay.getText());

            helper.clear();
            // US Gallons -> Liters
            toUnit.setValue("Liters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3.785412", outputDisplay.getText());

            helper.clear();
            // US Gallons -> Milliliters
            toUnit.setValue("Milliliters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3785.411784", outputDisplay.getText());

            helper.clear();
            // US Gallons -> Cubic Centimeters
            toUnit.setValue("Cubic Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3785.411784", outputDisplay.getText());

            helper.clear();
            // US Gallons -> Cubic meters
            toUnit.setValue("Cubic meters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.003785", outputDisplay.getText());

            helper.clear();
            // US Gallons -> Cubic inches
            toUnit.setValue("Cubic inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("231", outputDisplay.getText());

            helper.clear();
            // US Gallons -> Cubic feet
            toUnit.setValue("Cubic feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.133681", outputDisplay.getText());
        }

        @Test
        @DisplayName("Liters tests")
        void LitersTests() {
            // Liters -> UK Gallons
            fromUnit.setValue("Liters");
            toUnit.setValue("UK Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.219969", outputDisplay.getText());

            helper.clear();
            // Liters -> US Gallons
            toUnit.setValue("US Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.264172", outputDisplay.getText());

            helper.clear();
            // Liters -> Milliliters
            toUnit.setValue("Milliliters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000", outputDisplay.getText());

            helper.clear();
            // Liters -> Cubic Centimeters
            toUnit.setValue("Cubic Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000", outputDisplay.getText());

            helper.clear();
            // Liters -> Cubic meters
            toUnit.setValue("Cubic meters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001", outputDisplay.getText());

            helper.clear();
            // Liters -> Cubic inches
            toUnit.setValue("Cubic inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("61.023744", outputDisplay.getText());

            helper.clear();
            // Liters -> Cubic feet
            toUnit.setValue("Cubic feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.035315", outputDisplay.getText());
        }

        @Test
        @DisplayName("Milliliters tests")
        void MillilitersTests() {
            // Milliliters -> UK Gallons
            fromUnit.setValue("Milliliters");
            toUnit.setValue("UK Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.00022", outputDisplay.getText());

            helper.clear();
            // Milliliters -> US Gallons
            toUnit.setValue("US Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000264", outputDisplay.getText());

            helper.clear();
            // Milliliters -> Liters
            toUnit.setValue("Liters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001", outputDisplay.getText());

            helper.clear();
            // Milliliters -> Cubic Centimeters
            toUnit.setValue("Cubic Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1", outputDisplay.getText());

            helper.clear();
            // Milliliters -> Cubic meters
            toUnit.setValue("Cubic meters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000001", outputDisplay.getText());

            helper.clear();
            // Milliliters -> Cubic inches
            toUnit.setValue("Cubic inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.061024", outputDisplay.getText());

            helper.clear();
            // Milliliters -> Cubic feet
            toUnit.setValue("Cubic feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000035", outputDisplay.getText());
        }

        @Test
        @DisplayName("Cubic Centimeters tests")
        void CubicCentimetersTests() {
            // Cubic Centimeters -> UK Gallons
            fromUnit.setValue("Cubic Centimeters");
            toUnit.setValue("UK Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.00022", outputDisplay.getText());

            helper.clear();
            // Cubic Centimeters -> US Gallons
            toUnit.setValue("US Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000264", outputDisplay.getText());

            helper.clear();
            // Cubic Centimeters -> Liters
            toUnit.setValue("Liters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001", outputDisplay.getText());

            helper.clear();
            // Cubic Centimeters -> Milliliters
            toUnit.setValue("Milliliters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1", outputDisplay.getText());

            helper.clear();
            // Cubic Centimeters -> Cubic meters
            toUnit.setValue("Cubic meters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000001", outputDisplay.getText());

            helper.clear();
            // Cubic Centimeters -> Cubic inches
            toUnit.setValue("Cubic inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.061024", outputDisplay.getText());

            helper.clear();
            // Cubic Centimeters -> Cubic feet
            toUnit.setValue("Cubic feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000035", outputDisplay.getText());
        }

        @Test
        @DisplayName("Cubic meters tests")
        void CubicMetersTests() {
            // Cubic meters -> UK Gallons
            fromUnit.setValue("Cubic meters");
            toUnit.setValue("UK Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("219.969248", outputDisplay.getText());

            helper.clear();
            // Cubic meters -> US Gallons
            toUnit.setValue("US Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("264.172052", outputDisplay.getText());

            helper.clear();
            // Cubic meters -> Liters
            toUnit.setValue("Liters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000", outputDisplay.getText());

            helper.clear();
            // Cubic meters -> Milliliters
            toUnit.setValue("Milliliters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000000", outputDisplay.getText());

            helper.clear();
            // Cubic meters -> Cubic Centimeters
            toUnit.setValue("Cubic Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000000", outputDisplay.getText());

            helper.clear();
            // Cubic meters -> Cubic inches
            toUnit.setValue("Cubic inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("61023.744095", outputDisplay.getText());

            helper.clear();
            // Cubic meters -> Cubic feet
            toUnit.setValue("Cubic feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("35.314667", outputDisplay.getText());
        }

        @Test
        @DisplayName("Cubic inches tests")
        void CubicInchesTests() {
            // Cubic inches -> UK Gallons
            fromUnit.setValue("Cubic inches");
            toUnit.setValue("UK Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.003605", outputDisplay.getText());

            helper.clear();
            // Cubic inches -> US Gallons
            toUnit.setValue("US Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.004329", outputDisplay.getText());

            helper.clear();
            // Cubic inches -> Liters
            toUnit.setValue("Liters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.016387", outputDisplay.getText());

            helper.clear();
            // Cubic inches -> Milliliters
            toUnit.setValue("Milliliters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("16.387064", outputDisplay.getText());

            helper.clear();
            // Cubic inches -> Cubic Centimeters
            toUnit.setValue("Cubic Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("16.387064", outputDisplay.getText());

            helper.clear();
            // Cubic inches -> Cubic meters
            toUnit.setValue("Cubic meters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000016", outputDisplay.getText());

            helper.clear();
            // Cubic inches -> Cubic feet
            toUnit.setValue("Cubic feet");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000579", outputDisplay.getText());
        }

        @Test
        @DisplayName("Cubic feet tests")
        void CubicFeetTests() {
            // Cubic feet -> UK Gallons
            fromUnit.setValue("Cubic feet");
            toUnit.setValue("UK Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("6.228835", outputDisplay.getText());

            helper.clear();
            // Cubic feet -> US Gallons
            toUnit.setValue("US Gallons");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("7.480519", outputDisplay.getText());

            helper.clear();
            // Cubic feet -> Liters
            toUnit.setValue("Liters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("28.316847", outputDisplay.getText());

            helper.clear();
            // Cubic feet -> Milliliters
            toUnit.setValue("Milliliters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("28316.846592", outputDisplay.getText());

            helper.clear();
            // Cubic feet -> Cubic Centimeters
            toUnit.setValue("Cubic Centimeters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("28316.846592", outputDisplay.getText());

            helper.clear();
            // Cubic feet -> Cubic meters
            toUnit.setValue("Cubic meters");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.028317", outputDisplay.getText());

            helper.clear();
            // Cubic feet -> Cubic inches
            toUnit.setValue("Cubic inches");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1728", outputDisplay.getText());
        }
    }

    @Nested
    @DisplayName("Mass Tests")
    class MassTests {

        @BeforeEach
        void setVolumeCategory() {
            category.setValue("Mass");
            helper.updateUnitCombos();
        }

        @Test
        @DisplayName("Gram Tests")
        void testGram() {
            //Gram Tests
            //Gram -> Kilogram
            fromUnit.setValue("Grams(g)");
            toUnit.setValue("Kilogram(kg)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultG1 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.001, resultG1, 0.001);

            helper.clear();

            //Gram -> Ounce
            fromUnit.setValue("Grams(g)");
            toUnit.setValue("Ounces(oz)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultG2 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.035274, resultG2, .01);

            helper.clear();

            //Gram -> Pounds
            fromUnit.setValue("Grams(g)");
            toUnit.setValue("Pounds(lb)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultG3 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.002205, resultG3, 0.01);

            helper.clear();

            //Grams -> Tons(t)
            fromUnit.setValue("Grams(g)");
            toUnit.setValue("Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultG4 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.000001, resultG4, 0.01);

            helper.clear();

            //Grams -> UK Tons(t)
            fromUnit.setValue("Grams(g)");
            toUnit.setValue("UK Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultG5 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.000001, resultG5, 0.01);

            helper.clear();

            //Grams -> US Tons(t)
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
            fromUnit.setValue("Kilogram(kg)");
            toUnit.setValue("Grams(g)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultK1 = Double.parseDouble(outputDisplay.getText());
            assertEquals(1000.00001, resultK1, 0.001);

            helper.clear();

            //Kilograms to Ounces
            fromUnit.setValue("Kilogram(kg)");
            toUnit.setValue("Ounces(oz)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultK2 = Double.parseDouble(outputDisplay.getText());
            assertEquals(35.273962, resultK2, 0.001);

            helper.clear();
            //Kilograms to Pounds
            fromUnit.setValue("Kilogram(kg)");
            toUnit.setValue("Pounds(lb)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultK3 = Double.parseDouble(outputDisplay.getText());
            assertEquals(2.204623, resultK3, 0.001);

            helper.clear();
            //Kilograms to Tons
            fromUnit.setValue("Kilogram(kg)");
            toUnit.setValue("Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultK4 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.001, resultK4, 0.001);

            helper.clear();

            //Kilograms to UK Tons
            fromUnit.setValue("Kilogram(kg)");
            toUnit.setValue("UK Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultK5 = Double.parseDouble(outputDisplay.getText());
            assertEquals(0.000984, resultK5, 0.001);

            helper.clear();

            //Kilograms to US Tons
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
            fromUnit.setValue("Ounces(oz)");
            toUnit.setValue("Grams(g)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            double resultO1 = Double.parseDouble(outputDisplay.getText());
            assertEquals(28.349523, resultO1, 0.001);

            helper.clear();

            //Ounces to Kilograms
            fromUnit.setValue("Ounces(oz)");
            toUnit.setValue("Kilogram(kg)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.02835", outputDisplay.getText());

            helper.clear();

            //Ounces to Pounds
            fromUnit.setValue("Ounces(oz)");
            toUnit.setValue("Pounds(lb)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.0625", outputDisplay.getText());

            helper.clear();

            //Ounces to Tons
            fromUnit.setValue("Ounces(oz)");
            toUnit.setValue("Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000028", outputDisplay.getText());

            helper.clear();

            //Ounces to UK Tons
            fromUnit.setValue("Ounces(oz)");
            toUnit.setValue("UK Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000028", outputDisplay.getText());

            helper.clear();

            //Ounces to US Tons
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
            fromUnit.setValue("Pounds(lb)");
            toUnit.setValue("Grams(g)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("453.592374", outputDisplay.getText());

            helper.clear();

            //Pounds to Kilograms
            fromUnit.setValue("Pounds(lb)");
            toUnit.setValue("Kilogram(kg)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.453592", outputDisplay.getText());

            helper.clear();

            //Pounds to Ounces
            fromUnit.setValue("Pounds(lb)");
            toUnit.setValue("Ounces(oz)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("16", outputDisplay.getText());

            helper.clear();

            //Pounds to Tons
            fromUnit.setValue("Pounds(lb)");
            toUnit.setValue("Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000454", outputDisplay.getText());

            helper.clear();

            //Pounds to UK Tons
            fromUnit.setValue("Pounds(lb)");
            toUnit.setValue("UK Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000446", outputDisplay.getText());

            helper.clear();

            //Pounds to US Tons
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
            fromUnit.setValue("Tons(t)");
            toUnit.setValue("Grams(g)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000000.00991", outputDisplay.getText());

            helper.clear();

            //Tons to Kilograms
            fromUnit.setValue("Tons(t)");
            toUnit.setValue("Kilogram(kg)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000", outputDisplay.getText());

            helper.clear();

            //Tons to Ounces
            fromUnit.setValue("Tons(t)");
            toUnit.setValue("Ounces(oz)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("35273.96195", outputDisplay.getText());

            helper.clear();

            //Tons to Pounds
            fromUnit.setValue("Tons(t)");
            toUnit.setValue("Pounds(lb)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("2204.622622", outputDisplay.getText());

            helper.clear();

            //Tons to UK Tons
            fromUnit.setValue("Tons(t)");
            toUnit.setValue("UK Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.984207", outputDisplay.getText());

            helper.clear();

            //Tons to US Tons
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
            fromUnit.setValue("UK Tons(t)");
            toUnit.setValue("Grams(g)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1016046.918869", outputDisplay.getText());

            helper.clear();

            //UK Tons to Kilograms
            fromUnit.setValue("UK Tons(t)");
            toUnit.setValue("Kilogram(kg)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1016.046909", outputDisplay.getText());

            helper.clear();

            //UK Tons to Ounces
            fromUnit.setValue("UK Tons(t)");
            toUnit.setValue("Ounces(oz)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("35840", outputDisplay.getText());

            helper.clear();

            //UK Tons to Pounds
            fromUnit.setValue("UK Tons(t)");
            toUnit.setValue("Pounds(lb)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("2240", outputDisplay.getText());

            helper.clear();

            //UK Tons to Tons
            fromUnit.setValue("UK Tons(t)");
            toUnit.setValue("Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1.016047", outputDisplay.getText());

            helper.clear();

            //UK Tons to US Tons
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
            fromUnit.setValue("US Tons(t)");
            toUnit.setValue("Grams(g)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("907184.748991", outputDisplay.getText());

            helper.clear();

            //US Tons to Kilograms
            fromUnit.setValue("US Tons(t)");
            toUnit.setValue("Kilogram(kg)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("907.18474", outputDisplay.getText());

            helper.clear();

            //US Tons to Ounces
            fromUnit.setValue("US Tons(t)");
            toUnit.setValue("Ounces(oz)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("32000", outputDisplay.getText());

            helper.clear();

            //US Tons to Pounds
            fromUnit.setValue("US Tons(t)");
            toUnit.setValue("Pounds(lb)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("2000", outputDisplay.getText());

            helper.clear();

            //US Tons to UK Tons
            fromUnit.setValue("US Tons(t)");
            toUnit.setValue("UK Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.892857", outputDisplay.getText());

            helper.clear();

            //US Tons to Tons
            fromUnit.setValue("US Tons(t)");
            toUnit.setValue("Tons(t)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.907185", outputDisplay.getText());
        }
    }

    @Nested
    @DisplayName("Data Conversion Tests")
    class DataTests {

        @BeforeEach
        void setUp() {
            category.setValue("Data");
            helper.updateUnitCombos();
        }

        @Test
        @DisplayName("Bits tests")
        void BitsTests() {
            // Bits to Bytes
            fromUnit.setValue("Bits(bit)");
            toUnit.setValue("Bytes(B)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.0125", outputDisplay.getText());
            helper.clear();

            // Bits to Kilobytes
            fromUnit.setValue("Bits(bit)");
            toUnit.setValue("Kilobytes(KB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000013", outputDisplay.getText());
            helper.clear();

            // Bits to Kibibytes
            fromUnit.setValue("Bits(bit)");
            toUnit.setValue("Kibibytes(KiB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000012", outputDisplay.getText());
            helper.clear();

            // Bits to Megabytes
            fromUnit.setValue("Bits(bit)");
            toUnit.setValue("Megabytes(MB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();

            // Bits to Mebibytes
            fromUnit.setValue("Bits(bit)");
            toUnit.setValue("Mebibytes(MiB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();

            // Bits to Gigabytes
            fromUnit.setValue("Bits(bit)");
            toUnit.setValue("Gigabytes(GB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();

            // Bits to Gibibytes
            fromUnit.setValue("Bits(bit)");
            toUnit.setValue("Gibibytes(GiB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();

            // Bits to Terabytes
            fromUnit.setValue("Bits(bit)");
            toUnit.setValue("Terabytes(TB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();

            // Bits to Tebibytes
            fromUnit.setValue("Bits(bit)");
            toUnit.setValue("Tebibytes(TiB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();
        }

        @Test
        @DisplayName("Bytes tests")
        void BytesTests() {
            // Bytes to Bits
            fromUnit.setValue("Bytes(B)");
            toUnit.setValue("Bits(bit)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("80", outputDisplay.getText());
            helper.clear();

            // Bytes to Kilobytes
            fromUnit.setValue("Bytes(B)");
            toUnit.setValue("Kilobytes(KB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001", outputDisplay.getText());
            helper.clear();

            // Bytes to Kibibytes
            fromUnit.setValue("Bytes(B)");
            toUnit.setValue("Kibibytes(KiB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000977", outputDisplay.getText());
            helper.clear();

            // Bytes to Megabytes
            fromUnit.setValue("Bytes(B)");
            toUnit.setValue("Megabytes(MB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000001", outputDisplay.getText());
            helper.clear();

            // Bytes to Mebibytes
            fromUnit.setValue("Bytes(B)");
            toUnit.setValue("Mebibytes(MiB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000001", outputDisplay.getText());
            helper.clear();

            // Bytes to Gigabytes
            fromUnit.setValue("Bytes(B)");
            toUnit.setValue("Gigabytes(GB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();

            // Bytes to Gibibytes
            fromUnit.setValue("Bytes(B)");
            toUnit.setValue("Gibibytes(GiB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();

            // Bytes to Terabytes
            fromUnit.setValue("Bytes(B)");
            toUnit.setValue("Terabytes(TB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();

            // Bytes to Tebibytes
            fromUnit.setValue("Bytes(B)");
            toUnit.setValue("Tebibytes(TiB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();
        }

        @Test
        @DisplayName("Kilobytes tests")
        void KilobytesTests() {
            // Kilobytes to Bits
            fromUnit.setValue("Kilobytes(KB)");
            toUnit.setValue("Bits(bit)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("80000", outputDisplay.getText());
            helper.clear();

            // Kilobytes to Bytes
            fromUnit.setValue("Kilobytes(KB)");
            toUnit.setValue("Bytes(B)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1000", outputDisplay.getText());
            helper.clear();

            // Kilobytes to Kibibytes
            fromUnit.setValue("Kilobytes(KB)");
            toUnit.setValue("Kibibytes(KiB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.976563", outputDisplay.getText());
            helper.clear();

            // Kilobytes to Megabytes
            fromUnit.setValue("Kilobytes(KB)");
            toUnit.setValue("Megabytes(MB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001", outputDisplay.getText());
            helper.clear();

            // Kilobytes to Mebibytes
            fromUnit.setValue("Kilobytes(KB)");
            toUnit.setValue("Mebibytes(MiB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000954", outputDisplay.getText());
            helper.clear();

            // Kilobytes to Gigabytes
            fromUnit.setValue("Kilobytes(KB)");
            toUnit.setValue("Gigabytes(GB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000001", outputDisplay.getText());
            helper.clear();

            // Kilobytes to Gibibytes
            fromUnit.setValue("Kilobytes(KB)");
            toUnit.setValue("Gibibytes(GiB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000001", outputDisplay.getText());
            helper.clear();

            // Kilobytes to Terabytes
            fromUnit.setValue("Kilobytes(KB)");
            toUnit.setValue("Terabytes(TB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();

            // Kilobytes to Tebibytes
            fromUnit.setValue("Kilobytes(KB)");
            toUnit.setValue("Tebibytes(TiB)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());
            helper.clear();
        }
    }

    @Nested
    @DisplayName("Speed Tests")
    class SpeedTests {

        @BeforeEach
        void setUp() {
            category.setValue("Speed");
            helper.updateUnitCombos();
        }

        @Test
        @DisplayName("Meters per second tests")
        void MetersPerSecondTests() {
            // m/s to m/h
            fromUnit.setValue("Meters per second (m/s)");
            toUnit.setValue("Meters per hour (m/h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3599.999955", outputDisplay.getText());
            helper.clear();

            // m/s to km/s
            fromUnit.setValue("Meters per second (m/s)");
            toUnit.setValue("Kilometers per second (km/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001", outputDisplay.getText());
            helper.clear();

            // m/s to km/h
            fromUnit.setValue("Meters per second (m/s)");
            toUnit.setValue("Kilometers per hour (km/h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3.6", outputDisplay.getText());
            helper.clear();

            // m/s to in/s
            fromUnit.setValue("Meters per second (m/s)");
            toUnit.setValue("Inches per second (in/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("39.370079", outputDisplay.getText());
            helper.clear();

            // m/s to in/h
            fromUnit.setValue("Meters per second (m/s)");
            toUnit.setValue("Inches per hour (in/h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("141732.537452", outputDisplay.getText());
            helper.clear();

            // m/s to ft/s
            fromUnit.setValue("Meters per second (m/s)");
            toUnit.setValue("Feet per second (ft/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3.28084", outputDisplay.getText());
            helper.clear();

            // m/s to ft/h
            fromUnit.setValue("Meters per second (m/s)");
            toUnit.setValue("Feet per hour (ft/h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("11811.026079", outputDisplay.getText());
            helper.clear();

            // m/s to mi/s
            fromUnit.setValue("Meters per second (m/s)");
            toUnit.setValue("Miles per second (mi/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000621", outputDisplay.getText());
            helper.clear();

            // m/s to mi/h
            fromUnit.setValue("Meters per second (m/s)");
            toUnit.setValue("Miles per hour (mi/h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("2.236936", outputDisplay.getText());
            helper.clear();

            // m/s to knots
            fromUnit.setValue("Meters per second (m/s)");
            toUnit.setValue("Knots (kn)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1.943844", outputDisplay.getText());
            helper.clear();
        }

        @Test
        @DisplayName("Miles per hour tests")
        void MilesPerHourTests() {
            // mi/h to m/s
            fromUnit.setValue("Miles per hour (mi/h)");
            toUnit.setValue("Meters per second (m/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.44704", outputDisplay.getText());
            helper.clear();

            // mi/h to m/h
            fromUnit.setValue("Miles per hour (mi/h)");
            toUnit.setValue("Meters per hour (m/h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1609.34398", outputDisplay.getText());
            helper.clear();

            // mi/h to km/s
            fromUnit.setValue("Miles per hour (mi/h)");
            toUnit.setValue("Kilometers per second (km/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000447", outputDisplay.getText());
            helper.clear();

            // mi/h to km/h
            fromUnit.setValue("Miles per hour (mi/h)");
            toUnit.setValue("Kilometers per hour (km/h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1.609344", outputDisplay.getText());
            helper.clear();

            // mi/h to in/s
            fromUnit.setValue("Miles per hour (mi/h)");
            toUnit.setValue("Inches per second (in/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("17.6", outputDisplay.getText());
            helper.clear();

            // mi/h to in/h
            fromUnit.setValue("Miles per hour (mi/h)");
            toUnit.setValue("Inches per hour (in/h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("63360.113541", outputDisplay.getText());
            helper.clear();

            // mi/h to ft/s
            fromUnit.setValue("Miles per hour (mi/h)");
            toUnit.setValue("Feet per second (ft/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1.466667", outputDisplay.getText());
            helper.clear();

            // mi/h to ft/h
            fromUnit.setValue("Miles per hour (mi/h)");
            toUnit.setValue("Feet per hour (ft/h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("5280.001098", outputDisplay.getText());
            helper.clear();

            // mi/h to mi/s
            fromUnit.setValue("Miles per hour (mi/h)");
            toUnit.setValue("Miles per second (mi/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000278", outputDisplay.getText());
            helper.clear();

            // mi/h to knots
            fromUnit.setValue("Miles per hour (mi/h)");
            toUnit.setValue("Knots (kn)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.868976", outputDisplay.getText());
            helper.clear();
        }

        @Test
        @DisplayName("Kilometers per hour tests")
        void KilometersPerHourTests() {
            // km/h to m/s
            fromUnit.setValue("Kilometers per hour (km/h)");
            toUnit.setValue("Meters per second (m/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.277778", outputDisplay.getText());
            helper.clear();

            // km/h to m/h
            fromUnit.setValue("Kilometers per hour (km/h)");
            toUnit.setValue("Meters per hour (m/h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("999.999987", outputDisplay.getText());
            helper.clear();

            // km/h to km/s
            fromUnit.setValue("Kilometers per hour (km/h)");
            toUnit.setValue("Kilometers per second (km/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000278", outputDisplay.getText());
            helper.clear();

            // km/h to in/s
            fromUnit.setValue("Kilometers per hour (km/h)");
            toUnit.setValue("Inches per second (in/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("10.936133", outputDisplay.getText());
            helper.clear();

            // km/h to in/h
            fromUnit.setValue("Kilometers per hour (km/h)");
            toUnit.setValue("Inches per hour (in/h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("39370.149289", outputDisplay.getText());
            helper.clear();

            // km/h to ft/s
            fromUnit.setValue("Kilometers per hour (km/h)");
            toUnit.setValue("Feet per second (ft/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.911344", outputDisplay.getText());
            helper.clear();

            // km/h to ft/h
            fromUnit.setValue("Kilometers per hour (km/h)");
            toUnit.setValue("Feet per hour (ft/h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3280.840577", outputDisplay.getText());
            helper.clear();

            // km/h to mi/s
            fromUnit.setValue("Kilometers per hour (km/h)");
            toUnit.setValue("Miles per second (mi/s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000173", outputDisplay.getText());
            helper.clear();

            // km/h to mi/h
            fromUnit.setValue("Kilometers per hour (km/h)");
            toUnit.setValue("Miles per hour (mi/h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.621371", outputDisplay.getText());
            helper.clear();

            // km/h to knots
            fromUnit.setValue("Kilometers per hour (km/h)");
            toUnit.setValue("Knots (kn)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.539957", outputDisplay.getText());
            helper.clear();
        }

    }

    @Nested
    @DisplayName("Time Tests")
    class TimeTests {

        @BeforeEach
        void setVolumeCategory() {
            category.setValue("Time");
            helper.updateUnitCombos();
        }

        @Test
        @DisplayName("Day Tests")
        void testDay() {
            //Day Tests
            //Day to Hour
            fromUnit.setValue("Days(d)");
            toUnit.setValue("Hours(h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("24", outputDisplay.getText());

            helper.clear();

            //Day to Milliseconds
            fromUnit.setValue("Days(d)");
            toUnit.setValue("Milliseconds(ms)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("86399827.200346", outputDisplay.getText());

            helper.clear();

            //Day to Seconds
            fromUnit.setValue("Days(d)");
            toUnit.setValue("Seconds(s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("86399.999827", outputDisplay.getText());

            helper.clear();

            //Day to Minutes
            fromUnit.setValue("Days(d)");
            toUnit.setValue("Minutes(min)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("1440", outputDisplay.getText());

            helper.clear();

            //Day to Weeks
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
            fromUnit.setValue("Hours(h)");
            toUnit.setValue("Days(d)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.041667", outputDisplay.getText());

            helper.clear();

            //Hour to Milliseconds
            fromUnit.setValue("Hours(h)");
            toUnit.setValue("Milliseconds(ms)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3599992.800014", outputDisplay.getText());

            helper.clear();

            //Hour to Seconds
            fromUnit.setValue("Hours(h)");
            toUnit.setValue("Seconds(s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("3599.999993", outputDisplay.getText());

            helper.clear();

            //Hour to Minutes
            fromUnit.setValue("Hours(h)");
            toUnit.setValue("Minutes(min)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("60", outputDisplay.getText());

            helper.clear();

            //Hour to Week
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
            fromUnit.setValue("Milliseconds(ms)");
            toUnit.setValue("Days(d)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());

            helper.clear();

            //Milliseconds to Hours
            fromUnit.setValue("Milliseconds(ms)");
            toUnit.setValue("Hours(h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0", outputDisplay.getText());

            helper.clear();

            //Milliseconds to Seconds
            fromUnit.setValue("Milliseconds(ms)");
            toUnit.setValue("Seconds(s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.001", outputDisplay.getText());

            helper.clear();

            //Milliseconds to Minutes
            fromUnit.setValue("Milliseconds(ms)");
            toUnit.setValue("Minutes(min)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000017", outputDisplay.getText());

            helper.clear();

            //Milliseconds to Weeks
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
            fromUnit.setValue("Seconds(s)");
            toUnit.setValue("Days(d)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000012", outputDisplay.getText());

            helper.clear();

            //Seconds to Hours
            fromUnit.setValue("Seconds(s)");
            toUnit.setValue("Hours(h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000278", outputDisplay.getText());

            helper.clear();

            //Seconds to Milliseconds
            fromUnit.setValue("Seconds(s)");
            toUnit.setValue("Milliseconds(ms)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("999.998002", outputDisplay.getText());

            helper.clear();

            //Seconds to Minute
            fromUnit.setValue("Seconds(s)");
            toUnit.setValue("Minutes(min)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.016667", outputDisplay.getText());

            helper.clear();
            //Seconds to Week
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
            fromUnit.setValue("Minutes(min)");
            toUnit.setValue("Days(d)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.000694", outputDisplay.getText());

            helper.clear();

            //Minutes to Hours
            fromUnit.setValue("Minutes(min)");
            toUnit.setValue("Hours(h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("0.016667", outputDisplay.getText());

            helper.clear();

            //Minutes to Milliseconds
            fromUnit.setValue("Minutes(min)");
            toUnit.setValue("Milliseconds(ms)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("59999.88", outputDisplay.getText());

            helper.clear();

            //Minutes to Seconds
            fromUnit.setValue("Minutes(min)");
            toUnit.setValue("Seconds(s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("60", outputDisplay.getText());

            helper.clear();

            //Minutes to Weeks
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
            fromUnit.setValue("Weeks(wk)");
            toUnit.setValue("Days(d)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("7", outputDisplay.getText());

            helper.clear();

            //Week to Hours
            fromUnit.setValue("Weeks(wk)");
            toUnit.setValue("Hours(h)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("168", outputDisplay.getText());

            helper.clear();

            //Week to Milliseconds
            fromUnit.setValue("Weeks(wk)");
            toUnit.setValue("Milliseconds(ms)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("604798790.402419", outputDisplay.getText());

            helper.clear();

            //Week to Seconds
            fromUnit.setValue("Weeks(wk)");
            toUnit.setValue("Seconds(s)");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("604799.99879", outputDisplay.getText());

            helper.clear();

            //Week to Minutes
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

        @BeforeEach
        void setVolumeCategory() {
            category.setValue("Temperature");
            helper.updateUnitCombos();
        }

        @Test
        @DisplayName("Fahrenheit Tests")
        void testFahrenheit() {
            //Fahrenheit Tests
            //Fahrenheit to Celsius
            fromUnit.setValue("Fahrenheit");
            toUnit.setValue("Celsius");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("-17.222222", outputDisplay.getText());

            helper.clear();

            //Fahrenheit to Kelvin
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
            fromUnit.setValue("Celsius");
            toUnit.setValue("Fahrenheit");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("33.8", outputDisplay.getText());

            helper.clear();

            //Celsius to Kelvin
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
            fromUnit.setValue("Kelvin");
            toUnit.setValue("Celsius");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("-272.15", outputDisplay.getText());

            helper.clear();

            //Kelvin to Fahrenheit
            fromUnit.setValue("Kelvin");
            toUnit.setValue("Fahrenheit");
            inputDisplay.setText("1");
            helper.convert(inputDisplay, outputDisplay, fromUnit.getValue(), toUnit.getValue());
            assertEquals("-457.87", outputDisplay.getText());
        }
    }
}
