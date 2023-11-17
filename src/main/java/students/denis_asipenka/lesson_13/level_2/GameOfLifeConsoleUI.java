package students.denis_asipenka.lesson_13.level_2;

public class GameOfLifeConsoleUI {
    public void show(boolean[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j]) {
                    System.out.print(" o");
                } else {
                    System.out.print(" X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}