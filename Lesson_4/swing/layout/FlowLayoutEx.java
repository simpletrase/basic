package Lesson_4.swing.layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx {
    public static void main(String[] args) {
       new MyWindowFlow();
    }
}

class MyWindowFlow extends JFrame{
    MyWindowFlow(){
        setTitle("Flow Layout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 300);
        JButton[] jbs = new JButton[10];
        setLayout(new FlowLayout());
        for (int i = 0; i < jbs.length; i++){
            jbs[i] = new JButton("#" + i);
            add(jbs[i]);
        }
        setVisible(true);
    }
}
