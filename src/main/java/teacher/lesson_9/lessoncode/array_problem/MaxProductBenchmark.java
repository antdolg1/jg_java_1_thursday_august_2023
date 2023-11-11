package teacher.lesson_9.lessoncode.array_problem;

import java.util.Random;

public class MaxProductBenchmark {
    public static void main(String[] args) {
        int[] nums = generateRandomArray(1000000); //Array with 10000 random numbers
        long startTime;
        long endTime;
        BruteForce bruteForce = new BruteForce();
        SortSelect sortSelect = new SortSelect();
        LinearTraversal linearTraversal = new LinearTraversal();

        // Benchmark Brute Force
        startTime = System.currentTimeMillis();
        bruteForce.maxProductPair(nums);
        endTime = System.currentTimeMillis();
        System.out.println("Brute Force Time: " + (endTime - startTime) + "ms");

        // Benchmark Sort and Select
        startTime = System.currentTimeMillis();
        sortSelect.maxProductPair(nums);
        endTime = System.currentTimeMillis();
        System.out.println("Sort and Select Time: " + (endTime - startTime) + "ms");

        // Benchmark Linear Traversal
        startTime = System.currentTimeMillis();
        linearTraversal.maxProductPair(nums);
        endTime = System.currentTimeMillis();
        System.out.println("Linear Traversal Time: " + (endTime - startTime) + "ms");
    }

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(20000) - 10000; //Random numbers between -10000 and 10000
        }
        return array;
    }
}
