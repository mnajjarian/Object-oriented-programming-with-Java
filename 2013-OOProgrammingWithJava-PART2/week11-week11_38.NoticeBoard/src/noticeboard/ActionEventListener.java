
package noticeboard;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventListener implements ActionListener {
    
    private final JTextField jtext;
    private final JLabel jlabel;
    
    
    public ActionEventListener(JTextField jtext, JLabel jlabel) {
        this.jlabel = jlabel;
        this.jtext = jtext;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.jlabel.setText(this.jtext.getText());
        this.jtext.setText("");
    }
    
    
}
