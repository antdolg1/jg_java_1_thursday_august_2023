package students.denis_asipenka.lesson_15.level_4;

import java.util.HashMap;
import java.util.Map;

public class Tennis implements TennisGame {
    private String playerOne;
    private String playerTwo;
    private final Map<String, Integer> scoreList = new HashMap<>();

    public Tennis(String playerName1, String playerName2) {
        this.playerOne = playerName1;
        this.playerTwo = playerName2;
        scoreList.put(playerOne, 0);
        scoreList.put(playerTwo, 0);
    }

    @Override
    public void wonPoint(String playerName) {
        scoreList.put(playerName.toLowerCase(), scoreList.get(playerName.toLowerCase()) + 1);
    }

    @Override
    public String score() {
        int player1 = scoreList.get(playerOne);
        int player2 = scoreList.get(playerTwo);
        if (player1 >= 4 || player2 >= 4) {
            int difference = player1 - player2;
            if (Math.abs(difference) >= 2) {
                return "Win for " + (difference > 0 ? playerOne : playerTwo);
            } else if (Math.abs(difference) == 1) {
                return "Advantage " + (difference > 0 ? playerOne : playerTwo);
            }
        } else if (player1 == player2) {
            if (player1 < 3) {
                return convertNumberInString(player1) + "-All";
            } else {
                return "Deuce";
            }
        }
        if (player1 >= 3 && player2 >= 3) {
            return (player1 == player2) ? "Deuce" : "Advantage " + (player1 > player2 ? playerOne : playerTwo);
        }
        return convertNumberInString(player1) + "-" + convertNumberInString(player2);
    }

    public String convertNumberInString(int number) {
        String[] values = {"Love", "Fifteen", "Thirty", "Forty"};
        return values[number];
    }
}