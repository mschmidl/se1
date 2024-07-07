package com.tormascomp.game.map.entities;

import com.tormascomp.game.logic.encounters.IEncounterResolver;

public abstract class Sword extends Weapon{
    public Sword(int x, int y, IEncounterResolver encounterResolver) {
        super(x, y, encounterResolver, 4);
    }

    @Override
    public String getEncounterMessage() {
        return "Sword";
    }
}
