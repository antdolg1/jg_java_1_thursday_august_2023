package students.emilija_ostasevska.homework.lesson_3.level_5.Task_18;

class Dog{
    String name;

    Dog(String dogName){
        this.name = dogName;
    }
    void voice(){
        System.out.println(name + " " + name + " " + name);
    }
}


class DogDemo{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Елисей");
        dog1.voice();
    }
}