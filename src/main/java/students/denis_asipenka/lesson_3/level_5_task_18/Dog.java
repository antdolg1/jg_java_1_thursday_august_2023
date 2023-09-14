package students.denis_asipenka.lesson_3.level_5_task_18;

public class Dog {
    final String dogName;

    public void voice() {

        System.out.println(dogName + " " + dogName + " " + dogName);
    }

    public Dog(String dogName) {
        this.dogName = dogName;
    }
}

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");
        dog.voice();
    }
}