package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class Zombie extends Character {

    private int speed;
    private int waitTime;
    private int damage;
    private ImageView imageView;
    private TranslateTransition zombTrans;


    public Zombie (int HP) {
        this.HP = HP;
        damage = 20;
        imageView = new ImageView("resources_not/zombie_normal.gif");
    }

    public TranslateTransition getZombTrans(){
        return zombTrans;
    }

    public void setTranslateTransition(){
        zombTrans = new TranslateTransition(Duration.seconds(20),imageView);
    }

    public void moveZombie()
    {
        zombTrans.setToX(-800);
        zombTrans.setCycleCount(1);
        zombTrans.play();

    }

    public void useAbility() {
        // TODO implement here
    }

    public int getHP(){
        return HP;
    }


    public ImageView getZombie(){
        return imageView;
    }


    public boolean isPlantPresent() {
        // TODO implement here
        return isPlantPresent();
    }

    public void eatPlant(Plant plant) {
        // TODO implement here
    }

    public boolean isLawnmowerPresent() {
        // TODO implement here
        return isLawnmowerPresent();
    }

    public boolean isLadderPresent() {
        // TODO implement here
        return isLadderPresent();
    }

    public void reduceHP(int damage) {
        HP = HP-damage;
        if(HP<=0){
            throw new ZombieDeadException();
        }
    }

    public int getSpeed() {
        // TODO implement here
        return speed;
    }

    public int getWaitTime() {
        // TODO implement here
        return waitTime;
    }


}