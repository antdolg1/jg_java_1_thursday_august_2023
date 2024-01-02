package students.anastassia_iljina.lesson_3.homework;

public class Robot {
    public void sayHello() {
        System.out.println("Hello!");
    }

    public Robot() {

    }

    public void sayYourName() {
        System.out.println("My name is ROBO");
    }

    String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    void sayMyName() {
        System.out.println("My name is " + this.name);
    }

}
