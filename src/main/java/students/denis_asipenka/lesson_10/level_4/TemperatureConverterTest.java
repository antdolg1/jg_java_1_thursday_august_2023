package students.denis_asipenka.lesson_10.level_4;

public class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.converterKelvin();
        test.converterFahrenheit();
    }

    void converterKelvin() {
        double celsius = 13.0;
        double result = 286.15;
        KelvinConverter kelvinConverter = new KelvinConverter();
        checkResult(kelvinConverter.convert(celsius) == result, "Тест на перевод из цельсия в кельвин: ");
    }

    void converterFahrenheit() {
        double celsius = 532.0;
        double result = 990.0;
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        checkResult(fahrenheitConverter.convert(celsius) == result, "Тест на перевод из цельсия в фаренгейта: ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}