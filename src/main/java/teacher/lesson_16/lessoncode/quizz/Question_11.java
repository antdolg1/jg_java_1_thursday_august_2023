package teacher.lesson_16.lessoncode.quizz;

public class Question_11 {
    public static void main(String[] args) {

        for (int i = 10; i < 20; i += 2) {
            System.out.println("Current i value: " + i);
            if (i > 15) {
                break;
            }
            if (i % 4 == 0) {
                continue;
            }
            System.out.print(i);
        }

    }
}
