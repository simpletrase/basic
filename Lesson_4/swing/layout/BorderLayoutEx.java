package Lesson_4.swing.layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx {
    public static void main(String[] args) {
//        new MyWindow();
        new MyWindow2();
    }
}

class MyWindow extends JFrame{
    MyWindow(){
        setTitle("Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 300);
        JButton[] jbs = new JButton[5];
        for (int i = 0; i < 5; i++){
            jbs[i] = new JButton("#" + i);
        }
        setLayout(new BorderLayout());
        add(jbs[0], BorderLayout.EAST);
        add(jbs[1], BorderLayout.WEST);
        add(jbs[2], BorderLayout.NORTH);
        add(jbs[3], BorderLayout.SOUTH);
        add(jbs[4], BorderLayout.CENTER);
        setVisible(true);
    }
}

class MyWindow2 extends JFrame{
    public MyWindow2(){
        setTitle("Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 300, 400, 400);

        JButton button = new JButton("Button 1 (PAGE_START)");
        add(button, BorderLayout.PAGE_START);

        button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(100, 50));
        add(button, BorderLayout.CENTER);

        button = new JButton("Button 3 (LINE_START)");
        add(button, BorderLayout.LINE_START);

        button = new JButton("Button 4 (PAGE_END)");
        add(button, BorderLayout.PAGE_END);

        button = new JButton("Button 5 (LINE_END)");
        add(button, BorderLayout.LINE_END);
        pack();
        setVisible(true);
    }
}
