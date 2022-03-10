package Figures;

public class Polygon extends Figure {
    public Polygon(int[] masX, int[] masY) {
        this.masX = masX;
        this.masY = masY;
    }

    public Polygon(int... mas) {
        masX = new int[mas.length / 2];
        masY = new int[mas.length / 2];
        for (int i = 0; i < mas.length / 2; i++) {
            masX[i] = mas[2 * i];
            masY[i] = mas[2 * i + 1];
        }
    }
}
