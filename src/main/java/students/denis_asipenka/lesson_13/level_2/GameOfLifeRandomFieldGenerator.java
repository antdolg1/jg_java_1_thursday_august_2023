package students.denis_asipenka.lesson_13.level_2;

import java.util.Random;

public class GameOfLifeRandomFieldGenerator {
    public boolean[][] generate(int fieldWidth, int fieldHeight) {
        Random random = new Random();
        boolean[][] playingField = new boolean[fieldHeight][fieldWidth];
        for (int i = 0; i < playingField.length; i++) {
            for (int j = 0; j < playingField[i].length; j++) {
                playingField[i][j] = random.nextBoolean();
            }
        }
        return playingField;
    }
}