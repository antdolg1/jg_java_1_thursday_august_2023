package teacher.lesson_7.lessoncode.access_modifiers;

public class CatDemo {
    public static void main(String[] args) {

        Cat cat = new Cat(1, "Whiskas");
        int catAge = cat.getAge();
        String catNickname = cat.getNickname();

        System.out.println("Cat " + catNickname + " age is " + catAge + " years old.");

        cat.setNickname("Kitekat");
        cat.setAge(123132132);

        System.out.println("Cat " + cat.getNickname() + " age is " + cat.getAge() + " years old.");

    }
}
