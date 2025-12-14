package com.pantxi.personnage;

public class Personnage {

    private Orientation orientation = Orientation.NORD;

    public Orientation tourner(int tours) {
        Orientation[] direction = Orientation.values();
        int indexActuel = this.orientation.ordinal();

        int nouvelIndex = (indexActuel + tours) % direction.length;

        this.orientation = direction[nouvelIndex];
        return this.orientation;
    }
}