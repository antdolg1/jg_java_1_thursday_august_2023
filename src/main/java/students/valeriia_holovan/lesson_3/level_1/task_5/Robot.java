package students.valeriia_holovan.lesson_3.level_1.task_5;

public class Robot {
    public void sayYourName() {
        System.out.println("My name is ROBO");
    }

    public static class RobotDemo {
        public static void main(String[] args) {
            Robot myRobot = new Robot();
            myRobot.sayYourName();
        }
    }
}
