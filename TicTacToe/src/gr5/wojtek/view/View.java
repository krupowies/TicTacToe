package gr5.wojtek.view;
/**
 * Class which is responsible for game display 
 * @author Wojciech Krupowies
 * @version 1.0.0
 */
public class View {
    /**
     * Constant values for number of rows and columns
     */
    public static final int ROWS = 3, COLUMS = 3;
    /**
     * Two dimensional array to represent the game board.
     */
    private Content [][] board;
    /**
     * Constuctor which is setting all cells to EMPTY to start the game 
     */
    public View(){
        board = new Content[ROWS][COLUMS];
        for (int i = 0; i < ROWS; ++i) {
         for (int j = 0; j < COLUMS; ++j) {
            board[i][j] = Content.EMPTY; 
         }
      }
    }
    /**
     * Getter for the whole board
     * @return Returns the game board 
     */
    public Content[][] getBoard(){
        return board;
    }
    /**
     * Setter
     * @param newBoard 
     */
    public void setBoard(Content[][] newBoard){
        board = newBoard;
    }
    /**
     * Getter for cell on the board
     * @param row value of row's coordinate
     * @param col value of column's coordinate
     * @return The filling of the cell
     */
    public Content getCell(int row, int col){
        return board[row][col];
    }
    /**
     * Setter for cell on the board
     * @param row value of row's coordinate
     * @param col value of column's coordinate
     * @param playerMove filling of the cell
     */
    public void setCell(int row, int col, Content playerMove){
        board[row][col] = playerMove;
    } 
    /**
     * Method which is displaying the board : cells and the seperators. 
     */    
    public void printBoard(){
      for (int i = 0; i < ROWS; ++i) {
         for (int j = 0; j < COLUMS; ++j) {
            printCell(getCell(i,j));
            if (j != COLUMS - 1) {
               System.out.print("|");  
            }
         }
         System.out.println();
         if (i != ROWS - 1) {
            System.out.println("-----------"); 
         }
      }
      System.out.println();
   }
    /**
     * Method which displays single cell.
     * @param toPrint Decides which content is goint to be printed.
     */
    public static void printCell(Content toPrint){
        if(toPrint.equals(Content.NOUGHT)){
            System.out.print(" O ");
        }
         if(toPrint.equals(Content.CROSS)){
            System.out.print(" X ");
        }
          if(toPrint.equals(Content.EMPTY)){
            System.out.print("   ");
        }
         
    }
   /**
    * Method which communicates with user. This one is asking to eneter coordinates.
    * @param Player Decides to whom approach the message.
    */
    public static void askForMove (Content Player){
        System.out.println(Player + " : choose row from 0 to 2 and column from 0 to 2");
    }
    /**
     * Method which communicates with user. This one is alerting about incorrect coordinates.
     */
    public static void wrongMove(){
        System.out.println("These coordinates are already used, please enter other values.");
    }
    /**
     * Method which communicates with user. This one is alerting about winning composition on the board.
     * @param player Decides to whom approach the message.
     */
    public static void winningMessage(Content player)
    {
        System.out.println("Player " +  player + " has won !");
    }
    /**
     * Method which communicates with user. This one is alerting about draw composition on the board.
     */
    public static void drawMessage(){
        System.out.println("It's a draw !");
    }
}
