package students.denis_asipenka.lesson_16.level_1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Solution extends Thread {
    private static final Logger logger = Logger.getLogger(Solution.class.getName());

    @Override
    public void run() {
        logger.log(Level.INFO, "Hello World");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Thread thread = new Thread(solution);
        thread.start();
    }
}