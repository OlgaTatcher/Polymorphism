package GeometricFigures;

import javax.print.attribute.standard.MediaSize;

public class Square implements GeometricFigure{
    private static final String NAME="Square";
    public double sideOfASquare;

    public Square(double sideOfASquare) {
        this.sideOfASquare = sideOfASquare;
    }

    @Override
    public double figureArea() {
        double area =(double) sideOfASquare*sideOfASquare;
        return area;
    }

    @Override
    public String NameOfFigure() {
        return NAME;
    }


}
