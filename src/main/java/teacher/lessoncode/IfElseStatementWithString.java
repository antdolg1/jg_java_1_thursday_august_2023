package teacher.lessoncode;

public class IfElseStatementWithString {
    public static void main(String[] args) {

        String vegetable = "carrot";

        if (vegetable.equals("orange")) {
            System.out.println("Orange");
        } else if (vegetable.equals("potato")) {
            System.out.println("Potato");
        } else if (vegetable.equals("carrot")) {
            System.out.println("Carrot");
        } else {
            System.out.println("Unknown vegetable");
        }

    }
}
