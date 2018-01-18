
package movingfigure;

import java.util.ArrayList;
import java.util.List;
import java.awt.Graphics;

public class CompoundFigure extends Figure {
    private final List<Figure> figure;
    
    public CompoundFigure(int x, int y) {
        super(x, y);
        this.figure = new ArrayList<Figure>();
    }
    public CompoundFigure() {
        super(1, 2);
        this.figure = new ArrayList<Figure>();
    }
    public void add(Figure f) {
        figure.add(f);
        
    }
    @Override
    public void draw(Graphics graphics) {
        for(Figure drawing : figure) {
            drawing.draw(graphics);
        }
    }
    @Override
    public void move(int dx, int dy) {
        for(Figure drawing : figure) {
            drawing.move(dx, dy);
        }
    }
    
}
