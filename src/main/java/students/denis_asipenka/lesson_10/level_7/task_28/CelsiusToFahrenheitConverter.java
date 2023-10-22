package students.denis_asipenka.lesson_10.level_7.task_28;

public class CelsiusToFahrenheitConverter implements ConverterTo {
    @Override
    public double convert(double temperature) {
        return 1.8 * temperature + 32;
    }
}