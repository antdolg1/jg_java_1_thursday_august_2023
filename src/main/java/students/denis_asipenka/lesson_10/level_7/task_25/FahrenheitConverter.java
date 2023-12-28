package students.denis_asipenka.lesson_10.level_7.task_25;

public class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return Math.round(1.8 * celsiusTemperature) + 32;
    }
}