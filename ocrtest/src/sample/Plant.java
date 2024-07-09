package sample;

import javafx.scene.image.ImageView;

public abstract class Plant extends Character {

    protected int waitTime;
    protected boolean isAvailable;
    protected ImageView imageView;
    protected int HP;


    public Plant () {

    }

    public abstract int getCost();
    public abstract void useAbility();
    public ImageView getImageView(){
        return imageView;
    }

//    public void takeDamage(int damage){
//        //Handle removal from list
//        System.out.println("Damage done was 20");
//        System.out.println(HP);
//        HP = HP-damage;
//        if(HP<=0){
//            System.out.println("Plant Dead");
//           // throw new PlantDeadException();
//        }
//    }

    public void reduceHP(int damage) {
        HP = HP - damage;
    }

    public int getWaitTime() {
        // TODO implement here
        return waitTime;
    }

    public boolean getIsAvailable() {
        // TODO implement here
        return isAvailable;
    }

    public int getHP(){
        return HP;
    }

}