
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

    public String getScore(){
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
            P1res = player1.getPointsAsScore();
            
            P2res = "Love";
        }

        if (player2Points > 0 && player1Points == 0)
        {
            P2res = player2.getPointsAsScore();
            P1res = "Love";
        }
        
        if (player1Points > player2Points && player1Points < 4)
        {
            P1res = player1.getPointsAsScore();
            P2res = player2.getPointsAsScore();
        }

        if (player2Points > player1Points && player2Points < 4)
        {
            P1res = player1.getPointsAsScore();
            P2res = player2.getPointsAsScore();
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

        return P1res + "-" + P2res;
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