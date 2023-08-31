package teacher.lessoncode;

public class IfElseStatement {

    public static void main(String[] args) {

        //if statement
        int age = 20;

        if (age >= 18) {
            System.out.println("Вы совершеннолетний!");
        }

        //if-else statement
        int temperature = 25;

        if (temperature > 30) {
            System.out.println("Сегодня слишком жарко");
        } else {
            System.out.println("Вот так мне больше по душе");
        }

        //if-else if-else statement
        int score = 75;

        if (score >= 90) {
            System.out.println("Отлично");
        } else if (score >= 70) {
            System.out.println("Хорошо");
        } else if (score >= 50) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Плохо");
        }


    }

}
