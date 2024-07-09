package sample;

import javafx.scene.image.ImageView;

public class Lawnmower extends Character {

    private boolean isUsed;
    ImageView imageView;

    public Lawnmower(ImageView imageView) {
        this.imageView = imageView;
    }

    public void runOver() {
        // TODO implement here
    }

    public ImageView getImageView(){
        return imageView;
    }

}