package teacher.lesson_6.lessoncode;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        Random random = new Random();

        //returns a random int
        int randomNumber = random.nextInt();
        System.out.println("Random number: " + randomNumber);

        //returns a random integer value between 0 (inclusive) and the specified value (exclusive)
        int randomNumberWithLimit = random.nextInt(10);
        System.out.println("Random number with limit: " + randomNumberWithLimit);

        //returns a random double value between 0.0 and 1.0 (exclusive)
        double randomDouble = random.nextDouble();
        System.out.println("Random doubleNumber: " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random boolean: " + randomBoolean);
    }
}
