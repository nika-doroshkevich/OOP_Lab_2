package Panels;

import Figures.Polygon;

import javax.swing.*;

public class PolygonPanel extends FigurePanel{
    JLabel xLabel = new JLabel("x:");
    JLabel yLabel = new JLabel("y:");
    JTextField xField = new JTextField(30);
    JTextField yField = new JTextField(30);
    public PolygonPanel(Panel panel, String name) {
        super(panel, name);
        mainPanel.add(xLabel);
        mainPanel.add(xField);
        mainPanel.add(yLabel);
        mainPanel.add(yField);
    }

    @Override
    public void clickButton(){
        String masXStr[] = xField.getText().split(" ");
        String masYStr[] = yField.getText().split(" ");
        if (masXStr.length == masYStr.length) {
            int masX[] = new int[masXStr.length];
            int masY[] = new int[masYStr.length];
            for(int i = 0; i < masX.length; i++){
                masX[i] = Integer.parseInt(masXStr[i]);
                masY[i] = Integer.parseInt(masYStr[i]);
            }
            f = new Polygon(masX, masY);
        }
    }
}
