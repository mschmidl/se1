package com.tormascomp.game.map.entities;

import com.tormascomp.game.logic.encounters.FightResolver;

public abstract class Enemy extends Creature {

    public Enemy(int x, int y, int health) {
        super(x, y, health, new FightResolver());
    }
}
