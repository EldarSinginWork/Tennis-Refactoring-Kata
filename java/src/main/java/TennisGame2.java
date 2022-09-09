
public class TennisGame2 implements TennisGame
{

    private static final String PLAYER_1 = "player1";
    private final Player player1;
    private final Player player2;
    private int P1point = 0;
    private int P2point = 0;
    
    private String P1res = "";
    private String P2res = "";


    public TennisGame2(){
        this.player1 = new Player();
        this.player2 = new Player();
    }

    public String getScore(){
        String score = "";
        if (player1.sameScoreAs(player2) && player1.getPoints() < 4)
        {
            if (P1point==0)
                score = "Love";
            if (P1point==1)
                score = "Fifteen";
            if (P1point==2)
                score = "Thirty";
            score += "-All";
        }
        if (player1.sameScoreAs(player2) && player1.getPoints() >= 3)
            score = "Deuce";
        
        if (player1.getPoints() > 0 && player2.getPoints()==0)
        {
            if (P1point==1)
                P1res = "Fifteen";
            if (P1point==2)
                P1res = "Thirty";
            if (P1point==3)
                P1res = "Forty";
            
            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (player2.getPoints() > 0 && player1.getPoints() == 0)
        {
            if (player2.getPoints()==1)
                P2res = "Fifteen";
            if (player2.getPoints()==2)
                P2res = "Thirty";
            if (player1.getPoints()==3)
                P2res = "Forty";
            
            P1res = "Love";
            score = P1res + "-" + P2res;
        }
        
        if (P1point>P2point && P1point < 4)
        {
            if (P1point==2)
                P1res="Thirty";
            if (P1point==3)
                P1res="Forty";
            if (P2point==1)
                P2res="Fifteen";
            if (P2point==2)
                P2res="Thirty";
            score = P1res + "-" + P2res;
        }
        if (P2point>P1point && P2point < 4)
        {
            if (P2point==2)
                P2res="Thirty";
            if (P2point==3)
                P2res="Forty";
            if (P1point==1)
                P1res="Fifteen";
            if (P1point==2)
                P1res="Thirty";
            score = P1res + "-" + P2res;
        }
        
        if (P1point > P2point && P2point >= 3)
        {
            score = "Advantage player1";
        }
        
        if (P2point > P1point && P1point >= 3)
        {
            score = "Advantage player2";
        }
        
        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
            score = "Win for player1";
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

    public void wonPoint(String player) {
        if (PLAYER_1.equals(player)) {
            P1point++;
            player1.incrementPoints();
        }
        else {
            P2point++;
            player2.incrementPoints();
        }
    }
}