package teacher.lesson_16.lessoncode;

import java.util.Scanner;

public class RunnerDemo {
    public static void main(String[] args) {

        RunnerThread runnerThread = new RunnerThread();
        runnerThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        runnerThread.shutDown();
        System.out.println("THREAD STOPPED!");

    }
}
