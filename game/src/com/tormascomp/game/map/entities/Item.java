package com.tormascomp.game.map.entities;

import com.tormascomp.game.logic.encounters.IEncounterResolver;

public abstract class Item extends MapEntity{

    public Item(int x, int y, IEncounterResolver encounterResolver) {
        super(x, y, encounterResolver);
    }
}
