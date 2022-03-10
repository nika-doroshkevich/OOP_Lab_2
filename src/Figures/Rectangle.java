package Figures;

public class Rectangle extends Polygon {
    {
        countPoint = 2;
    }
    public Rectangle (int x, int y, int w, int h) {
        super(x, y, x + w, y, x + w, y + h, x, y + h);
    }
}
