package com.tormascomp.game.map.entities;

import com.tormascomp.game.logic.encounters.NoopResolver;

public class Hero extends Creature {
    private int experience = 0;

    public Hero(int x, int y, int health) {
        super(x,y, health, new NoopResolver());
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String getEncounterMessage() {
        return "wait wat";
    }

    @Override
    public char getMapChar() {
        return 'x';
    }
}
