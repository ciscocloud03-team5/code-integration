package sample;

/**
 * 
 */
public class GameWinException extends RuntimeException {

    public GameWinException() {
        System.out.println("Game Won");
    }

}