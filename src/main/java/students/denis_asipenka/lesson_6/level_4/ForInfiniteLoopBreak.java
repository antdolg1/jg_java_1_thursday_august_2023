package students.denis_asipenka.lesson_6.level_4;

public class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 0; i >= 0; i++) {
            System.out.println(i);
            if (i * 10 == 100)
                break;
        }
    }
}