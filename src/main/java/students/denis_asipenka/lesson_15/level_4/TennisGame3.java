package students.denis_asipenka.lesson_15.level_4;

public class TennisGame3 implements TennisGame {
    private int playerTwo;
    private int playerOne;
    private String playerOneName;
    private String playerTwoName;

    public TennisGame3(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    @Override
    public String score() {
        String result;
        if (playerOne < 4 && playerTwo < 4 && !(playerOne + playerTwo == 6)) {
            String[] nameScore = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            result = nameScore[playerOne];
            return (playerOne == playerTwo) ? result + "-All" : result + "-" + nameScore[playerTwo];
        } else {
            if (playerOne == playerTwo) {
                return "Deuce";
            }
            result = playerOne > playerTwo ? playerOneName : playerTwoName;
            return ((playerOne - playerTwo) * (playerOne - playerTwo) == 1) ? "Advantage " + result : "Win for " + result;
        }
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            this.playerOne += 1;
        } else {
            this.playerTwo += 1;
        }
    }
}