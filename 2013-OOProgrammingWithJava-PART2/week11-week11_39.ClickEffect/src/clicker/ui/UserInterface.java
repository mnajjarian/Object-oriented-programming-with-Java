package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    private final Calculator calculator;
    private JFrame frame;
    
    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
       GridLayout layout = new GridLayout(2,1);
       container.setLayout(layout);
       
       JLabel label = new JLabel("0");
       JButton button = new JButton("Click!");
       
       ClickListener listener = new ClickListener(calculator, label);
       button.addActionListener(listener);
       
       container.add(label);
       container.add(button);
    }

    public JFrame getFrame() {
        return frame;
    }
}
