package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame
{
    public MyWindow()
    {
        setVisible(true);

        setSize(700, 700);
        setLocation(850, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton firstButton = new JButton("Кнопка1");
       // add(firstButton, BorderLayout.NORTH);

        JButton secondButton = new JButton("Выход");
        //add(secondButton, BorderLayout.SOUTH);
        ActionListener listener = new CloseActionListener();
        secondButton.addActionListener(listener);


        JPanel panel = new JPanel(new GridLayout(1,2));
        panel.add(firstButton);
        panel.add(secondButton);

        add(panel, BorderLayout.SOUTH);
    }
}
