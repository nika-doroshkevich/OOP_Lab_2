package Figures;

public abstract class Figure {
    protected int[] masX;
    protected int[] masY;
    protected int countPoint = 3;
    public int[] getMasX() {
        return masX;
    }

    public int[] getMasY() {
        return masY;
    }

    public int getCountPoint() {
        return countPoint;
    }
}
