package students.artjom_ossipov.lesson_14.level_1_2;

import java.util.ArrayList;
import java.util.List;

public class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> searchForApplesByColor(String color) {
        return getAllApples().stream()
                .filter(apple -> apple.getColor().equals(color))
                .toList();
    }

    public List<Apple> searchForApplesByWeight(int weight) {
        return getAllApples().stream()
                .filter(apple -> apple.getWeight() > weight)
                .toList();
    }

    public List<Apple> searchForApplesByApplePredicate(ApplePredicate predicate) {
        return getAllApples().stream()
                .filter(apple -> predicate.test(apple))
                .toList();
    }
}
