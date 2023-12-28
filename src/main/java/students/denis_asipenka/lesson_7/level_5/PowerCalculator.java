package students.denis_asipenka.lesson_7.level_5;

public class PowerCalculator {
    public int exponentiation(int number, int degree) {
        int result = number * number;
        for (int i = 0; i < degree - 2; i++) {
            result = result * number;
        }
        return result;
    }
}