package students.emilija_ostasevska.homework.lesson_14.level_1;

public class ApplePredicate {

    public static class AppleGreenColorPredicate implements Predicate {
        @Override
        public boolean test(Apple apple) {
            return "green".equals(apple.getColor());
        }
    }

    public static class AppleRedColorPredicate implements Predicate {
        @Override
        public boolean test(Apple apple) {
            return "red".equals(apple.getColor());
        }
    }

    public static class AppleHeavyWeightPredicate implements Predicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 150;
        }
    }

    public static class AppleLightWeightPredicate implements Predicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() < 150;
        }
    }

    interface Predicate {
        boolean test(Apple apple);
    }
}