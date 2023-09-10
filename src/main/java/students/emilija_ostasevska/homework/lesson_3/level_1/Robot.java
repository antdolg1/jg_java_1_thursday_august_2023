package students.emilija_ostasevska.homework.lesson_3.level_1;

public class Robot {

    public String robotName;

    Robot (String robotName) {
        this.robotName = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName(){
        System.out.println("My name is " + robotName);
    }

    public Robot() {
        
    }

}
