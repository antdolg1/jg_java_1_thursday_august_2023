package students.nikita_trunkov.homework.lesson_3.level_7.Task_29;

 class Cat {
    String breed;
    String color;
    String size;
    int age;
    Cat (String catBreed, String catColor, String catSize, int catAge) {
        this.breed = catBreed;
        this.color = catColor;
        this.size = catSize;
        this.age = catAge;
    }
    void catInfo () {
        System.out.println ("\nCat breed: " + breed + "\nCat color: " + color + "\nCat size: " + size + "\nCat age: " + age);
    }
    void voice () {
        System.out.println ("Meow");
    }
    void movement () {
        System.out.println ("Runs");
    }
}
class CatDemo {
public static void main (String [] args) {
Cat cat = new Cat ("Burma", "White","Small", 4);
cat.catInfo ();
cat.voice ();
cat.movement ();
}
}