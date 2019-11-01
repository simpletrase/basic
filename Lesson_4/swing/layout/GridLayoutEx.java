package Lesson_4.swing.layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx {
    public static void main(String[] args) {
        new MyWindowGrid();
    }
}

class MyWindowGrid extends JFrame{
    MyWindowGrid(){
        setTitle("Grid Layout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 300);
        JButton[] jbs = new JButton[10];
        setLayout(new GridLayout(4, 3));
        for (int i = 0; i < jbs.length; i++){
            jbs[i] = new JButton("#" + i);
            add(jbs[i]);
        }
        setVisible(true);
    }
}
