package teacher.lesson_5.lessoncode;

public class ForLoopExample {
    public static void main(String[] args) {

//        for (int i = 1; i <= 100; i++) {
//            if (i % 10 == 0) {
//                System.out.println("Строка №" + i);
//            }
////            System.out.println("Строка №" + i);
//        }
//
//        for (int i = 100; i > 0; i--) {
//            System.out.print(i + " ");
//        }

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
