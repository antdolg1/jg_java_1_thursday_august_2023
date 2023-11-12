package students.valeriia_holovan.lesson_3.level_1.task_6;
public class Robot {
    void howAreYou() {
        System.out.println("How are you?");
    }

    void sayYourName() {
        System.out.println("My name is Robo!!!");
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    void sayGoodDay() {
        System.out.println("Good Day!");
    }

    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.howAreYou();

        Robot robot2 = new Robot();
        robot2.sayYourName();
        robot2.sayGoodDay();

        Robot robot3 = new Robot();
        robot3.sayGoodDay();
        robot3.howAreYou();
    }
}