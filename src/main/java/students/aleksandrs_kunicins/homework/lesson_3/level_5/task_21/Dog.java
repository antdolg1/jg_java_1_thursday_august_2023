package students.aleksandrs_kunicins.homework.lesson_3.level_5.task_21;

class Dog{
    String dogName;
    String color;
    int age;

    void voice(){
        System.out.println("Hi I'm " + dogName +  "- " + age +" y.o " + color + "doggy!!!");
    }
    Dog(String dogName, String color, int age){
        this.dogName = dogName;
        this.color = color;
        this.age = age;
    }
}

class DogDemo{
    public static void main(String[] args) {
    Dog dog = new Dog(" Max ", "black ", 4);
        dog.voice();
    }
}