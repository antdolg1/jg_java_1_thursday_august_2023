package students.denis_asipenka.lesson_10.level_7.task_28;

public class FahrenheitToKelvinConverter implements ConverterTo {
    @Override
    public double convert(double temperature) {
        return ((temperature - 32) / 1.8) + 273.15;
    }
}