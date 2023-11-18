package students.denis_asipenka.lesson_14.level_1;

public class AppleLightWeightAndGreenPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green") && apple.getWeight() < 150;
    }
}