package students.emilija_ostasevska.homework.lesson_3.level_5.Task_20;

class Dog {
   int age = 0;

   void birthday() {
       age += 1;
       System.out.println("My age now is " + age);
   }

}

class DogDemo {
   public static void main(String[] args) {
       Dog dog = new Dog();
       dog.birthday();
   }
}