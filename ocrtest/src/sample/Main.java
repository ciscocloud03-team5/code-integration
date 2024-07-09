package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main extends Application implements Serializable {

    //private static Map<String, ArrayList<MainGame>> savedGames;
    private String playerName = "Ansul";

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //Initialize non-FXML
        //savedGames = new HashMap<String, ArrayList<MainGame>>();

        //Create Controller.java here

        //Initialize FXML
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.initStyle(StageStyle.UNDECORATED);

//        String loc = "seeds.mp3";
//        Media media = new Media(new File(loc).toURI().toString());
//        MediaPlayer mediaPlayer = new MediaPlayer(media);
//        mediaPlayer.setAutoPlay(true);

//        AudioClip note = new AudioClip(this.getClass().getResource(loc).toString());
//        note.play();

        primaryStage.show();

        //Testing Serialize Deserialize

//        test();
//        try {
//            Map<String, ArrayList<MainGame>> tempGame = deserialize("out.txt", playerName);
//            System.out.println(tempGame.size());
//            System.out.println(tempGame.get(playerName).get(0).getGame1().getNumSunTokens());
//
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
    }


    public static void main(String[] args)
    {
        launch(args);

    }
//    public static Map<String, ArrayList<MainGame>> deserialize(String filename, String playerName) throws IOException, ClassNotFoundException {
//        ObjectInputStream in = null;
//        Map<String, ArrayList<MainGame>> currSavedGames = null;
////        ArrayList<MainGame> reqdList;
//
//        try{
//            in = new ObjectInputStream(new FileInputStream(filename));
//            currSavedGames = (Map<String, ArrayList<MainGame>>)in.readObject();
////            reqdList = currSavedGames.get(playerName);
//        }
//        finally {
//            in.close();
//        }
//        return currSavedGames;
//    }
//
//    public static void serialize(String filename, MainGame mainGame, String playerName) throws IOException {
//
//        ObjectOutputStream out = null;
//        if(savedGames.containsKey(playerName)){
//            savedGames.get(playerName).add(mainGame);
//        }
//        else{
//            ArrayList<MainGame> list = new ArrayList<MainGame>();
//            list.add(mainGame);
//            savedGames.put(playerName, list);
//        }
//
//        try{
//            out = new ObjectOutputStream(new FileOutputStream(filename));
//            out.writeObject(savedGames);
//        }
//        finally {
//            out.close();
//        }
//
//    }


//    //Method to test serialize() and deserialize()
//    public void test(){
//        MainGame mainGame = new MainGame("Ansul");
//
//        mainGame.getGame1().getGameMap().createZombies();
//        try {
//            serialize("out.txt", mainGame, "Ansul");
//        }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//    }
}
