package com.tormascomp.game.map.entities;

public class Goblin extends Enemy{
    public Goblin(int x, int y, int health) {
        super(x, y, health);
    }

    @Override
    public String getEncounterMessage() {
        return "small green man";
    }

    @Override
    public char getMapChar() {
        return 'g';
    }
}
