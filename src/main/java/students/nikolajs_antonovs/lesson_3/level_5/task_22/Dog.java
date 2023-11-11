package students.nikolajs_antonovs.lesson_3.level_5.task_22;

class Dog {

    String name;
    int age;
    String color;
    String newColor;

    Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    void sayName() {
        System.out.println("Dog name is " + name);
    }

    void voice() {
        System.out.println("Woof");
    }

    void age() {
        System.out.println("Dog age is " + age);
    }

    void color() {
        System.out.println("Dog color is " + color);
    }

}
