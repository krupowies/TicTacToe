package gr5.wojtek.model;

import gr5.wojtek.view.Content;
import static gr5.wojtek.view.View.COLUMS;
import static gr5.wojtek.view.View.ROWS;


/**
 * Class is holding methods responsible for game logic
 * @author Wojciech Krupowies
 * @version 1.0.0
 */
public class Model {
    /**
     * Bool value to represent if there is a draw. Created to print draw alert.
     */
    private boolean draw;
    /**
     * Contructor which set draw value to false.
     */
    public Model(){
       draw = false;
    }
    /**
     * Getter 
     * @return draw value which is true or false
     */
    public boolean getDraw(){
        return draw;
    }
   
   /**
    * Method is responsible for checking if composition on the gameboard is ending the game with a win.
    * @param player current player for whom the composition is being checked 
    * @param board current board where the game is taking place
    * @return true when there's a winning composition or false if not
    */
   public boolean playerWon(Content player, Content [][] board){
       if(board[0][0] == player && board[1][0] == player && board[2][0] == player || 
          board[0][1] == player && board[1][1] == player && board[2][1] == player ||
          board[0][2] == player && board[1][2] == player && board[2][2] == player || 
          board[0][0] == player && board[0][1] == player && board[0][2] == player ||
          board[1][0] == player && board[1][1] == player && board[1][2] == player || 
          board[2][0] == player && board[2][1] == player && board[2][2] == player ||
          board[0][0] == player && board[1][1] == player && board[2][2] == player || 
          board[0][2] == player && board[1][1] == player && board[2][0] == player){
           
           return true;
       }
       else{
           return false;
       }
   }
   /**
    * Method is responsible for checking if composition on the gameboard is ending the game with a draw
    * @param board current board where the game is taking place
    * @return true when all cells are not taken with cross or nought 
    */
   public boolean isDraw (Content [][] board){
       for (int i = 0; i < ROWS; ++i) {
         for (int j = 0; j < COLUMS; ++j) {
            if(board[i][j] == Content.EMPTY)
                return false;
         }
      }
      draw = true;
      return true;
   }
}
