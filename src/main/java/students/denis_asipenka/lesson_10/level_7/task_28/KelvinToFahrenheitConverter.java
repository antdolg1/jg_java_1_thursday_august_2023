package students.denis_asipenka.lesson_10.level_7.task_28;

public class KelvinToFahrenheitConverter implements ConverterTo {
    @Override
    public double convert(double temperature) {
        return (temperature - 273.15) * 1.8 + 32;
    }
}