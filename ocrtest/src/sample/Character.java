package sample;

import java.io.Serializable;

/**
 *
 */
public abstract class Character implements Serializable {

    protected int HP;
    protected int attack;
    protected int x_pos;
    protected int y_pos;
    protected int level;

    public Character () {
    }

    public int getXPosition() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getYPosition() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getHP() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getLevel() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getAttack() {
        // TODO implement here
        return 0;
    }

}