package students.denis_asipenka.lesson_16.level_5;

import students.denis_asipenka.lesson_16.level_1.Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RandomNumberList extends Thread {
    private static final Logger logger = Logger.getLogger(Solution.class.getName());
    private List<Integer> randomNumbers = Collections.synchronizedList(new ArrayList<>());

    public void add(int randomNumber) {
        this.randomNumbers.add(randomNumber);
    }

    public int size() {
        return this.randomNumbers.size();
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            Random random = new Random();
            add(random.nextInt(1000));
        }
        logger.log(Level.INFO, "" + size());
    }

    public static void main(String[] args) {
        RandomNumberList randomNumberList = new RandomNumberList();
        Thread thread = new Thread(randomNumberList);
        Thread thread1 = new Thread(randomNumberList);
        thread.start();
        thread1.start();
    }
}