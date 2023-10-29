package students.emilija_ostasevska.homework.lesson_3.level_5.Task_19;

class Dog{
    String name;
    int age;
    Dog(String dogName, int age){
        this.name = dogName;
        this.age = age;
    }
    void voice(){
        System.out.println(name + " " + age);
    }
}


class DogDemo{
    public static void main(String[] args) {
        Dog dog = new Dog("Елисей", 1);
        dog.voice();
    }

}