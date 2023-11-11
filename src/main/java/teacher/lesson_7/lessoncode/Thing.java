package teacher.lesson_7.lessoncode;

public class Thing {
    public String name;
    public static String description;

    public static void showDescription() {
        System.out.println(description);
//        System.out.println(name);
        //мы не можем ссылаться на нестатическую переменную из статического контекста
    }
}
