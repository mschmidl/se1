package com.tormascomp.game.map.entities;

public class Trololol extends Enemy{
    public Trololol(int x, int y, int health) {
        super(x,y,health);
    }

    @Override
    public String getEncounterMessage() {
        return "Trololol";
    }
}
