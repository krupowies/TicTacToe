package tictactoe;

import exceptions.OutOfRangeException;
import gr5.wojtek.controller.Controller;
import gr5.wojtek.controller.Move;
import gr5.wojtek.model.Model;
import gr5.wojtek.view.Content;
import gr5.wojtek.view.View;

/**
 * Main class which is holding the game flow.
 * @author Wojciech Krupowies
 * @version 1.0.0
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /**
       * Decleration and initialization of the first player to make a move.
       */
      Content currentPlayer = Content.CROSS;
      View view = new View();
      Model model = new Model();
      /**
       * Displaying the board at the beginning of the game 
       */
      view.printBoard();
      /**
       * Main loop which is going until there's a draw. Might be broken when the winning composition occurs or when player will enter values which are out of range. 
       */
      try{
      while(!model.isDraw(view.getBoard())){          
          Move newPlayerMove = Controller.askForCorrectMove(currentPlayer, view.getBoard());
          view.setCell(newPlayerMove.getRow(), newPlayerMove.getCol(), currentPlayer);
          if(model.playerWon(currentPlayer, view.getBoard())){
            View.winningMessage(currentPlayer);
            break;
        }
        view.printBoard();
        currentPlayer = Controller.changePlayer(currentPlayer); 
      }
      
      }
      catch(OutOfRangeException e){
          System.out.println(e.getMessage());
                  
      } 
      
      /**
       * If gamne is ended with a draw, the appropriate messa ge will appear. 
       */
      if(model.getDraw()){
         View.drawMessage();
      }       
  }
}
