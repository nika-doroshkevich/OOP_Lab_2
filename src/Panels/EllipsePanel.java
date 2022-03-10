package Panels;

import Figures.Ellipse;
import javax.swing.*;

public class EllipsePanel extends CirclePanel{
    JLabel r2Label = new JLabel("r2:");
    JTextField r2Field = new JTextField(3);

    public EllipsePanel(Panel panel, String name) {
        super(panel, name);
        mainPanel.add(r2Label);
        mainPanel.add(r2Field);
    }

    @Override
    public void clickButton(){
        f = new Ellipse(Integer.parseInt(xField.getText()),
                Integer.parseInt(yField.getText()),
                Integer.parseInt(r1Field.getText()),
                Integer.parseInt(r2Field.getText()));
    }
}
