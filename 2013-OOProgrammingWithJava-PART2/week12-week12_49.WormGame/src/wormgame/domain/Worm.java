
package wormgame.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import wormgame.Direction;

public class Worm {
    private final List<Piece> pieces = new ArrayList<Piece>();
    private Direction direction;
    private Piece head;
    private boolean growing = false;
    
    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.direction = originalDirection;
        this.head = new Piece(originalX, originalY);
        pieces.add(head);
    }
    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction dir) {
        direction = dir;
    }
    public List<Piece> getPieces() {
        return pieces;
    }
    public int getLength() {
        return getPieces().size();
    }
    public void move() {
        moveHead();
        moveTail();
    }

    private void moveHead() {
        Piece newHead = head.move(direction);
        pieces.add(newHead);
        head = newHead;
    }

    private void moveTail() {
        if (!growing && getLength() > 3) {
            pieces.remove(0);
        }
        growing = false;
    }
    public void grow() {
        this.growing = true;
    }
    public boolean runsInto(Piece piece) {
        for (Piece wormPiece : pieces) {
            if (piece.toString().equals(wormPiece.toString())) {
                return true;
            }
        }
        return false;
    }
    public boolean runsIntoItself() {
        Set<Piece> set = new HashSet<Piece>(pieces);
        return set.size() < pieces.size();
    }

    
}
