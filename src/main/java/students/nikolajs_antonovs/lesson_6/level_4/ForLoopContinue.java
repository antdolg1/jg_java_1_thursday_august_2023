package students.nikolajs_antonovs.lesson_6.level_4;

public class ForLoopContinue {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
