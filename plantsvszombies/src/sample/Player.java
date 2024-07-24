package sample;

import java.io.Serializable;


public class Player implements Serializable {

    private String name;
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        // TODO implement here
        return name;
    }

}