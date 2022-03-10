package Panels;

import Figures.Figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FigurePanel extends JPanel {
    Figure f;
    Panel panel;
    JLabel label;
    JPanel mainPanel = new JPanel();
    JButton button = new JButton("Create");
    public FigurePanel(Panel panel, String name){
        this.panel = panel;
        label = new JLabel(name);
        setLayout(new BorderLayout());
        add(label, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        mainPanel.setLayout(new FlowLayout());
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickButton();
                panel.addFigure(f);
                panel.reDraw();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
    public void clickButton(){

    }

}
