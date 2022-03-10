package Figures;

public class Triangle extends Polygon {
    public Triangle (int x1, int y1, int x2, int y2, int x3, int y3){
        super(x1, y1, x2, y2, x3, y3);
        if((x1 - x2) / (x2 - x3) == (y1 - y2) / (y2 - y3))
            throw new RuntimeException("Triangle is degenerate.");
    }
}
