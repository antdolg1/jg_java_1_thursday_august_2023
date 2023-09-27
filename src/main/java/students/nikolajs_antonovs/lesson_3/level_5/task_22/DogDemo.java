package students.nikolajs_antonovs.lesson_3.level_5.task_22;

class DogDemo {
    public static void main(String[] args) {

        Dog dog = new Dog("Tyson", 3, "black");
        dog.sayName();
        dog.age();
        dog.color();
        dog.voice();

        System.out.println("Dog is changing his color!");

        dog.voice();
        dog.newColor = "red";

        System.out.println("Dog new color is " + dog.newColor);
    }
}
