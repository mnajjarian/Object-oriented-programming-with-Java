
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public class ClickListener implements ActionListener {
    private final JTextField input;
    private final JTextField output;
    private final JButton z;
    
    public ClickListener(JTextField input, JTextField output, JButton z) {
        this.input = input;
        this.output = output;
        this.z = z;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int bufferOut;
        int bufferIn;
        
        try {
            if(e.getActionCommand().equals("+")) {
            bufferIn = Integer.parseInt(input.getText());
            bufferOut = Integer.parseInt(output.getText());

            bufferOut += bufferIn;

            this.input.setText("");
            this.output.setText(""+bufferOut);
            }
            if(e.getActionCommand().equals("-")) {
            bufferIn = Integer.parseInt(input.getText());
            bufferOut = Integer.parseInt(output.getText());

            bufferOut -= bufferIn;

            this.input.setText("");
            this.output.setText(""+bufferOut);
            }
            if(e.getActionCommand().equals("z")) {
            this.input.setText("");
            this.output.setText("0");
            }
            if(Integer.parseInt(this.output.getText()) == 0){
                z.setEnabled(false);
            } else {
                z.setEnabled(true);
            }
        } catch(NumberFormatException nfe) {
            this.input.setText("");
        }
    }
}
