package students.denis_asipenka.lesson_6.level_4;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int summ = 0;
        int[][] array = {
                {10, 10, 10, 10},
                {5, 5, 5, 5},
                {10, 10, 10, 10},
                {5, 5, 5, 5}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                summ = summ + array[j][j];
            }
        }
        System.out.println(summ);
    }
}