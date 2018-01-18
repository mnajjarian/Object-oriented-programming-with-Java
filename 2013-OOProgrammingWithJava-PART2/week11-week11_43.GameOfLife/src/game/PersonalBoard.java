
package game;


import java.util.Random;
import gameoflife.GameOfLifeBoard;

public class PersonalBoard extends GameOfLifeBoard {
    
    private final calculateNumberOfLivingNeighbours cal;
    private final Random random;
    
    
    public PersonalBoard(int width, int height) {
        super(width, height);
        this.random = new Random();
        this.cal = new calculateNumberOfLivingNeighbours();
     
    }

    @Override
    public void turnToLiving(int x, int y) {
        if(x >= 0 && x < super.getWidth() &&
                y >= 0 && y < super.getHeight()) {
            super.getBoard()[x] [y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if(x >= 0 && x < super.getWidth() &&
                y >= 0 && y < super.getHeight()) {
            super.getBoard() [x] [y] = false;
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if(x >= 0 && x < super.getWidth() &&
                y >= 0 && y < super.getHeight()) {
            if(super.getBoard() [x] [y] = true) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        for (boolean[] board : super.getBoard()) {
            for (int j = 0; j < board.length; j++) {
                double d = random.nextDouble();
                board[j] = d <= probabilityForEachCell && probabilityForEachCell != 0;
            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int i = 0;
        if(x >= 0 && x < super.getWidth() && y >= 0 && y < super.getHeight()) {
            int middles = cal.MiddleArea(x, y, super.getBoard());
            int borders = cal.BordersWithoutCorners(x, y, super.getBoard());
            int corners = cal.Corners(x, y, super.getBoard());
            i = middles + borders + corners;
        }
        return i;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        //if(super.getBoard() [x] [y] = true) {
            if (livingNeighbours < 2) {
                this.turnToDead(x, y);
                //super.getBoard() [x] [y] = false;
            
            
            
        }
    }
}
