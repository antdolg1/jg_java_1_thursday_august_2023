package students.denis_asipenka.lesson_10.level_7.task_25;

public class Context {
    private TemperatureConverter temperatureConverter;

    public void setStrategy(TemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }

    public double executeStrategy(double a) {
        return temperatureConverter.convert(a);
    }
}