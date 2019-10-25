package exceptions;

/**
 * Class which is holding exception responsible for coordinates values which are not in gameboard's range
 * @author Wojciech Krupowies
 * @version 1.0.0
 */
public class OutOfRangeException extends Exception {
    
    public OutOfRangeException(String errorMessage) {
        super(errorMessage);
    }
}
  
