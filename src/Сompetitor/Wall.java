package Сompetitor;

public class Wall implements Obstacle {
    private static final String NAME="wall";
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String NameOfObstacle() {
        return NAME;
    }

    @Override
    public void overcoming(Competitior competitior) {
        competitior.jumping((int)height);

    }
}
