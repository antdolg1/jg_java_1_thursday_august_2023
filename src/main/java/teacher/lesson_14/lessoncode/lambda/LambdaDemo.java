package teacher.lesson_14.lessoncode.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaDemo {

    public static void main(String[] args) {

        //1. No-parameter lambda
        Runnable sayHello = () -> System.out.println("Hello!");
        sayHello.run();

        //2. One-parameter lambda
        Consumer<String> printName = name -> System.out.println("Hello " + name);
        printName.accept("John");

        //3. Two-parameter lambda
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum of 5 and 3 is " + add.apply(5,3));

        //4. Lambda with multiple statements in the body
        BiFunction<Double, Double, Double> power = (base, exponent) -> {
            double result = Math.pow(base, exponent);
            return  result;
        };
        System.out.println("2.0 to the power of 3 is " + power.apply(2.0, 3.0));

        //5. Predicate lambda (returns boolean)
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 6 even? " + isEven.test(6));

    }

}
