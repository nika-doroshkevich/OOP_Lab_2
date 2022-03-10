package Figures;

public class Ellipse extends Figure {
    public Ellipse (int x, int y, int r1, int r2){
        if (r1 <= 0 || r2 <= 0)
            throw new RuntimeException("Radius is negative or zero.");
        int n = (int) (Math.PI * (r1+r2)/5);
        masX = new int[n];
        masY = new int[n];
        for (int i = 0; i < n; i++) {
            double t = 2 * Math.PI * i / n;
            masX[i] = (int) (r1 * Math.cos(t)+x);
            masY[i] = (int) (r2 * Math.sin(t)+y);
        }
    }
}
