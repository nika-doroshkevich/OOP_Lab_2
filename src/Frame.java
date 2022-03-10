import Panels.*;
import Panels.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    Panels.Panel p = new Panel(this);
    JPanel panel;
    String[] masNames = {"None","Circle","Ellipse","Polygon","Rectangle","Square","Triangle"};
    JComboBox selectBox = new JComboBox(masNames);

    public Frame(){
        setSize(700, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(p, BorderLayout.CENTER);

        add(selectBox, BorderLayout.NORTH);
        setVisible(true);

        selectBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(panel!=null){
                    panel.getParent().remove(panel);
                }
                String s = (String) selectBox.getSelectedItem();
                switch (s){
                    case "Circle":
                       panel = new CirclePanel(p,s);
                        break;
                    case "Polygon":
                        panel = new PolygonPanel(p,s);
                        break;
                    case "Ellipse":
                        panel = new EllipsePanel(p,s);
                        break;
                    case "Rectangle":
                        panel = new RectanglePanel(p,s);
                        break;
                    case "Square":
                        panel = new SquarePanel(p,s);
                        break;
                    case "Triangle":
                        panel = new TrianglePanel(p,s);
                        break;
                }
                add(panel, BorderLayout.EAST);

                {
                    int w = getWidth();
                    int h = getHeight();
                    setSize(w + 1, h);
                    setSize(w, h);
                }
            }
        });
    }
}
