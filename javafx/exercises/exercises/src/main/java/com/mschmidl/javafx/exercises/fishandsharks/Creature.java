package com.mschmidl.javafx.exercises.fishandsharks;

import javafx.scene.paint.Color;

public abstract class Creature {
    private int timeToBreed;
    private Color color;

    public Creature(int timeToBreed, Color color) {
        this.timeToBreed = timeToBreed;
        this.color = color;
    }

    public int getTimeToBreed() {
        return timeToBreed;
    }

    public void setTimeToBreed(int timeToBreed) {
        this.timeToBreed = timeToBreed;
    }

    public Color getColor() {
        return color;
    }
}
