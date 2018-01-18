
package wormgame.domain;

import wormgame.Direction;

public class Piece {
    private final int x;
    private final int y;
    
    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
        
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public boolean runsInto(Piece piece) {
        return this.x == piece.x && this.y == piece.y;
       
    }
    
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    public Piece move(Direction dir) {
        switch (dir) {
            case UP: return new Piece(x, y-1);
            case DOWN: return new Piece(x, y+1);
            case LEFT: return new Piece(x-1, y);
            case RIGHT: return new Piece(x+1, y);
            default:
                throw new IllegalStateException("Unknown state " + dir);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Piece piece = (Piece) o;

        if (x != piece.x) return false;
        return y == piece.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
