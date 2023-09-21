package teacher.lesson_7.lessoncode;

public class CircleSquareDrawing {
    public static void main(String[] args) {

        int size = 5;
        char[][] square = new char[size][size];

        //заполнение двумерного массива символами кружочков
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                square[i][j] = '○';
            }
        }

        //отрисовка квадрата из кружочков
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(square[i][j] + "  ");
            }
            System.out.println(); //переход на новую строку для следующей строки квадрата
        }

    }
}
