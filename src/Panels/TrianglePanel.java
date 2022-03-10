package Panels;

import Figures.Triangle;

import javax.swing.*;

public class TrianglePanel extends EllipsePanel{
    JLabel x3Label = new JLabel("x3:");
    JTextField x3Field = new JTextField(3);
    JLabel y3Label = new JLabel("y3:");
    JTextField y3Field = new JTextField(3);
    public TrianglePanel(Panel panel, String name) {
        super(panel, name);
        mainPanel.add(x3Label);
        mainPanel.add(x3Field);
        mainPanel.add(y3Label);
        mainPanel.add(y3Field);

        xLabel.setText("x1:");
        yLabel.setText("y1:");
        r1Label.setText("x2:");
        r2Label.setText("y2:");
    }

    @Override
    public void clickButton(){
        f = new Triangle(Integer.parseInt(xField.getText()),
                Integer.parseInt(yField.getText()),
                Integer.parseInt(r1Field.getText()),
                Integer.parseInt(r2Field.getText()),
                Integer.parseInt(x3Field.getText()),
                Integer.parseInt(y3Field.getText()));
    }
}
