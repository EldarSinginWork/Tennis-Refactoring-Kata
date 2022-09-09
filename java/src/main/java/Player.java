public class Player {
    private int points = 0;

    public void incrementPoints() {
        points++;
    }

    public int getPoints() {
        return points;
    }

    public boolean sameScoreAs(Player other) {
        return this.points == other.points;
    }
}
