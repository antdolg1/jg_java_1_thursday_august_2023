package students.nikolajs_antonovs.lesson_3.level_5.task_20;

public class Dog {

    String name;
    int age;
    int newAge;

    Dog(String dogName, int dogAge) {
        this.name = dogName;
        this.age = dogAge;
        this.newAge = age + 1;
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
    void happyBirthday() {
        System.out.println("Dog is celebrating birthday!");

    }

    void newAge() {
        System.out.println("Dog age is " + newAge);
    }

    public Dog() {
    }
}
