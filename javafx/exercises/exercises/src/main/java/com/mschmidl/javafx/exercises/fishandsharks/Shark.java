package com.mschmidl.javafx.exercises.fishandsharks;

import javafx.scene.paint.Color;

public class Shark extends Creature {
    private int timeToStarve;

    public Shark(int timeToBreed) {
        super(timeToBreed, Color.RED);
        timeToStarve = 3;
    }

    public Shark(int timeToBreed, int timesToStarve) {
        super(timeToBreed, Color.RED);
        this.timeToStarve = timesToStarve;
    }

    public int getTimeToStarve() {
        return timeToStarve;
    }

    public void setTimeToStarve(int timesToStarve) {
        this.timeToStarve = timesToStarve;
    }
}
