package Lesson_4.swing;

import javax.swing.*;
import java.awt.event.*;

public class Test {
    private JList<String> listItems;
    private JPanel panel1;
    private JTextField customInputText;
    private JButton myButton;

    public Test() {

        DefaultListModel listModel = new DefaultListModel();
        listItems.setModel(listModel);
        
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("HELLO!");
            }
        });

        customInputText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(customInputText.getText());
                customInputText.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setContentPane(new Test().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bye from menu");
                frame.dispose();
            }
        });

        menu.add(exitMenuItem);

        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Bye from X");
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
}



