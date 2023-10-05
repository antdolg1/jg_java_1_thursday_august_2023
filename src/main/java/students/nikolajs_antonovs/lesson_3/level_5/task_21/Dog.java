package students.nikolajs_antonovs.lesson_3.level_5.task_21;

class Dog {

    String name;
    int age;
    String color;

    Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    void sayName() {
        System.out.println("Dog name is " + name);
    }

    void age() {
        System.out.println("Dog age is " + age);
    }

    void voice() {
        System.out.println("Woof");
    }
    void color() {
        System.out.println("Dog color is " + color);
    }
}
