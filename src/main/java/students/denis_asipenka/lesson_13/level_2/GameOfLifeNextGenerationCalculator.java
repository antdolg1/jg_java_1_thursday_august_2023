package students.denis_asipenka.lesson_13.level_2;

public class GameOfLifeNextGenerationCalculator {
    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[0].length; j++) {
                int count = countLiveNeighbors(currentGeneration, i, j);
                if (currentGeneration[i][j] && (count < 2 || count > 3)) {
                    nextGeneration[i][j] = false;
                } else if (!currentGeneration[i][j] && count == 3) {
                    nextGeneration[i][j] = true;
                } else {
                    nextGeneration[i][j] = currentGeneration[i][j];
                }
            }
        }
        return nextGeneration;
    }

    public int countLiveNeighbors(boolean[][] currentGeneration, int i, int j) {
        int numberOfLivingCells = 0;
        int[] checkingNeighbors = {-1, 0, 1};
        for (int x : checkingNeighbors) {
            for (int y : checkingNeighbors) {
                if (x == 0 && y == 0) {
                    continue;
                }

                int neighborX = i + x;
                int neighborY = j + y;

                if (neighborX >= 0 && neighborX < currentGeneration.length && neighborY >= 0 && neighborY < currentGeneration[neighborX].length) {
                    if (currentGeneration[neighborX][neighborY]) {
                        numberOfLivingCells++;
                    }
                }
            }
        }
        return numberOfLivingCells;
    }
}