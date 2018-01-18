
package movingfigure;

import java.awt.Graphics;

public class Square extends Figure {
    private final int sideLength;
    
    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(x, y, sideLength, sideLength);
    }
    
}
