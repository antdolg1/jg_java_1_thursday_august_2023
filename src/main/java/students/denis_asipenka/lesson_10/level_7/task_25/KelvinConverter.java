package students.denis_asipenka.lesson_10.level_7.task_25;

public class KelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}