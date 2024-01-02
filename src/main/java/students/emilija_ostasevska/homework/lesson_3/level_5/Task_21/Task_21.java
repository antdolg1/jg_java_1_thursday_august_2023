package students.emilija_ostasevska.homework.lesson_3.level_5.Task_21;

class Dog{
    String name;
    String color;
    int age;

    void voice(){
        System.out.println(name + " " + age + " " + color);
    }
    Dog(String dogName, String color, int age){
        this.name = dogName;
        this.color = color;
        this.age = age;
    }
}

class DogDemo{
    public static void main(String[] args) {
    Dog dog = new Dog("Елисей", "white", 2);
        dog.voice();
    }
}