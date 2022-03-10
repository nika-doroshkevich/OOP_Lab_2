package Panels;

import Figures.Circle;
import javax.swing.*;

public class CirclePanel extends FigurePanel {
    JLabel xLabel = new JLabel("x:");
    JLabel yLabel = new JLabel("y:");
    JLabel r1Label = new JLabel("r1:");
    JTextField xField = new JTextField(3);
    JTextField yField = new JTextField(3);
    JTextField r1Field = new JTextField(3);
    public CirclePanel(Panel panel, String name) {
        super(panel, name); //Вызов конструктора родителя
        mainPanel.add(xLabel);
        mainPanel.add(xField);
        mainPanel.add(yLabel);
        mainPanel.add(yField);
        mainPanel.add(r1Label);
        mainPanel.add(r1Field);
    }

    @Override
    public void clickButton(){
        f = new Circle(Integer.parseInt(xField.getText()),
                Integer.parseInt(yField.getText()),
                Integer.parseInt(r1Field.getText()));
    }
}
