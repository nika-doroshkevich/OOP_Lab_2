import Figures.Circle;
import Figures.Ellipse;
import Figures.Figure;
import Figures.Polygon;
import Panels.CirclePanel;
import Panels.FigurePanel;
import Panels.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    Panels.Panel p = new Panel(this);
    JPanel panel;
    Figure f;
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
                        panel = new FigurePanel(p,s);
                        break;
                    case "Ellipse":
                        panel = new FigurePanel(p,s);
                        break;
                }
                add(panel, BorderLayout.EAST);
                setSize(701,701);
                setSize(700,700);
            }
        });
    }
}
