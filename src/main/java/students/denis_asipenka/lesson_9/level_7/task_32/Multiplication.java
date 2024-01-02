package students.denis_asipenka.lesson_9.level_7.task_32;

public class Multiplication extends TwoArgumentMathOperation {
    public Multiplication(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() * calculateRightSide();
    }
}