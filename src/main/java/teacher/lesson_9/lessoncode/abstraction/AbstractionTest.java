package teacher.lesson_9.lessoncode.abstraction;

public class AbstractionTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik");
        dog.sleep();
        dog.makeSound();

        Cat cat = new Cat("Zhorik");
        cat.sleep();
        cat.makeSound();
    }
}
