package com.tormascomp.game.map.entities;

import com.tormascomp.game.logic.encounters.IEncounterResolver;

public abstract class Armour extends Item{
    private int defense;

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Armour(int x, int y, IEncounterResolver encounterResolver, int defense) {
        super(x, y, encounterResolver);
        this.defense = defense;
    }
}
