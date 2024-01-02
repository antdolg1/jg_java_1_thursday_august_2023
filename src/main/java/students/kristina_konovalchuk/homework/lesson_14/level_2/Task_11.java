package students.kristina_konovalchuk.homework.lesson_14.level_2;

import students.kristina_konovalchuk.homework.lesson_14.level_1.Task_1_17;

public class Task_11 {
    public static class AppleGreenAndHeavyPredicate implements Task_1_17.FruitStorage.ApplePredicate {
        @Override
        public boolean test(Task_1_17.Apple apple) {
            return "green".equals( apple.getColor( ) && apple.getWeight( ) > 150 );
        }
    }

}
