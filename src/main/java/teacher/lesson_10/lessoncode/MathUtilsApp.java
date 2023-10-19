package teacher.lesson_10.lessoncode;

public class MathUtilsApp {
    public static void main(String[] args) {

        MathUtils mathUtils = new MathUtils();
        int sum1 = mathUtils.sum(2, 3);
        double sum2 = mathUtils.sum(2.5, 4.5);

        System.out.println(sum1);
        System.out.println(sum2);

    }
}
