package teacher.lesson_14.lessoncode.lambda;

public class CustomLambdaDemo {

    public static void main(String[] args) {

        StringOperation reverse = str -> new StringBuilder(str).reverse().toString();
        System.out.println("Reverse of 'hello':" + reverse.operate("hello"));

    }

}
