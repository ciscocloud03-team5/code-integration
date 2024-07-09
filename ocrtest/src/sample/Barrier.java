package sample;

import javafx.scene.image.ImageView;

/**
 * 
 */
public class Barrier extends Plant{

    int x;
    int y;
    private static int cost = 50;
    //protected ImageView imageView;

    public Barrier(int x, int y, ImageView imageView) {
        this.x = x;
        this.y = y;
        HP = 200;
        this.imageView = imageView;
    }

    public ImageView getImageView(){
        return imageView;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void useAbility() {

    }
}