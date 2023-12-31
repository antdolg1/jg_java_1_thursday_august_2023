package students.emilija_ostasevska.homework.lesson_14.level_1;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FruitStorageTest {

    @Test
    public void testFindGreenApplesWithLambda() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = fruitStorage.getAllApples();
        List<Apple> greenApples = fruitStorage.findApples(apples, apple -> "green".equals(apple.getColor()));
        for (Apple apple : greenApples) {
            assertEquals("green", apple.getColor());
        }
    }

    @Test
    public void testFindRedApplesWithLambda() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = fruitStorage.getAllApples();
        List<Apple> redApples = fruitStorage.findApples(apples, apple -> "red".equals(apple.getColor()));
        for (Apple apple : redApples) {
            assertEquals("red", apple.getColor());
        }
    }

    @Test
    public void testFindHeavyApplesWithLambda() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = fruitStorage.getAllApples();
        List<Apple> heavyApples = fruitStorage.findApples(apples, apple -> apple.getWeight() > 150);
        for (Apple apple : heavyApples) {
            assertTrue(apple.getWeight() > 150);
        }
    }

    @Test
    public void testFindLightApplesWithLambda() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = fruitStorage.getAllApples();
        List<Apple> lightApples = fruitStorage.findApples(apples, apple -> apple.getWeight() <= 150);
        for (Apple apple : lightApples) {
            assertTrue(apple.getWeight() <= 150);
        }
    }
}
