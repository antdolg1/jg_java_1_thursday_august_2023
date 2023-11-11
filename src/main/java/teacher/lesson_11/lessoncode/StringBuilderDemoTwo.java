package teacher.lesson_11.lessoncode;

public class StringBuilderDemoTwo {
    public static void main(String[] args) {
        stringExample();
        stringBuilderExample();
    }

    public static void stringExample() {
        System.out.println("String Example:");
        String result = "";
        for (int i = 0; i < 10; i++) {
            System.out.println(System.identityHashCode(result));
            result += "A";
        }
        System.out.println();
    }

    public static void stringBuilderExample() {
        System.out.println("String Builder Example:");
        StringBuilder sb = new StringBuilder();
        System.out.println("Before loop: " + System.identityHashCode(sb));
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside loop: " + System.identityHashCode(sb));
            sb.append("A");
        }
        System.out.println("After loop: " + System.identityHashCode(sb));
    }
}
