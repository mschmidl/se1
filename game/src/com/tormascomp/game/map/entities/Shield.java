package com.tormascomp.game.map.entities;

import com.tormascomp.game.logic.encounters.IEncounterResolver;

public abstract class Shield extends Armour{
    public Shield(int x, int y, IEncounterResolver encounterResolver) {
        super(x, y, encounterResolver, 3);
    }

    @Override
    public String getEncounterMessage() {
        return "Shield";
    }
}
