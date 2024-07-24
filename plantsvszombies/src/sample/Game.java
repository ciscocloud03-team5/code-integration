package sample;


import sample.lawn.lawnController;

import java.io.Serializable;

public class Game implements Serializable {

    private GameMap gameMap;
    private int numSunTokens;
    private int currLvl;
    private int timeElapsed;
    lawnController lawnControllerObj;
   // private Timer timer;

    //For game Map
    int numRows = 5;
    int numCols = 9;

    public Game(lawnController lawnControllerObj, int currLvl) {

        this.currLvl = currLvl;
        this.lawnControllerObj = lawnControllerObj;
        numSunTokens = 50;
        gameMap = new GameMap(this, currLvl, numRows, numCols);
        System.out.println("New Game Created");

    }

    //Implement wait time
    public lawnController getLawnControllerObj(){
        return lawnControllerObj;
    }
    public void addPlant(int x, int y, Plant plant) {
        boolean isPlantAdded = gameMap.addPlant(x, y, plant);
        if(isPlantAdded==false){
            System.out.println("Plant couldnt be added");
        }
        else{
            numSunTokens = numSunTokens - plant.getCost();
        }

    }



    public void produceSunTokens() {
        numSunTokens = numSunTokens + 50;
    }

//
//    public void releaseZombies() {
//        // TODO implement here
//    }

    //Remove zombie from list when dies, trigger second wave when list of previous becomes empty

//    public void releaseZombies(){
//        gameMap.releaseZombieWave1();
//    }



    public void startGame() {
        // TODO implement here
    }

    public GameMap getGameMap() {
        // TODO implement here
        return gameMap;
    }

    public int getNumSunTokens() {
        // TODO implement here
        return numSunTokens;
    }

    public int getCurrLvl() {
        // TODO implement here
        return currLvl;
    }

    public int getTimeElapsed() {
        // TODO implement here
        return timeElapsed;
    }



}