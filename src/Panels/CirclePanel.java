package Panels;

import Figures.Circle;

import javax.swing.*;

public class CirclePanel extends FigurePanel {
    JLabel xLabel = new JLabel("x:");
    JLabel yLabel = new JLabel("y:");
    JLabel rLabel = new JLabel("r:");
    JTextField xField = new JTextField(3);
    JTextField yField = new JTextField(3);
    JTextField rField = new JTextField(3);
    public CirclePanel(Panel panel, String name) {
        super(panel, name);
        mainPanel.add(xLabel);
        mainPanel.add(xField);
        mainPanel.add(yLabel);
        mainPanel.add(yField);
        mainPanel.add(rLabel);
        mainPanel.add(rField);
    }

    @Override
    public void clickButton(){
        f = new Circle(Integer.parseInt(xField.getText()),
                Integer.parseInt(yField.getText()),
                Integer.parseInt(rField.getText()));
    }
}
