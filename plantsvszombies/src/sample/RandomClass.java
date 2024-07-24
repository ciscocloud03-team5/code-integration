package sample;

//Singleton
import java.util.Random;

public class RandomClass {
    private static Random random;
    public static Random getRandom(){
        if(random==null){
            random = new Random();
        }
        return random;
    }
}
