//package sample;
//
//import java.io.Serializable;
//import java.util.HashMap;
//import java.util.Map;
//
//public class MainGame implements Serializable {
//    String playerName;
//    private Game game1 = null;
//    private Game game2 = null;
//    private Game game3 = null;
//    private Game game4 = null;
//    private Game game5 = null;
//    private static Map<Game, Integer> unlockedGames;
//
//    MainGame(String name){
//
//        if(game1==null){
//            game1 = new Game( 1);
//        }
//        unlockedGames = new HashMap<Game, Integer>();
//        unlockedGames.put(game1, 1);
//        unlockedGames.put(game2, 0);
//        unlockedGames.put(game3, 0);
//        unlockedGames.put(game4, 0);
//        unlockedGames.put(game5, 0);
//    }
//
//    public void saveGame() {
//        // TODO implement here
//    }
//
//
//    public void loadGame() {
//
//    }
//
//    public Game getGame1() {
//        return game1;
//    }
//
//    public Game getGame2() {
//        return game2;
//    }
//
//    public Game getGame3() {
//        return game3;
//    }
//
//    public Game getGame4() {
//        return game4;
//    }
//
//    public Game getGame5() {
//        return game5;
//    }
//}
