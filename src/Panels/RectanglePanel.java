package Panels;

import Figures.Rectangle;

public class RectanglePanel extends EllipsePanel{
    public RectanglePanel(Panel panel, String name) {
        super(panel, name);
        r1Label.setText("w:");
        r2Label.setText("h:");
    }

    @Override
    public void clickButton(){
        f = new Rectangle(Integer.parseInt(xField.getText()),
                Integer.parseInt(yField.getText()),
                Integer.parseInt(r1Field.getText()),
                Integer.parseInt(r2Field.getText()));
    }
}
