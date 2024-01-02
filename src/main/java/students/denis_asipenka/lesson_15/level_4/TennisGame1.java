package students.denis_asipenka.lesson_15.level_4;

public class TennisGame1 implements TennisGame {
    private int PlayerScore1 = 0;
    private int PlayerScore2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            PlayerScore1++;
        } else {
            PlayerScore2++;
        }
    }

    @Override
    public String score() {
        String score = "";
        int tempScore = 0;
        if (PlayerScore1 == PlayerScore2) {
            score = switch (PlayerScore1) {
                case 0 -> "Love-All";
                case 1 -> "Fifteen-All";
                case 2 -> "Thirty-All";
                default -> "Deuce";
            };
        } else if (PlayerScore1 >= 4 || PlayerScore2 >= 4) {
            int minusResult = PlayerScore1 - PlayerScore2;
            if (minusResult == 1) {
                score = "Advantage player1";
            } else if (minusResult == -1) {
                score = "Advantage player2";
            } else if (minusResult >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = PlayerScore1;
                } else {
                    score += "-";
                    tempScore = PlayerScore2;
                }
                switch (tempScore) {
                    case 0 -> score += "Love";
                    case 1 -> score += "Fifteen";
                    case 2 -> score += "Thirty";
                    case 3 -> score += "Forty";
                }
            }
        }
        return score;
    }
}