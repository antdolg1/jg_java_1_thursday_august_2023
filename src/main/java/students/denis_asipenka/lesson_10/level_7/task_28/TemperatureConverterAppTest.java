package students.denis_asipenka.lesson_10.level_7.task_28;

public class TemperatureConverterAppTest {
    public static void main(String[] args) {
        TemperatureConverterAppTest test = new TemperatureConverterAppTest();
        test.celsiusToCelsiusConverter();
        test.celsiusToFahrenheitConverter();
        test.celsiusToKelvinConverter();
        test.fahrenheitToCelsiusConverter();
        test.fahrenheitToKelvinConverter();
        test.fahrenheitToFahrenheitConverter();
        test.kelvinToCelsiusConverter();
        test.kelvinToFahrenheitConverter();
        test.kelvinToKelvinConverter();
    }

    void celsiusToCelsiusConverter() {
        TemperatureUnit convertName = TemperatureUnit.CELSIUS_CELSIUS;
        double result = 56;
        double temperature = 56;
        TemperatureConverterApp temperatureConverterApp = new TemperatureConverterApp();
        checkResult(temperatureConverterApp.converter(temperature, convertName) == result, "Тест на перевод из цельсия в цельсия: ");
    }

    void celsiusToFahrenheitConverter() {
        TemperatureUnit convertName = TemperatureUnit.CELSIUS_FAHRENHEIT;
        double result = 132.8;
        double temperature = 56;
        TemperatureConverterApp temperatureConverterApp = new TemperatureConverterApp();
        checkResult(temperatureConverterApp.converter(temperature, convertName) == result, "Тест на перевод из цельсия в фаренгейт: ");
    }

    void celsiusToKelvinConverter() {
        TemperatureUnit convertName = TemperatureUnit.CELSIUS_KELVIN;
        double result = 329.15;
        double temperature = 56;
        TemperatureConverterApp temperatureConverterApp = new TemperatureConverterApp();
        checkResult(temperatureConverterApp.converter(temperature, convertName) == result, "Тест на перевод из цельсия в кельвины: ");
    }

    void fahrenheitToCelsiusConverter() {
        TemperatureUnit convertName = TemperatureUnit.FAHRENHEIT_CELSIUS;
        double result = 281.6666666666667;
        double temperature = 539;
        TemperatureConverterApp temperatureConverterApp = new TemperatureConverterApp();
        checkResult(temperatureConverterApp.converter(temperature, convertName) == result, "Тест на перевод из фаренгейт в цельсии: ");
    }

    void fahrenheitToKelvinConverter() {
        TemperatureUnit convertName = TemperatureUnit.FAHRENHEIT_KELVIN;
        double result = 554.8166666666666;
        double temperature = 539;
        TemperatureConverterApp temperatureConverterApp = new TemperatureConverterApp();
        checkResult(temperatureConverterApp.converter(temperature, convertName) == result, "Тест на перевод из фаренгейт в кельвины: ");
    }

    void fahrenheitToFahrenheitConverter() {
        TemperatureUnit convertName = TemperatureUnit.FAHRENHEIT_FAHRENHEIT;
        double result = 539;
        double temperature = 539;
        TemperatureConverterApp temperatureConverterApp = new TemperatureConverterApp();
        checkResult(temperatureConverterApp.converter(temperature, convertName) == result, "Тест на перевод из фаренгейт в фаренгейт: ");
    }

    void kelvinToCelsiusConverter() {
        TemperatureUnit convertName = TemperatureUnit.KELVIN_CELSIUS;
        double result = 182.85000000000002;
        double temperature = 456;
        TemperatureConverterApp temperatureConverterApp = new TemperatureConverterApp();
        checkResult(temperatureConverterApp.converter(temperature, convertName) == result, "Тест на перевод из кельвинов в цельсии: ");
    }

    void kelvinToFahrenheitConverter() {
        TemperatureUnit convertName = TemperatureUnit.KELVIN_FAHRENHEIT;
        double result = 361.13000000000005;
        double temperature = 456;
        TemperatureConverterApp temperatureConverterApp = new TemperatureConverterApp();
        checkResult(temperatureConverterApp.converter(temperature, convertName) == result, "Тест на перевод из кельвинов в фаренгейт: ");
    }

    void kelvinToKelvinConverter() {
        TemperatureUnit convertName = TemperatureUnit.KELVIN_KELVIN;
        double result = 456;
        double temperature = 456;
        TemperatureConverterApp temperatureConverterApp = new TemperatureConverterApp();
        checkResult(temperatureConverterApp.converter(temperature, convertName) == result, "Тест на перевод из кельвинов в кельвины: ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}