package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        graphics.setColor(Color.BLACK);
        graphics.fillRect(100, 60, 50, 50);
	graphics.setColor(Color.BLACK);
	graphics.fillRect(240, 60, 50, 50);
	graphics.setColor(Color.BLACK);
	graphics.fillRect(50, 200, 50, 50);
	graphics.setColor(Color.BLACK);
	graphics.fillRect(290, 200, 50, 50);
	graphics.setColor(Color.BLACK);
	graphics.fillRect(100, 250, 190, 50);

    }
}
