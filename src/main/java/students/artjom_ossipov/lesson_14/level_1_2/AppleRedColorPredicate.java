package students.artjom_ossipov.lesson_14.level_1_2;

public class AppleRedColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }
}
