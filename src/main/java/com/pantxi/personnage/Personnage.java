package com.pantxi.personnage;

public class Personnage {

    private Orientation orientation = Orientation.NORD;

    public Orientation tourner(int tours) {
        Orientation[] directions = Orientation.values();
        int indexActuel = this.orientation.ordinal();

        int nouvelIndex = (indexActuel + tours) % directions.length;

        this.orientation = directions[nouvelIndex];
        return this.orientation;
    }
}