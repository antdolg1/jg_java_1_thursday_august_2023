package teacher.lesson_3.lessoncode;

public class Dog {

    public int age;
    public boolean hungry;
    public String name;

    public Dog(int age, boolean hungry, String name) {
        this.age = age;
        this.hungry = hungry;
        this.name = name;
    }

    public Dog(){

    }

    public void bark() {
        System.out.println("Woof woof!");
    }

    public void sleep() {
        System.out.println("Zzzzzz....");
    }

}
