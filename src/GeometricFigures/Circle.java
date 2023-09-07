package GeometricFigures;

public class Circle implements GeometricFigure{
    private static final String NAME="Circle";
    public int radius;
    final double PI=3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double figureArea() {
        double area = PI*radius*radius;
        return area;
    }

    @Override
    public String NameOfFigure() {
        return NAME;
    }


}
