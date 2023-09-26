package students.denis_asipenka.lesson_6.level_4;

public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int counter = 1;
        while (counter > 0) {
            System.out.println(counter);
            counter++;
            if (counter == 10) {
                break;
            }
        }
    }
}