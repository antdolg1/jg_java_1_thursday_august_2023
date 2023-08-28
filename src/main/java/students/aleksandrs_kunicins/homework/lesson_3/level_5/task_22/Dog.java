package students.aleksandrs_kunicins.homework.lesson_3.level_5.task_22;

class Dog{
    String color;

    void changeColor(String color){
        this.color = color;
        System.out.println("Woof! Why I am " + color.toLowerCase() + " ???");
    }

}
class DogDemo{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.changeColor("Black");
        dog.changeColor("Brown");
        dog.changeColor("White");
    }
}
