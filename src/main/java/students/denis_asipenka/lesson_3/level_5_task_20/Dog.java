package students.denis_asipenka.lesson_3.level_5_task_20;


public class Dog {
    final String dogName;
    int age = 2;
    public void voice() {

        System.out.println(dogName+" возраст: "+age);
        happyBirthday();
        System.out.println("Ура! У меня день рождение! Мне теперь: "+ age);
        System.out.println(dogName+" возраст: "+age);
    }
    public Dog(String dogName,int age){
        this.dogName=dogName;
        this.age=age;
    }
    void happyBirthday() {
        this.age=this.age+1;
    }
}
class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик",2);
        dog.voice();

    }
}
