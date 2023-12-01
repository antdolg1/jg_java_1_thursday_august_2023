package students.denis_asipenka.lesson_15.level_4;

public class TennisGame2 implements TennisGame {
    private int player1Points = 0;
    private int player2Points = 0;
    private String player1Name;
    private String player2Name;
    private final String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public String score() {
        if (player1Points >= 4 || player2Points >= 4) {
            int difference = player1Points - player2Points;
            if (Math.abs(difference) >= 2) {
                return "Win for " + (difference > 0 ? "player1" : "player2");
            } else if (Math.abs(difference) == 1) {
                return "Advantage " + (difference > 0 ? "player1" : "player2");
            }
        }
        if (player1Points == player2Points) {
            if (player1Points < 3) {
                return scoreNames[player1Points] + "-All";
            } else {
                return "Deuce";
            }
        }
        if (player1Points >= 3 && player2Points >= 3) {
            return "Advantage " + (player1Points > player2Points ? "player1" : "player2");
        }
        return scoreNames[player1Points] + "-" + scoreNames[player2Points];
    }

    private void player1Score() {
        player1Points++;
    }

    private void player2Score() {
        player2Points++;
    }

    @Override
    public void wonPoint(String player) {
        if (player.equals("player1")) {
            player1Score();
        } else {
            player2Score();
        }
    }
}