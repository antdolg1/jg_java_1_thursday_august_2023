package teacher.lesson_7.lessoncode;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        //создание пустого двумерного массива размером 3х3
        int[][] matrix = new int[3][3];

        //создание и инициализация двумерного массива
        int[][] table = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //доступ к элементам друмерных массивов
        int matrixTwoValue = table[2][2];
        table[2][2] = 12;
        matrixTwoValue = table[2][2];
        System.out.println(matrixTwoValue);

        //итерация по двумерным массивам
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }

    }
}
