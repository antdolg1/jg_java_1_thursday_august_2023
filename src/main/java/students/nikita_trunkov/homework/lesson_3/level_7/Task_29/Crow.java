package students.nikita_trunkov.homework.lesson_3.level_7.Task_29;

 class Crow {
     String breed;
     String color;
     String size;
     int age;
     Crow (String crowBreed, String crowColor, String crowSize, int crowAge) {
         this.breed = crowBreed;
         this.color = crowColor;
         this.size = crowSize;
         this.age = crowAge;
     }
     void crowInfo () {
         System.out.println ("\nCrow breed: " + breed + "\nCrow color: " + color + "\nCrow size: " + size + "\nCrow age: " + age);
     }
     void voice () {
         System.out.println ("Kkkaaarrrr!!!");
     }
     void movement () {
         System.out.println ("Jumps");
     }
}


 class CrowDemo {
  public static void main (String [] args) {

    Crow crow = new Crow ("Corvus albicollis", "Black", "Small", 7);
    crow.crowInfo ();
    crow.voice ();
    crow.movement ();
   }
   }