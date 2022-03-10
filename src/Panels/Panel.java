package Panels;

import Figures.*;
import Figures.Polygon;
import Figures.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Panel extends JPanel {
    ArrayList<Figure> arr = new ArrayList<>();

    Frame frame;
    {
        arr.add(new Ellipse(100,100,75,50));
        arr.add(new Triangle(250,250,300,50,350,250));
        arr.add(new Polygon(100, 180, 150, 190, 125, 230, 75, 200, 85, 170));
        arr.add((new Square(100, 300, 100)));
        arr.add(new Rectangle(250, 300, 100, 200));
        arr.add(new Circle(450, 300, 50));
    }

    public Panel(Frame frame) {

    }
    public void addFigure(Figure f){
        arr.add(f);
    }
    public void reDraw(){
        repaint();
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        for(Figure f:arr) {
            int masX[] = f.getMasX();
            int masY[] = f.getMasY();
            g.setColor(Color.black);
            for (int i = 0; i < masX.length; i++)
                g.drawLine(masX[i], masY[i], masX[(i + 1) % masX.length], masY[(i + 1) % masY.length]);
        }
    }
}
