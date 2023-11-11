package students.emilija_ostasevska.homework.lesson_3.level_5.Task_22;

class Dog {
   String color = "white";

   void colorChange() {
       color = "black";
       System.out.println(color);
   }

}

class DogDemo {
   public static void main(String[] args) {
       Dog dog = new Dog();
       dog.colorChange();
   }
}