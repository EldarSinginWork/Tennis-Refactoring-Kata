public class Player {
    private int points = 0;
    private String score = "";

    public void incrementPoints() {
        points++;
    }

    public int getPoints() {
        return points;
    }

    public boolean sameScoreAs(Player other) {
        return this.points == other.points;
    }

    public String getPointsAsScore() {
        if (points == 0) {
            return  "Love";
        }
        if (points == 1) {
            return  "Fifteen";
        }
        if (points == 2) {
            return  "Thirty";
        }
        if (points == 3) {
            return  "Forty";
        }

        return "";
    }
}
