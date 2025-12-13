package com.pantxi.personnage;

public class Personnage {
    private Orientation orientation = Orientation.NORD;

    public Orientation tourner(int fois) {
        if (fois == 1) {
            this.orientation = Orientation.EST;
        }

        return this.orientation;
    }
}