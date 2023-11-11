package teacher.lesson_9.lessoncode.abstraction;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + " sleeps");
    }

    abstract void makeSound();
}
