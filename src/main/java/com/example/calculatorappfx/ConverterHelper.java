package com.example.calculatorappfx;

import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.*;

public class ConverterHelper {

    private TextField inputDisplay;
    private TextField outputDisplay;
    private ComboBox<String> fromUnit;
    private ComboBox<String> toUnit;
    private ComboBox<String> category;

    private final Map<String, Map<String, Double>> conversionFactors;
    private final Map<String, String> baseUnits;

    /**
     * Constructor for ConverterHelper, it initializes and keeps track of the data in the converter UI
     * @param inputDisplay - Top display in the converter, input by default
     * @param outputDisplay - Bottom display in the converter, output by default
     * @param fromUnit - Unit in top dropdown box, the unit converting from
     * @param toUnit - Unit in the bottom dropdown box, the unit converting to
     * @param category - Type of conversion chosen in the dropdown above the conversion
     */
    public ConverterHelper(TextField inputDisplay, TextField outputDisplay,
                           ComboBox<String> fromUnit,
                           ComboBox<String> toUnit,
                           ComboBox<String> category) {
        this.inputDisplay = inputDisplay;
        this.outputDisplay = outputDisplay;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.category = category;

        conversionFactors = new HashMap<>();
        baseUnits = new HashMap<>();
        initializeConversions();

        inputDisplay.setAlignment(Pos.CENTER_LEFT);
        outputDisplay.setAlignment(Pos.CENTER_LEFT);

        populateCategoryCombo();
    }

    /**
     * Keeps track of all the unit conversion ratios and references them for converting
     */
    private void initializeConversions(){
        //Area
        Map<String, Double> area = new HashMap<>();
        area.put("Acre(ac)", 43560.0);
        area.put("Ares(a)", 1076.391041671);
        area.put("Hectares(ha)", 107639.1041671);
        area.put("Square Centimeters", 0.001076391);
        area.put("Square Feet",1.0);
        area.put("Square Inches", 0.006944444);
        area.put("Square Meters",10.7639104167);
        conversionFactors.put("Area", area);
        baseUnits.put("Area", "Square Feet");

        //Length
        Map<String, Double> length = new HashMap<>();
        length.put("Millimeter", .001);
        length.put("Centimeter", .01);
        length.put("Meter", 1.0);
        length.put("Kilometer", 1000.0);
        length.put("Inch", .0254);
        length.put("Foot", .3048);
        length.put("Yard", .9144);
        length.put("Mile", 1609.344);
        length.put("Nautical Mile", 1852.0);
        length.put("Mils", .0000254);
        conversionFactors.put("Length", length);
        baseUnits.put("Length", "Meter");

        //Volume
        Map<String, Double> volume = new HashMap<>();
        volume.put("UK Gallons", 4.54609);
        volume.put("US Gallons", 3.785411784);
        volume.put("Liters", 1.0);
        volume.put("Milliliters", .001);
        volume.put("Cubic Centimeters", .001);
        volume.put("Cubic meters", 1000.0);
        volume.put("Cubic inches", 0.016387064);
        volume.put("Cubic feet", 28.316846592);
        conversionFactors.put("Volume", volume);
        baseUnits.put("Volume", "Liter");

        //Mass
        Map<String, Double> mass = new HashMap<>();
        mass.put("Tons(t)", 2204.6226218488);
        mass.put("UK Tons(t)", 2240.0);
        mass.put("US Tons(t)", 2000.0);
        mass.put("Pounds(lb)", 1.0);
        mass.put("Ounces(oz)", 0.0625);
        mass.put("Kilogram(kg)", 2.2046226218);
        mass.put("Grams(g)", 0.0022046226);
        conversionFactors.put("Mass", mass);
        baseUnits.put("Mass", "Pound");

        //Data
        Map<String, Double> data = new HashMap<>();
        data.put("Bits(bit)", .0125);
        data.put("Bytes(B)", 1.0);
        data.put("Kilobytes(KB)", 1000.0);
        data.put("Kibibytes(KiB)", 1024.0);
        data.put("Megabytes(MB)", 1000000.0);
        data.put("Mebibytes(MiB)", 1048576.0);
        data.put("Gigabytes(GB)", 1000000000.0);
        data.put("Gibibytes(GiB)", 1073741824.0);
        data.put("Terabytes(TB)", 1000000000000.0);
        data.put("Tebibytes(TiB)", 1099511627776.0);
        conversionFactors.put("Data", data);
        baseUnits.put("Data", "Bytes");

        //Speed
        Map<String, Double> speed = new HashMap<>();
        speed.put("Meters per second (m/s)", 2.2369362921);
        speed.put("Meters per hour (m/h)", .0006213712);
        speed.put("Kilometers per second (km/s)", 2236.9362920544);
        speed.put("Kilometers per hour (km/h)", .6213711922);
        speed.put("Inches per second (in/s)", .0568181818);
        speed.put("Inches per hour (in/h)", .0000157828);
        speed.put("Feet per second (ft/s)", .6818181818);
        speed.put("Feet per hour (ft/h)", .0001893939);
        speed.put("Miles per second (mi/s)", 3600.0);
        speed.put("Miles per hour (mi/h)", 1.0);
        speed.put("Knots (kn)", 1.150779448);
        conversionFactors.put("Speed", speed);
        baseUnits.put("Speed", "Miles");

        //Time
        Map<String, Double> time = new HashMap<>();
        time.put("Milliseconds(ms)", 0.0000166667);
        time.put("Seconds(s)", 0.0166666667);
        time.put("Minutes(min)", 1.0);
        time.put("Hours(h)", 60.0);
        time.put("Days(d)", 1440.0);
        time.put("Weeks(wk)", 10080.0);
        conversionFactors.put("Time", time);
        baseUnits.put("Time", "Minutes");

        //Temperature
        Map<String, Double> temperature = new HashMap<>();
        temperature.put("Celsius", 1.0);
        temperature.put("Fahrenheit", 1.0);
        temperature.put("Kelvin", 1.0);
        conversionFactors.put("Temperature", temperature);
        baseUnits.put("Temperature", "Celsius");
    }

    /**
     * Stores all the conversion categories in the proper dropdown box
     */
    private void populateCategoryCombo() {
        category.getItems().clear();
        category.getItems().addAll(conversionFactors.keySet());
        if (!category.getItems().isEmpty()) {
            category.setValue(category.getItems().get(0));
            updateUnitCombos();
        }
    }

    /**
     * Takes the conversion data and stores it for all categories
     */
    public void updateUnitCombos() {
        String cat= category.getValue();
        if (category == null) return;

        Set<String> units = conversionFactors.get(cat).keySet();
        List<String> unitList = new ArrayList<>(units);
        Collections.sort(unitList);

        fromUnit.getItems().clear();
        toUnit.getItems().clear();
        fromUnit.getItems().addAll(unitList);
        toUnit.getItems().addAll(unitList);

        if (!unitList.isEmpty()) {
            fromUnit.setValue(unitList.get(0));
            toUnit.setValue(unitList.size() > 1 ? unitList.get(1) : unitList.get(0));
        }
    }

    /**
     * For non-temperature conversions, this function sets up the conversion and then formats it for display
     * @param source - the current 'input' display
     * @param target - the current 'output' display
     * @param from - the unit converting from (in the current 'input' display
     * @param to - the unit converting to (in the current 'output' display)
     */
    public void convert(TextField source, TextField target, String from, String to) {
        try {
            String inputText = source.getText().trim();
            if (inputText.isEmpty()) {
                target.setText("");
                return;
            }

            double value = Double.parseDouble(inputText);
            String cat = category.getValue();

            double result = performConversion(value, from, to, cat);

            //TODO look at this + error stuff
            if (result % 1 == 0 && Math.abs(result) < 1e10) {
                target.setText(String.valueOf((long) result));
            } else {
                target.setText(String.format("%.6f", result).replaceAll("0+$", "").replaceAll("\\.$", ""));
            }
        } catch (NumberFormatException e) {
            target.setText("Invalid input");
        } catch (Exception e) {
            target.setText("Error");
        }
    }

    /**
     * Takes the given value and converts it from a given unit to another given unit
     * @param value - the value that is being converted
     * @param fromUnit - Unit that is being converted to
     * @param toUnit - Unit to be converted to
     * @param cat - category of the units
     * @return - the result of the conversion
     */
    private double performConversion(double value, String fromUnit, String toUnit, String cat) {
        if(cat.equals("Temperature")) {
            return convertTemperature(value, fromUnit, toUnit);
        }
        Map<String, Double> factors = conversionFactors.get(cat);

        double inBaseUnit = value * factors.get(fromUnit);
        return inBaseUnit / factors.get(toUnit);
    }

    /**
     * Does conversions for temperatures
     * @param value - value to be converted
     * @param from - temperature to convert from
     * @param to - temperature to convert to
     * @return - the result of value being converted
     */
    private double convertTemperature(double value, String from, String to) {
        double celsius = switch (from) {
            case "Celsius" -> value;
            case "Fahrenheit" -> (value - 32) * 5 / 9;
            case "Kelvin" -> value - 273.15;
            default -> value;
        };

        return switch (to) {
            case "Celsius" -> celsius;
            case "Fahrenheit" -> (celsius  * 9 / 5) + 32;
            case "Kelvin" -> celsius + 273.15;
            default -> celsius;
        };
    }

    public void clear(){
        inputDisplay.setText("0");
        outputDisplay.setText("0");
    };
}
