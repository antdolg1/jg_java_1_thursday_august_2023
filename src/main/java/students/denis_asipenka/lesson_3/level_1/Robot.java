package students.denis_asipenka.lesson_3.level_1;

public class Robot {
    String name;
    public Robot(String robotName) {
        this.name = robotName;
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    public void sayYourName() {
        System.out.println("My name is "+name);
    }
    }
