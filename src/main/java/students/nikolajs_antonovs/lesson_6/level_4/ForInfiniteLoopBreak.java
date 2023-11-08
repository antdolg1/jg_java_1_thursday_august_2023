package students.nikolajs_antonovs.lesson_6.level_4;

public class ForInfiniteLoopBreak {

    public static void main(String[] args) {

        for (; ; ) {
            System.out.println("Infinity FOR");
            break;
        }
        System.out.println("Infinity FOR loop stopped");
    }
}
