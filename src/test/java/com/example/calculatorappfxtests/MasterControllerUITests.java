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
            // Toolkit already initialized, ignore
        }
    }

    @BeforeEach
    void setUp() {
        controller = new MasterController();

        // Manually initialize the components that would normally be injected by FXML
        controller.calculatorPane = new Pane();
        controller.converterPane = new Pane();
        controller.scientificPane = new Pane();
        controller.rootPane = new Pane();
        controller.display = new TextField();

        // Initialize the controller
        controller.initialize();
    }

    @Test
    @DisplayName("Switch to Calculator: Calculator pane visible, others hidden")
    void testSwitchToCalculator() {
        // First switch to another pane
        controller.switchToScientific();

        // Then switch back to calculator
        controller.switchToCalculator();

        assertTrue(controller.calculatorPane.isVisible());
        assertTrue(controller.calculatorPane.isManaged());
        assertFalse(controller.converterPane.isVisible());
        assertFalse(controller.converterPane.isManaged());
        assertFalse(controller.scientificPane.isVisible());
        assertFalse(controller.scientificPane.isManaged());
    }

}
