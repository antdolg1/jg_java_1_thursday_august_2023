package students.aleksandrs_kunicins.homework.lesson_3.level_5.task_19;

class Dog{
    String dogName;
    int age;
    Dog(String dogName, int age){
        this.dogName = dogName;
        this.age = age;
    }
    void voice(){
        System.out.println("Dog's name is : " + dogName + "and I am "+ age + " years old!");
    }
}


    class DogDemo{
        public static void main(String[] args) {
            Dog myDog = new Dog("Nicky ", 3);
            myDog.voice();
    }

}
