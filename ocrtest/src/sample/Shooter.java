package sample;

import javafx.scene.image.ImageView;

public class Shooter extends Plant {

    public int shootInterval;
    private static int cost = 100;
    private int x;
    private int y;
    //protected ImageView imageView;
    private Pea pea;

    public Shooter(int x, int y, ImageView imageView, Pea pea) {
        this.x = x;
        this.y = y;
        HP = 100;
        this.pea = pea;
        this.imageView = imageView;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void useAbility(){

    }

    public Pea getPea(){
        return pea;
    }

    public ImageView getImageView(){
        return imageView;
    }

//    public void shootPea() {
//        Pea pea = new Pea();
//        pea.move();
//    }



}