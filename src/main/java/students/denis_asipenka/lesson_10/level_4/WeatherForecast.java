package students.denis_asipenka.lesson_10.level_4;

public class WeatherForecast implements AirTemperature {
    @Override
    public double degreesKelvins(int degreescelsius) {
        return degreescelsius + 273.15;
    }

    @Override
    public double degreesFahrenheit(int degreescelsius) {
        return (double) (degreescelsius * 9 / 5) + 32;
    }
}