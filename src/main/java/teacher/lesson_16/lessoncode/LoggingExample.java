package teacher.lesson_16.lessoncode;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {
    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        logger.info("This is informational message");
        logger.warning("This is a warning message");

        int value = 33;
        logger.info("The value is: " + value);

        try {
            //Simulate exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "An error occured", e);
        }
    }
}

//third-party logging frameworks:
//Log4j
//Logback
//SLF4J
//Tinylog
//Log4j 2