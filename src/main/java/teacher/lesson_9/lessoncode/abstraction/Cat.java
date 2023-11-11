package teacher.lesson_9.lessoncode.abstraction;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says meow meow");
    }
}
