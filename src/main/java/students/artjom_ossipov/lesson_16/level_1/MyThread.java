package students.artjom_ossipov.lesson_16.level_1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {
    int numberThread;
    private static final Logger logger = Logger.getLogger(Solution.class.getName());

    public MyThread(int numberThread) {
        this.numberThread = numberThread;
    }

    @Override
    public void run() {
        logger.log(Level.INFO, "[thread unique number" + numberThread + "] Hello World ");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new MyThread(i)).start();
        }
    }
}