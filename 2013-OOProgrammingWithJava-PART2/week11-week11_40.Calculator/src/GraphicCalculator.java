
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension (300, 200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField output = new JTextField("0");
        output.setEnabled(false);
        
        JTextField input = new JTextField();
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));
        
        JButton sum = new JButton("+");
        JButton min = new JButton("-");
        JButton z = new JButton("z");
        z.setEnabled(false);
        
        ClickListener listener = new ClickListener(input, output, z);
        sum.addActionListener(listener);
        min.addActionListener(listener);
        z.addActionListener(listener);
        
        panel.add(sum);
        panel.add(min);
        panel.add(z);
        
        container.add(output);
        container.add(input);
        container.add(panel, BorderLayout.SOUTH);
 
    }
    public JFrame getFrame() {
        return frame;
    }    

}