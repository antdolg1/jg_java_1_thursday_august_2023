package students.valeriia_holovan.lesson_2.level_1.task_2;

import java.util.Scanner;
//import java.util.Locale;
//если нужно числа с точкой то нужно расскомментировать.Вроде как в задании указано с запятой,но вдруг

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //scanner.useLocale(Locale.US);
        //если нужно числа с точкой то нужно расскоментировать


        System.out.print("Enter a decimal number1 : ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.print("Enter a decimal number2 : ");
        double secondDoubleNumber = scanner.nextDouble();

        double add = firstDoubleNumber + secondDoubleNumber;
        double difference = firstDoubleNumber - secondDoubleNumber;
        double product = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;

        System.out.println(add);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(division);
//В задании не указано,нужно ли писать,что деление на ноль невозможно.Это по логике ж нужно указывать??Прошу получить ответ на этот вопрос
        scanner.close();
    }
}
