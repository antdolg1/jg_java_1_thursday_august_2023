package teacher.lesson_6.lessoncode.quiz;

public class Question15 {
    public static void main(String[] args) {

        int count = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k ++) {
                    System.out.println(i * j * k);
                    System.out.println("Count value is " + count);
                    count++;
                }
            }
        }
    }
}
