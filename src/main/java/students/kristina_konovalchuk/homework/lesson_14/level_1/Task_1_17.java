package students.kristina_konovalchuk.homework.lesson_14.level_1;

import java.util.ArrayList;
import java.util.List;

public class Task_1_17 {
    public static class Apple {

        private String color;
        private int weight;

        public Apple(String color, int weight) {
            this.color = color;
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public String getWeight() {
            return weight;
        }

    }

    public static class FruitStorage {

        public List<Apple> getAllApples() {
            List<Apple> apples = new ArrayList<>( );
            apples.add( new Apple( "red", 100 ) );
            apples.add( new Apple( "red", 160 ) );
            apples.add( new Apple( "red", 200 ) );
            apples.add( new Apple( "green", 200 ) );
            apples.add( new Apple( "green", 90 ) );
            apples.add( new Apple( "green", 50 ) );
            apples.add( new Apple( "yellow", 50 ) );
            apples.add( new Apple( "yellow", 170 ) );
            return apples;
        }

        public List<Apple> findGreenApples(List<Apple> inventory) {
            List<Apple> result = new ArrayList<>( );
            for (Apple apple : inventory) {
                if ("green".equals( apple.getColor( ) )) {
                    result.add( apple );
                }
            }
            return result;
        }

        public List<Apple> findApplesByColor(List<Apple> inventory, String color) {
            List<Apple> result = new ArrayList<>( );
            for (Apple apple : inventory) {
                if (apple.getColor( ).equals( color )) {
                    result.add( apple );
                }
            }
            return result;
        }

        public List<Apple> findApplesByWeight(List<Apple> inventory, int weight) {
            List<Apple> result = new ArrayList<>( );
            for (Apple apple : inventory) {
                if (apple.getWeight( ) > weight) {
                    result.add( apple );
                }
            }
            return result;
        }

        public interface ApplePredicate {
            boolean test(Apple apple);
        }

        public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
            List<Apple> result = new ArrayList<>( );
            for (Apple apple : inventory) {
                if (p.test( apple )) {
                    result.add( apple );
                }
            }
            return result;
        }

        private List<Apple> inventory;
        List<Apple> heavyApples = findApples( inventory, (Apple apple) -> apple.getWeight( ) > 150 );
        List<Apple> greenApples = findApples( inventory, (Apple apple) -> "green".equals( apple.getColor( ) ) );

        List<Apple> redApples = findApples( inventory, (Apple apple) -> "red".equals( apple.getColor( ) ) );
        List<Apple> lightApples = findApples( inventory, (Apple apple) -> apple.getWeight( ) < 150 );

    }


}

