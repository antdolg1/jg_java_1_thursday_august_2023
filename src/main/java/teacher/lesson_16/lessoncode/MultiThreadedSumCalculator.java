package teacher.lesson_16.lessoncode;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThreadedSumCalculator {

    private static final Logger logger = Logger.getLogger(MultiThreadedSumCalculator.class.getName());

    public static void main(String[] args) {
        int inputNumber = 2000000000;
        int numThreads = 10;

        long startTime = System.currentTimeMillis();
        long sum = calculateSum(inputNumber);
        long endTime = System.currentTimeMillis();

        long startTime2 = System.currentTimeMillis();
        long sum2 = calculateSumWithThreads(inputNumber, numThreads);
        long endTime2 = System.currentTimeMillis();

        System.out.println("Single-threaded sum calculation result: " + sum);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
        System.out.println("-------------------------");
        System.out.println("Multi-threaded sum calculation result: " + sum2);
        System.out.println("Time taken: " + (endTime2 - startTime2) + " ms");
    }

    private static long calculateSumWithThreads(int inputNumber, int numThreads) {
        long sum = 0;
        SumThread[] threads = new SumThread[numThreads];
        int numbersPerThread = inputNumber / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int startNumber = i * numbersPerThread + 1;
            int endNumber = (i + 1) * numbersPerThread;
            threads[i] = new SumThread(startNumber, endNumber);
            threads[i].start();
        }

        try {
            for (SumThread thread : threads) {
                thread.join();
                sum += thread.getPartialSum();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sum;
    }

    private static long calculateSum(int inputNumber) {
        logger.log(Level.INFO, "Entered calculateSum() method");
        long sum = 0;
        for (int i = 1; i <= inputNumber; i++) {
            sum += i;
        }
        return sum;
    }
}

class SumThread extends Thread {
    private int startNumber;
    private int endNumber;
    private long partialSum;

    public SumThread(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public long getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        partialSum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            partialSum += i;
        }
    }
}

