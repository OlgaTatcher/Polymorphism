package Сompetitor;

public class Track implements Obstacle {
    private static final String NAME="track";
    private int length=50;

    public Track(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    @Override
    public String NameOfObstacle() {
        return NAME;
    }

    @Override
    public void overcoming(Competitior competitior) {
        competitior.running(length);

    }
}
