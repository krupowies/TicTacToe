package gr5.wojtek.controller;

/**
 * Class which stands for coordinates of the move 
 * @author Wojciech Krupowies
 * @version 1.0.0
 */
public class Move {
    /**
     * Value of the row on board
     */
    private int row;
    /**
     * Value of the column on board
     */
    private int column;
    
    /**
     * Constructor 
     * @param newRow value of row's coordinate
     * @param newCol value of column's coordinates
     */
    public Move(int newRow, int newCol){
        row = newRow;
        column = newCol;
    }
    /**
     * Getter for row value of the coordinates
     * @return row value
     */
    public int getRow(){
        return row;
    }
    /**
     * Getter for column value of the coordinates
     * @return column value
     */
    public int getCol(){
        return column;
    }
    
    
}
