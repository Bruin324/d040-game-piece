package com.company;

import java.util.*;

/**
 * Created by macuser on 7/18/17.
 */
public class GamePiece {

    int positionX;
    int positionY;
    int minX;
    int maxX;
    int minY;
    int maxY;
    boolean isFrozen;
    String name;
    String color;
    String type;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.minX = 0;
        this.maxX = 100;
        this.minY = 0;
        this.maxY = 300;
        this.isFrozen = false;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getMinX() {
        return minX;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void randomMove() {
        if (this.isFrozen) {
            System.out.println("You can't move, you're frozen");
        } else {
            Random random = new Random();
            int randomX = random.nextInt(this.maxX / 2);
            int randomY = random.nextInt(this.maxY / 2);
            move(randomX, randomY);
        }
    }

    public void move(int x, int y) {
        if (this.isFrozen) {
            System.out.println("You can't move, you're frozen");
        } else if (this.positionX + x > this.maxX) {
            throw new AssertionError("You tried to move " + x + " spaces from " + this.positionX + " and fell off the X axis.");
        } else if (this.positionY + y > this.maxY) {
            throw new AssertionError("You tried to move " + y + " spaces from " + this.positionY + " and fell off the Y axis.");
        } else {
            this.positionX += x;
            this.positionY += y;
        }
    }

    public void freeze() {
        this.isFrozen = true;
    }

    public void unfreeze() {
        this.isFrozen = false;
    }


}
