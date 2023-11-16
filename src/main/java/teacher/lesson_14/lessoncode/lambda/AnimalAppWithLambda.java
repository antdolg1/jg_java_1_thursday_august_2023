package teacher.lesson_14.lessoncode.lambda;

import java.util.ArrayList;
import java.util.List;

public class AnimalAppWithLambda {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("shark", false, true));
        animals.add(new Animal("duck", true, true));
        animals.add(new Animal("dog", false, true));
        animals.add(new Animal("kangaroo", false, false));

        printInfo(animals, (Animal a) -> {
            return a.isCanSwim();
        });

        printInfo(animals, a -> a.isCanFly()); //is the same as printInfo(animals, new CheckCanFly());

    }

    private static void printInfo(List<Animal> animals, Checker checker) {
        for (Animal animal : animals) {
            if (checker.checkCanFlyOrSwim(animal)) {
                System.out.println(animal + " ");
            }
        }
        System.out.println();
    }
}
