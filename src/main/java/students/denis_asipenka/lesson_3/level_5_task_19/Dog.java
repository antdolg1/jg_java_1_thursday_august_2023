package students.denis_asipenka.lesson_3.level_5_task_19;

public class Dog {
    final String dogName;
    int age = 2;
    public void voice() {

        System.out.println(dogName+" возраст: "+age);
    }
    public Dog(String dogName,int age){
        this.dogName=dogName;
        this.age=age;
    }
}
 class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик",2);
     dog.voice();
    }
}