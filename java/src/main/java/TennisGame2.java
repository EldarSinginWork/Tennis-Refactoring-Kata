
public class TennisGame2 implements TennisGame
{

    private static final String PLAYER_1 = "player1";
    private final Player player1;
    private final Player player2;

    private String P1res = "";
    private String P2res = "";


    public TennisGame2(){
        this.player1 = new Player();
        this.player2 = new Player();
    }

    public String getScore() {
        int player1Points = player1.getPoints();
        int player2Points = player2.getPoints();

        if (player1.sameScoreAs(player2) && player1Points >= 3) {
            return "Deuce";
        }

        if (player1.sameScoreAs(player2) && player1Points < 4)
        {
            return player1.getPointsAsScore() + "-All";
        }

        if (player1Points > 0 && player2Points==0)
        {
            player1.updateScore();
            P2res = "Love";
        }

        if (player2Points > 0 && player1Points == 0)
        {
            player2.updateScore();
            P1res = "Love";
        }
        
        if (player1Points > player2Points && player1Points < 4)
        {
            player1.updateScore();
            player2.updateScore();
        }

        if (player2Points > player1Points && player2Points < 4)
        {
            player1.updateScore();
            player2.updateScore();
        }

        if (player1Points >=4 && player2Points >=0 && (player1Points - player2Points)>=2)
        {
            return "Win for player1";
        }

        if (player2Points >=4 && player1Points >=0 && (player2Points - player1Points)>=2)
        {
            return "Win for player2";
        }

        if (player1Points > player2Points && player2Points >= 3)
        {
            return "Advantage player1";
        }

        if (player2Points > player1Points && player1Points >= 3)
        {
            return "Advantage player2";
        }

        return player1.getPointsAsScore() + "-" + player2.getPointsAsScore();
    }

    public void wonPoint(String player) {
        if (PLAYER_1.equals(player)) {
          player1.incrementPoints();
        }
        else {
            player2.incrementPoints();
        }
    }
}