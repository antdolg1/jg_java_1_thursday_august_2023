package students.nikolajs_antonovs.lesson_3.level_1;

class Robot {

    String name;

    public Robot() {
    }

    Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    void sayYourName() {
        System.out.println("My name is " + this.name + "!");
    }
}
