package sample;

import javafx.scene.image.ImageView;

public class Bomb2 extends Plant{

    private int x;
    private int y;
    private static int cost = 25;
    //protected ImageView imageView;

    public Bomb2(int x, int y, ImageView imageView) {
        this.x = x;
        this.y = y;
        HP = 50;
        this.imageView = imageView;
    }

    public ImageView getImageView(){
        return imageView;
    }

    public void selfDestruct() {
        try{
            throw new PlantDeadException();
        }
        catch(PlantDeadException e){
            System.out.println("Plant exploded");
        }
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void useAbility() {
        selfDestruct();
    }
}