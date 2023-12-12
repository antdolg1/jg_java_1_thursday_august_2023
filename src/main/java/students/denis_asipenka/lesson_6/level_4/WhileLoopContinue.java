package students.denis_asipenka.lesson_6.level_4;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int counter = 0;
        while (counter <= 10) {
            counter++;
            if (counter % 2 == 0) {
                continue;
            }
            System.out.println(counter);
        }
    }
}