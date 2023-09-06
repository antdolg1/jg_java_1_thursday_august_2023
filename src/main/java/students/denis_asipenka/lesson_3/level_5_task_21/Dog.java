package students.denis_asipenka.lesson_3.level_5_task_21;



public class Dog {
    final String dogName;
    int age = 2;
    String color;
    public void voice() {
        System.out.println("Кличка: "+dogName+"\n"+"Возраст: "+age+"\n"+"Цвет: "+color);
    }
    public Dog(String dogName,int age,String color){
        this.dogName=dogName;
        this.age=age;
        this.color=color;
    }

}
class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик",2,"Красный");
        dog.voice();

    }
}

