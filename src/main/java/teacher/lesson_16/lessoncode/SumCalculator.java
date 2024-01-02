package teacher.lesson_16.lessoncode;

public class SumCalculator {
    public static void main(String[] args) {

        int inputNumber = 1000000000;

        long startTime = System.currentTimeMillis();
        long sum = calculateSum(inputNumber);
        long endTime = System.currentTimeMillis();

        System.out.println("Single-threaded sum calculation result: " + sum);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }

    private static long calculateSum(int inputNumber) {
        long sum = 0;
        for (int i = 1; i <= inputNumber; i++) {
            sum += i;
        }
        return sum;
    }

}
