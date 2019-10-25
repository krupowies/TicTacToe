package gr5.wojtek.controller;

import exceptions.OutOfRangeException;
import gr5.wojtek.view.Content;
import gr5.wojtek.view.View;
import java.util.Scanner;

/**
 * Class is holding basic methods which are responsible for game flow.  
 * @author Wojciech Krupowies
 * @version 1.0.0
 */
public class Controller {    
   /**
    * Method is responsible for retrieve correct move coordinates from user
    * @param Player current player which is making the move
    * @param board current board where the game is taking place
    * @return object which represent coordinates
    * @throws OutOfRangeException throw the exception when coordinate value is bigger than 2 or less than 0
    */ 
   public static Move askForCorrectMove(Content Player, Content [][] board)throws OutOfRangeException{
       Scanner move = new Scanner (System.in);
       int row;
       int col;     
       View.askForMove(Player);
       row = move.nextInt();
       col = move.nextInt();
       if(row > 2 || row < 0 || col > 2 || row < 0){
           throw new OutOfRangeException("incorrect values");
       }
       /**
        * Loop which constantly ask for values if the cell is not empty.
        */    
       if(board[row][col] != Content.EMPTY){
           do{View.wrongMove();
              row = move.nextInt();
              col = move.nextInt();
           }while(board[row][col] != Content.EMPTY);
       }
       return new Move(row,col);
    }
   
   /**
    * Simple method which is responsible for changing turn.
    * @param player current player
    * @return the next player who is going to make a move
    */
   public static Content changePlayer(Content player){
       if(player == Content.CROSS)
           return Content.NOUGHT;
       else return Content.CROSS;    
   }
}
