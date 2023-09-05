package teacher.lesson_4.lessoncode;

public class TernaryOperator {

    public static void main(String[] args) {

        int number = 5;

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        //ternary operator way
        //синтаксис тернарного оператора
        //условие ? значение_если_истина : значение_если_ложь;
        String result = (number % 2 == 0) ? "Чётное" : "Нечётное";

        System.out.println(result);

        boolean isSunny = false;
        String currentWeatherMessage = isSunny ? "Отличная погодка" : "Надоел этот дождь";
        System.out.println(currentWeatherMessage);
    }

}
