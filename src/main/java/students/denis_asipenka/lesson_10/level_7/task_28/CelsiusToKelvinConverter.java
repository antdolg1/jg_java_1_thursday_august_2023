package students.denis_asipenka.lesson_10.level_7.task_28;

public class CelsiusToKelvinConverter implements ConverterTo {
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}