package com.pantxi.personnage;

public class Personnage {

    private Orientation orientation = Orientation.NORD;

    public Orientation tourner(int tours) {
        Orientation[] direct = Orientation.values();
        int indexActuel = this.orientation.ordinal();

        int nouvelIndex = (indexActuel + tours) % direct.length;

        this.orientation = direct[nouvelIndex];
        return this.orientation;
    }
}