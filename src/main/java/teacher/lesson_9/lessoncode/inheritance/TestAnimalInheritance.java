package teacher.lesson_9.lessoncode.inheritance;

public class TestAnimalInheritance {
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
