package Panels;

import Figures.Square;

public class SquarePanel extends CirclePanel{

    public SquarePanel(Panel panel, String name) {
        super(panel, name);
        r1Label.setText("w:");
    }

    @Override
    public void clickButton(){
        f = new Square(Integer.parseInt(xField.getText()),
                Integer.parseInt(yField.getText()),
                Integer.parseInt(r1Field.getText()));
    }
}
