package com.company;

public class Main {

    public static void main(String[] args) {

        GamePiece rooke = new GamePiece();

        System.out.println("X: " + rooke.getPositionX());
        System.out.println("Y: " + rooke.getPositionY());

        rooke.freeze();
        if (rooke.isFrozen()) {
            System.out.println("The piece is frozen, as it should be.");
        } else {
            System.out.println("Error: The piece is still not frozen.");
        }

        rooke.move(5,7);
        if (rooke.getPositionX() == 0 && rooke.getPositionY() == 0) {
            System.out.println("The piece is frozen, so it cannot move");
        } else {
            System.out.println("Error: The piece should be frozen, but it still moved.");
        }

        rooke.unfreeze();
        if (!rooke.isFrozen()) {
            System.out.println("The piece is not frozen, as it should be.");
        } else {
            System.out.println("Error: The piece is still frozen.");
        }

        rooke.move(5,7);
        if (rooke.getPositionX() == 5 && rooke.getPositionY() == 7) {
            System.out.println("The piece was not frozen, so it moved to " + rooke.getPositionX() + "," + rooke.getPositionY());
        } else {
            System.out.println("Error: The piece should not be frozen, but it did not move.");
        }

        rooke.move();
        System.out.println("The piece randomly moved to " + rooke.getPositionX() + "," + rooke.getPositionY());

    }
}
