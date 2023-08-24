package teacher.lesson_3.lessoncode;

public class DogApp {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog(10, true, "Lucy");
        dog1.name = "Johny";
        dog1.age = 3;
        dog1.hungry = true;

        String dog1Name = dog1.name;
        dog1.bark();
        dog1.sleep();

        System.out.println("Dog1 name: " + dog1Name);
        System.out.println("Dog1 age: " + dog1.age);
        System.out.println("Dog1 is hungry: " + dog1.hungry);

        System.out.println("-----------");

        System.out.println("Dog2 name: " + dog2.name);
        System.out.println("Dog2 age: " + dog2.age);
        System.out.println("Dog2 is hungry: " + dog2.hungry);

        System.out.println("-----------");

        System.out.println("Dog3 name: " + dog3.name);
        System.out.println("Dog3 age: " + dog3.age);
        System.out.println("Dog3 is hungry: " + dog3.hungry);

        dog3.name = "Laila";

        System.out.println("Dog3 name: " + dog3.name);
    }
}
