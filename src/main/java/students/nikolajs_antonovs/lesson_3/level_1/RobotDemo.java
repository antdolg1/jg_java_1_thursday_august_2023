package students.nikolajs_antonovs.lesson_3.level_1;

class RobotDemo {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();
        System.out.println("------------");

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();
        System.out.println("------------");

        Robot robot3 = new Robot("Robo");
        robot3.sayHello();
        robot3.sayYourName();
    }
}
