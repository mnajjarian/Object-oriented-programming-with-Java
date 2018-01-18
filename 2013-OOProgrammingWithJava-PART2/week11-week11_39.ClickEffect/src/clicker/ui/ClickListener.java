
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
    private final Calculator calculator;
    private final JLabel label;
    
    public ClickListener(Calculator calculator, JLabel label) {
        this.calculator = calculator;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.increase();
        this.label.setText(Integer.toString(calculator.giveValue()));
    }
    
}
