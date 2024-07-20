package com.tormascomp.game.map.entities;

import com.tormascomp.game.logic.encounters.IEncounterResolver;

public abstract class Weapon extends Item {
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Weapon(int x, int y, IEncounterResolver encounterResolver, int damage ) {
        super(x, y, encounterResolver);
        this.damage = damage;
    }
}
