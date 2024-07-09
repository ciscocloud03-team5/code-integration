package sample;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 * 
 */
public class GameMap implements Serializable {

    private int currLvl;
    private ArrayList<ArrayList<Plant>> plantMap;
    private int numRows;
    private int numCols;
    private Random rand;
    private ArrayList<Zombie> zombieWave1 = new ArrayList<Zombie>();
    private ArrayList<Zombie> zombieWave2 = new ArrayList<Zombie>();
    private ArrayList<Zombie> zombieWave3 = new ArrayList<Zombie>();
    private Game game;




    public GameMap(Game game, int currLvl, int numRows, int numCols) {

        plantMap = new ArrayList<ArrayList<Plant>>();
        this.game = game;
        this.currLvl = currLvl;
        for(int x = 0;x<numRows;x++){
            ArrayList<Plant> tempMap = new ArrayList<Plant>();
            for(int y = 0; y<numCols;y++){
                tempMap.add(null);
            }
            plantMap.add(tempMap);
        }

        System.out.println("New Game Map Created");

    }


    public void createMap() {
        // TODO implement here
    }

    public void createLawnmowers() {
        // TODO implement here
    }

    public boolean addPlant(int x, int y, Plant plant) {
        if(plantMap.get(x).get(y)!=null){
            System.out.println("Plant already present");
            return false;
        }
        else{
            plantMap.get(x).set(y, plant);
            return true;
        }

    }




    public ArrayList<ArrayList<Plant>> getMap() {
        // TODO implement here
        return plantMap;
    }


    public ArrayList<Zombie> getZombieWave1() {
        // TODO implement here
        return zombieWave1;
    }

    public ArrayList<Zombie> getZombieWave2() {
        // TODO implement here
        return zombieWave2;

    }

    public ArrayList<Zombie> getZombieWave3() {
        // TODO implement here
        return zombieWave3;
    }


    public void setZombieWave1(ArrayList<Zombie> zombieWave1){
        this.zombieWave1 = zombieWave1;
    }
    public void setZombieWave2(ArrayList<Zombie> zombieWave2){
        this.zombieWave1 = zombieWave2;
    }
    public void setZombieWave3(ArrayList<Zombie> zombieWave3){
        this.zombieWave1 = zombieWave3;
    }
    public void setPlantMap(ArrayList<ArrayList<Plant>> plantMap){
        this.plantMap = plantMap;
    }


//    public void plantAttacked(Plant plant, int damage){
//        try{
//            plant.takeDamage(damage);
//        }
//
//        catch(PlantDeadException e){
//            int x = plant.getXPosition();
//            int y = plant.getYPosition();
//            plantMap.get(x).set(y, null);
//        }
//    }


}