package students.denis_asipenka.lesson_5.level_2;

public class Task_15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int sum = 0;
        numbers[0] = (int) (Math.random() * range) + min;
        numbers[1] = (int) (Math.random() * range) + min;
        numbers[2] = (int) (Math.random() * range) + min;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + 2 + ", ");
        }

    }
}
