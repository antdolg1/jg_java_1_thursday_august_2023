package students.anastassia_iljina.lesson_3.homework;

public class RobotDemo {
    public static void main(String[] args) {
        Robot myRobot = new Robot();
        myRobot.sayHello();
        myRobot.sayYourName();

        Robot myRobot2 = new Robot();
        myRobot2.sayHello();
        myRobot2.sayYourName();

        Robot myRobot3 = new Robot();
        myRobot3.sayHello();
        myRobot3.sayYourName();

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayMyName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayMyName();

        Robot robot3 = new Robot("Sandy");
        robot3.sayHello();
        robot3.sayMyName();

    }
}
