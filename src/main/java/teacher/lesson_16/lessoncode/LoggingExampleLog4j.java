package teacher.lesson_16.lessoncode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingExampleLog4j {
    public static final Logger logger = LogManager.getLogger(LoggingExampleLog4j.class);

    public static void main(String[] args) {


        int value = 33;
        logger.info("This is an info");
        try {
            //Simulate exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("Error message");
        }
    }
}

//third-party logging frameworks:
//Log4j
//Logback
//SLF4J
//Tinylog
//Log4j 2