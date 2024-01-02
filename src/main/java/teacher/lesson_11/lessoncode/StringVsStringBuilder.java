package teacher.lesson_11.lessoncode;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str3 = "Hello";

        System.out.println(str1.hashCode());
        System.out.println(str3.hashCode());

        System.out.println();

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str3));

    }
}
