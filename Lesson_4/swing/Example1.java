package Lesson_4.swing;

import javax.swing.*;

public class Example1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MyWindow::new);
        System.out.println("Bye main!");
    }
}

class MyWindow extends JFrame{
    MyWindow(){
        setTitle("Test window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(770, 330, 500, 500);
        setVisible(true);
    }

}
