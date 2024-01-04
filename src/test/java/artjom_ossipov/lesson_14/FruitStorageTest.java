package artjom_ossipov.lesson_14;

import org.junit.Test;
import students.artjom_ossipov.lesson_14.level_1_2.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {
    FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void weOnlyExpectGreenApples() {
        String colorSearch = "green";
        List<Apple> listResult = new ArrayList<>();
        listResult.add(new Apple("green", 200));
        listResult.add(new Apple("green", 90));
        listResult.add(new Apple("green", 50));
        List<Apple> actualResult = fruitStorage.searchForApplesByColor(colorSearch);
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weOnlyExpectRedApples() {
        String colorSearch = "red";
        List<Apple> listResult = new ArrayList<>();
        listResult.add(new Apple("red", 100));
        listResult.add(new Apple("red", 160));
        listResult.add(new Apple("red", 200));
        List<Apple> actualResult = fruitStorage.searchForApplesByColor(colorSearch);
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weExpectTheAppleToWeighMoreThan150() {
        int weight = 150;
        List<Apple> listResult = new ArrayList<>();
        listResult.add(new Apple("red", 160));
        listResult.add(new Apple("red", 200));
        listResult.add(new Apple("green", 200));
        listResult.add(new Apple("yellow", 170));
        List<Apple> actualResult = fruitStorage.searchForApplesByWeight(weight);
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weOnlyExpectGreenApplesPredicate() {
        List<Apple> listResult = new ArrayList<>();
        listResult.add(new Apple("green", 200));
        listResult.add(new Apple("green", 90));
        listResult.add(new Apple("green", 50));
        List<Apple> actualResult = fruitStorage.searchForApplesByApplePredicate(new AppleGreenColorPredicate());
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weOnlyExpectRedApplesPredicate() {
        List<Apple> listResult = new ArrayList<>();
        listResult.add(new Apple("red", 100));
        listResult.add(new Apple("red", 160));
        listResult.add(new Apple("red", 200));
        List<Apple> actualResult = fruitStorage.searchForApplesByApplePredicate(new AppleRedColorPredicate());
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weExpectTheAppleToWeighMoreThan150Predicate() {
        List<Apple> listResult = new ArrayList<>();
        listResult.add(new Apple("red", 160));
        listResult.add(new Apple("red", 200));
        listResult.add(new Apple("green", 200));
        listResult.add(new Apple("yellow", 170));
        List<Apple> actualResult = fruitStorage.searchForApplesByApplePredicate(new AppleHeavyWeightPredicate());
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weExpectTheAppleToWeighLessThan150Predicate() {
        List<Apple> listResult = new ArrayList<>();
        listResult.add(new Apple("red", 100));
        listResult.add(new Apple("green", 90));
        listResult.add(new Apple("green", 50));
        listResult.add(new Apple("yellow", 50));
        List<Apple> actualResult = fruitStorage.searchForApplesByApplePredicate(new AppleLightWeightPredicate());
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weExpectTheAppleToWeighMoreThan150AndGreenPredicate() {
        List<Apple> listResult = new ArrayList<>();
        listResult.add(new Apple("green", 200));
        List<Apple> actualResult = fruitStorage.searchForApplesByApplePredicate(new AppleHeavyWeightAndGreenPredicate());
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weExpectTheAppleToWeighLessThan150AndGreenPredicate() {
        List<Apple> listResult = new ArrayList<>();
        listResult.add(new Apple("green", 90));
        listResult.add(new Apple("green", 50));
        List<Apple> actualResult = fruitStorage.searchForApplesByApplePredicate(new AppleLightWeightAndGreenPredicate());
        assertEquals(listResult, actualResult);
    }
}
