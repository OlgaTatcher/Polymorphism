package GeometricFigures;

public class Triangle implements GeometricFigure{
    private static final String NAME="Triangle";
    public double baseOfATriangle;
    public double heightOfATriangle;

    public Triangle(double baseOfATriangle, double heightOfATriangle) {
        this.baseOfATriangle = baseOfATriangle;
        this.heightOfATriangle = heightOfATriangle;
    }

    @Override
    public double figureArea() {
        double area = (double) (baseOfATriangle * heightOfATriangle) /2;
        return area;
    }

    @Override
    public String NameOfFigure() {
        return NAME;
    }
}
