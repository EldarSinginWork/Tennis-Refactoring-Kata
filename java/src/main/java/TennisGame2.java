
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
        String score = "";

        int player1Points = player1.getPoints();
        int player2Points = player2.getPoints();

        if (player1.sameScoreAs(player2) && player1Points < 4)
        {
            if (player1Points ==0)
                score = "Love";
            if (player1Points ==1)
                score = "Fifteen";
            if (player1Points ==2)
                score = "Thirty";
            score += "-All";
        }
        if (player1.sameScoreAs(player2) && player1Points >= 3)
            score = "Deuce";
        
        if (player1Points > 0 && player2Points==0)
        {
            if (player1Points ==1)
                P1res = "Fifteen";
            if (player1Points ==2)
                P1res = "Thirty";
            if (player1Points ==3)
                P1res = "Forty";
            
            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (player2Points > 0 && player1Points == 0)
        {
            if (player2Points==1)
                P2res = "Fifteen";
            if (player2Points==2)
                P2res = "Thirty";
            if (player1Points==3)
                P2res = "Forty";
            
            P1res = "Love";
            score = P1res + "-" + P2res;
        }
        
        if (player1Points > player2Points && player1Points < 4)
        {
            if (player1Points ==2)
                P1res="Thirty";
            if (player1Points ==3)
                P1res="Forty";
            if (player2Points ==1)
                P2res="Fifteen";
            if (player2Points ==2)
                P2res="Thirty";
            score = P1res + "-" + P2res;
        }
        if (player2Points > player1Points && player2Points < 4)
        {
            if (player2Points ==2)
                P2res="Thirty";
            if (player2Points ==3)
                P2res="Forty";
            if (player1Points ==1)
                P1res="Fifteen";
            if (player1Points ==2)
                P1res="Thirty";
            score = P1res + "-" + P2res;
        }
        
        if (player1Points > player2Points && player2Points >= 3)
        {
            score = "Advantage player1";
        }
        
        if (player2Points > player1Points && player1Points >= 3)
        {
            score = "Advantage player2";
        }
        
        if (player1Points >=4 && player2Points >=0 && (player1Points - player2Points)>=2)
        {
            score = "Win for player1";
        }
        if (player2Points >=4 && player1Points >=0 && (player2Points - player1Points)>=2)
        {
            score = "Win for player2";
        }
        return score;
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