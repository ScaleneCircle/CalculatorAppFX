package com.example.calculatorappfxtests;

import com.example.calculatorappfx.MasterController;
import javafx.application.Platform;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class MasterControllerUITests {

    private MasterController controller;

    @BeforeAll
    static void initToolkit() {
        try {
            Platform.startup(() -> {});
        } catch (IllegalStateException e) {

        }
    }

    @BeforeEach
    void setUp() {
        controller = new MasterController();

        controller.calculatorPane = new Pane();
        controller.converterPane = new Pane();
        controller.scientificPane = new Pane();
        controller.rootPane = new Pane();
        controller.basicDisplay = new TextField();
        controller.scientificDisplay = new TextField();

        controller.inputDisplay = new TextField();
        controller.outputDisplay = new TextField();
        controller.activeDisplay = null;
        controller.fromUnit = new ComboBox<>();
        controller.toUnit = new ComboBox<>();
        controller.category = new ComboBox<>();

        controller.initialize();
    }

    @Test
    @DisplayName("Switch to Calculator: Calculator pane visible, others hidden")
    void testSwitchToCalculator() {
        controller.switchToScientific();

        controller.switchToCalculator();

        assertTrue(controller.calculatorPane.isVisible());
        assertTrue(controller.calculatorPane.isManaged());
        assertFalse(controller.converterPane.isVisible());
        assertFalse(controller.converterPane.isManaged());
        assertFalse(controller.scientificPane.isVisible());
        assertFalse(controller.scientificPane.isManaged());
    }

    @Test
    @DisplayName("Switch to Scientific: Scientific pane visible, others hidden")
    void testSwitchToScientific() {
        controller.switchToScientific();

        assertTrue(controller.scientificPane.isVisible());
        assertTrue(controller.scientificPane.isManaged());
        assertFalse(controller.calculatorPane.isVisible());
        assertFalse(controller.calculatorPane.isManaged());
        assertFalse(controller.converterPane.isVisible());
        assertFalse(controller.converterPane.isManaged());
    }

    @Test
    @DisplayName("Switch to Converter: Converter pane visible, others hidden")
    void testSwitchToConverter() {
        controller.switchToConverter();

        assertTrue(controller.converterPane.isVisible());
        assertTrue(controller.converterPane.isManaged());
        assertFalse(controller.calculatorPane.isVisible());
        assertFalse(controller.calculatorPane.isManaged());
        assertFalse(controller.scientificPane.isVisible());
        assertFalse(controller.scientificPane.isManaged());
    }

    @Test
    @DisplayName("Switch multiple times: Calculator -> Scientific -> Converter -> Calculator")
    void testMultipleSwitches() {
        // Start at calculator (default)
        assertTrue(controller.calculatorPane.isVisible());

        // Switch to scientific
        controller.switchToScientific();
        assertTrue(controller.scientificPane.isVisible());
        assertFalse(controller.calculatorPane.isVisible());

        // Switch to converter
        controller.switchToConverter();
        assertTrue(controller.converterPane.isVisible());
        assertFalse(controller.scientificPane.isVisible());

        // Switch back to calculator
        controller.switchToCalculator();
        assertTrue(controller.calculatorPane.isVisible());
        assertFalse(controller.converterPane.isVisible());
    }

    @Test
    @DisplayName("Initial state: Calculator pane should be visible by default")
    void testInitialState() {
        assertTrue(controller.calculatorPane.isVisible());
        assertTrue(controller.calculatorPane.isManaged());
        assertFalse(controller.converterPane.isVisible());
        assertFalse(controller.scientificPane.isVisible());
    }
}
