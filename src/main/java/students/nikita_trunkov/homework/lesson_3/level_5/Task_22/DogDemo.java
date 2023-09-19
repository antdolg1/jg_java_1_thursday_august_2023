package students.nikita_trunkov.homework.lesson_3.level_5.Task_22;

 class DogDemo {
    public static void main (String [] args) {
        Dog dog = new Dog ("Мухтар ", "Чёрный ", 3);
        dog.voice ();
        dog.newColor = "Белый ";
        dog.changeColor();
    }
}
