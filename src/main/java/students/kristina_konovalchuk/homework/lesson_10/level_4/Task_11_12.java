package students.kristina_konovalchuk.homework.lesson_10.level_4;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Task_11_12 {
    public class temperatureConverter {
        public static void main(String[] args) {
            Scanner input = new Scanner( System.in );

            System.out.print( "Enter temperature in degrees Celsius: " );
            double celsius = input.nextDouble( );

            double fahrenheit = (celsius * 9 / 5) + 32;
            double kelvin = celsius + 273.15;

            System.out.println( celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit" );
            System.out.println( celsius + " degrees Celsius = " + kelvin + " Kelvin" );
        }
    }

    interface TemperatureConverter {

        double convert(double celsiusTemperature);

    }

    class CelsiusConverter implements TemperatureConverter {

        @Override
        public double convert(double celsiusTemperature) {
            return celsiusTemperature;
        }

    }

    class KelvinConverter implements TemperatureConverter {

        @Override
        public double convert(double celsiusTemperature) {
            return celsiusTemperature + 273.15;
        }
    }

    class FahrenheitConverter implements TemperatureConverter {

        @Override
        public double convert(double celsiusTemperature) {
            return 1.8 * celsiusTemperature + 32;
        }

    }

    public class KelvinConverterTest {

        @Test
        public void testConvert() {
            KelvinConverter converter = new KelvinConverter( );
            double result = converter.convert( 0 );
            assertEquals( 273.15, result, 0.001 );
        }

    }
}
