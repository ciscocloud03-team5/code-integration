package sample;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Pea {
    private int damage = 20;
    private ImageView imageView;
    private ImageView imageView2;
    TranslateTransition peaTrans;


    public Pea(ImageView imageView, ImageView imageView2){
        this.imageView = imageView;
        this.imageView2 = imageView2;
        peaTrans = new TranslateTransition(Duration.seconds(2),imageView);
    }

    public ImageView getImageView(){
        return imageView;
    }
    public ImageView getImageView2(){
        return imageView2;
    }

    public void peaAnimation(ImageView plantImage)
    {
        peaTrans.setFromX((plantImage.getLayoutX()));
        peaTrans.setToX(500);
        peaTrans.setCycleCount(Timeline.INDEFINITE);
        peaTrans.play();
    }

    public TranslateTransition getTranslateTransition(){
        return peaTrans;
    }

    public int getDamage(){
        return damage;
    }
}
