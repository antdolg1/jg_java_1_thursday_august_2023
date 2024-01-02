package teacher.lesson_11.lessoncode;

public class TemperatureConverter {

    public static double convertTemperature(double temperature, String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("celsius") && toUnit.equalsIgnoreCase("fahrenheit")) {
            return (temperature * 9 / 5) + 32;
        } else if (fromUnit.equalsIgnoreCase("fahrenheit") && toUnit.equalsIgnoreCase("celsius")) {
            return (temperature - 32) * 5 / 9;
        } else if (fromUnit.equalsIgnoreCase("celsius") && toUnit.equalsIgnoreCase("kelvin")) {
            return temperature + 273.15;
        } else if (fromUnit.equalsIgnoreCase("kelvin") && toUnit.equalsIgnoreCase("celsius")) {
            return temperature - 273.15;
        } else if (fromUnit.equalsIgnoreCase("fahrenheit") && toUnit.equalsIgnoreCase("kelvin")) {
            return (temperature + 459.67) * 5 / 9;
        } else if (fromUnit.equalsIgnoreCase("kelvin") && toUnit.equalsIgnoreCase("fahrenheit")) {
            return temperature * 9 / 5 - 459.67;
        } else {
            System.out.println("Invalid temperature units");
            return 0;
        }
    }

    public static void main(String[] args) {

        double celsiusTemp = 4.0;
        double fahrenheitTemp = convertTemperature(celsiusTemp, "celSIus", "fahrenheit");
        System.out.println(celsiusTemp + " degrees Celsius is equal to " + fahrenheitTemp + " degrees Fahrenheit.");

    }

}
