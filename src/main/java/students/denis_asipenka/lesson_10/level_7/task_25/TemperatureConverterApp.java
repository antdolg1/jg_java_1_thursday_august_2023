package students.denis_asipenka.lesson_10.level_7.task_25;

public class TemperatureConverterApp {
    double converter(double a, String nameMethod) {
        Context context = new Context();

        if (nameMethod.equalsIgnoreCase("fahrenheit")) {
            context.setStrategy(new FahrenheitConverter());
        } else if (nameMethod.equalsIgnoreCase("kelvin")) {
            context.setStrategy(new KelvinConverter());
        } else if (nameMethod.equalsIgnoreCase("celsius")) {
            context.setStrategy(new CelsiusConverter());
        }
        return context.executeStrategy(a);
    }
}