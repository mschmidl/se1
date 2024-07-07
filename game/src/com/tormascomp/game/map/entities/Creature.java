package com.tormascomp.game.map.entities;

import com.tormascomp.game.logic.encounters.IEncounterResolver;

public abstract class Creature extends MapEntity {
    private int health;
    private int speed;

    public Creature(int x, int y, int health, IEncounterResolver encounterResolver) {
        super(x, y, encounterResolver);
        setHealth(health);
    }


    public boolean isDead() {
        return health < 1;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isGay() {
        return true;
    }
}
