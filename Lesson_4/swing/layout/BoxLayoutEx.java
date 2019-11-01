package Lesson_4.swing.layout;

import javax.swing.*;

public class BoxLayoutEx {
    public static void main(String[] args) {
        new MyWindowBox();
    }
}

class MyWindowBox extends JFrame{
    MyWindowBox(){
        setTitle("Box Layout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 300);
        JButton[] jbs = new JButton[10];

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        for (int i = 0; i < jbs.length; i++){
            jbs[i] = new JButton("#" + i);
//            jbs[i].setAlignmentX(CENTER_ALIGNMENT);
            jbs[i].setAlignmentX(LEFT_ALIGNMENT);
            add(jbs[i]);
        }
        setVisible(true);
    }
}


