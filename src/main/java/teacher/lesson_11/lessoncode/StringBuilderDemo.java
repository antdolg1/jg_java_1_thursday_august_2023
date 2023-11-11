package teacher.lesson_11.lessoncode;

public class StringBuilderDemo {
    public static void main(String[] args) {

        String hello = "hello";
        String world = " world";
        String helloWorld = hello + world;
        System.out.println(helloWorld);

        //Basic Usage
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("World!");
        System.out.println(sb.toString()); //Outputs: Hello, World! Since Java 17, there is no need to call toString()


        //Inserting and Deleting
        StringBuilder sb_2 = new StringBuilder("Java Programming");
        sb_2.insert(5, "is cool "); //Inserts the string ar specified position
        System.out.println(sb_2);

        sb_2.delete(5, 13); //Deletes the substring from start index to the end index (exclusive)
        System.out.println(sb_2);

        StringBuilder sb_3 = new StringBuilder("Hello");
        sb_3.reverse();
        System.out.println(sb_3);

        StringBuilder sb_4 = new StringBuilder("I love Ruby");
        sb_4.replace(7, 11, "Java");
        System.out.println(sb_4);
    }
}
