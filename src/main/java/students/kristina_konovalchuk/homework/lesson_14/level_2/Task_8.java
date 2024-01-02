package students.kristina_konovalchuk.homework.lesson_14.level_2;

import students.kristina_konovalchuk.homework.lesson_14.level_1.Task_1_17;

public class Task_8 {
    public static class AppleGreenColorPredicate implements Task_1_17.FruitStorage.ApplePredicate {
        public boolean test(Task_1_17.Apple apple) {
            return "green".equals( apple.getColor( ) );
        }
    }

    public static class AppleRedColorPredicate implements Task_1_17.FruitStorage.ApplePredicate {
        public boolean test(Task_1_17.Apple apple) {
            return "red".equals( apple.getColor( ) );
        }
    }

    public static class AppleHeavyWeightPredicate implements Task_1_17.FruitStorage.ApplePredicate {
        public boolean test(Task_1_17.Apple apple) {
            return apple.getWeight( ) > 150;
        }
    }

    public static class AppleLightWeightPredicate implements Task_1_17.FruitStorage.ApplePredicate {
        public boolean test(Task_1_17.Apple apple) {
            return apple.getWeight( ) < 150;
        }
    }
}
