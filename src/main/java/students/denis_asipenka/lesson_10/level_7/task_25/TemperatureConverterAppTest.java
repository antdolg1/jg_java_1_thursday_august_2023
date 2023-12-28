package students.denis_asipenka.lesson_10.level_7.task_25;

public class TemperatureConverterAppTest {
    public static void main(String[] args) {
        TemperatureConverterAppTest test = new TemperatureConverterAppTest();
        test.fahrenheitConverterTest();
        test.kelvinConverterTest();
        test.celsiusConverterTest();
    }

    void fahrenheitConverterTest() {
        String convertName = "fahrenheit";
        double result = 133;
        double temperature = 56;
        TemperatureConverterApp temperatureConverterApp = new TemperatureConverterApp();
        checkResult(temperatureConverterApp.converter(temperature, convertName) == result, "Тест на перевод из цельсия в фаренгейт: ");
    }

    void kelvinConverterTest() {
        String convertName = "kelvin";
        double result = 329.15;
        double temperature = 56;
        TemperatureConverterApp temperatureConverterApp = new TemperatureConverterApp();
        checkResult(temperatureConverterApp.converter(temperature, convertName) == result, "Тест на перевод из цельсия в кельвины: ");
    }

    void celsiusConverterTest() {
        String convertName = "celsius";
        double result = 56;
        double temperature = 56;
        TemperatureConverterApp temperatureConverterApp = new TemperatureConverterApp();
        checkResult(temperatureConverterApp.converter(temperature, convertName) == result, "Тест на перевод из цельсия в цельсия: ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}