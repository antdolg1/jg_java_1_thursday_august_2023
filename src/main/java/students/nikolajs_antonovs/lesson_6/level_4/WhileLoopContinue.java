package students.nikolajs_antonovs.lesson_6.level_4;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            if (i == 5) {
                System.out.println("NUmber " + i);
                i++;
                continue;
            }
            i++;
        }
    }
}