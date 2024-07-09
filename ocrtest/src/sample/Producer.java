package sample;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;

public class Producer extends Plant {

    private int x;
    private int y;
    private static int cost = 50;
    private ImageView sunImage;
    SequentialTransition transition;
    //protected ImageView imageView;

    public Producer(int x, int y, ImageView imageView) {
        this.x = x;
        this.y = y;
        HP = 100;
        this.imageView = imageView;
    }

    @Override
    public int getCost(){
        return cost;
    }

    @Override
    public void useAbility() {

    }

    public SequentialTransition getTransition(){
        return transition;
    }

    public void setTransition(SequentialTransition transition){
        this.transition = transition;
    }

    public ImageView getImageView(){
        return imageView;
    }

    public void setSunImage(ImageView sunImage){
        this.sunImage = sunImage;
    }


    public ImageView getSunImage(){
        return sunImage;
    }


}