package students.denis_asipenka.lesson_10.level_7.task_28;


public class TemperatureConverterApp {
    Context context = new Context();
    double converter(double a, TemperatureUnit nameMethod) {
        if (nameMethod.equals(TemperatureUnit.CELSIUS_CELSIUS)) {
            context.setStrategy(new CelsiusToCelsiusConverter());
        } else if (nameMethod.equals(TemperatureUnit.CELSIUS_KELVIN)) {
            context.setStrategy(new CelsiusToKelvinConverter());
        } else if (nameMethod.equals(TemperatureUnit.CELSIUS_FAHRENHEIT)) {
            context.setStrategy(new CelsiusToFahrenheitConverter());
        }else if (nameMethod.equals(TemperatureUnit.FAHRENHEIT_CELSIUS)) {
            context.setStrategy(new FahrenheitToCelsiusConverter());
        } else if (nameMethod.equals(TemperatureUnit.FAHRENHEIT_KELVIN)) {
            context.setStrategy(new FahrenheitToKelvinConverter());
        } else if (nameMethod.equals(TemperatureUnit.FAHRENHEIT_FAHRENHEIT)) {
            context.setStrategy(new FahrenheitToFahrenheitConverter());
        }else if (nameMethod.equals(TemperatureUnit.KELVIN_FAHRENHEIT)) {
            context.setStrategy(new KelvinToFahrenheitConverter());
        } else if (nameMethod.equals(TemperatureUnit.KELVIN_KELVIN)) {
            context.setStrategy(new KelvinToKelvinConverter());
        } else if (nameMethod.equals(TemperatureUnit.KELVIN_CELSIUS)) {
            context.setStrategy(new KelvinToCelsiusConverter());
        }
        return context.executeStrategy(a);
    }
}
