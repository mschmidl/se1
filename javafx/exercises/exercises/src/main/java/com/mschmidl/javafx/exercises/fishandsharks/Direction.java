package com.mschmidl.javafx.exercises.fishandsharks;

import java.util.Arrays;

public enum Direction {
    UP(-1, 0),
    DOWN(1, 0),
    LEFT(0, -1),
    RIGHT(0, 1);

    public final int x;
    public final int y;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
