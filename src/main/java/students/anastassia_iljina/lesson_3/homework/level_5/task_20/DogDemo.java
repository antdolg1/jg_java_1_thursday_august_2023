package students.anastassia_iljina.lesson_3.homework.level_5.task_20;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Milo", 5);
        dog.voice();
        dog.happyBirthday();
        dog.voice();
        int age = dog.getAge();
        System.out.println(age);
    }
}
