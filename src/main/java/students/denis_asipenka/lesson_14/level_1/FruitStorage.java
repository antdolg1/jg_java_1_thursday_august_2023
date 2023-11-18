package students.denis_asipenka.lesson_14.level_1;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {

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

    List<Apple> searchForApplesByColor(String color) {
        return getAllApples().stream()
                .filter(apple -> apple.getColor().equals(color))
                .toList();
    }

    List<Apple> searchForApplesByWeight(int weight) {
        return getAllApples().stream()
                .filter(apple -> apple.getWeight() > weight)
                .toList();
    }

    List<Apple> searchForApplesByApplePredicate(ApplePredicate predicate) {
        return getAllApples().stream()
                .filter(apple -> predicate.test(apple))
                .toList();
    }
}