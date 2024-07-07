package com.tormascomp.game.map.entities;

import com.tormascomp.game.logic.encounters.NoopResolver;

public class Exit extends MapEntity {

    public Exit(int x, int y) {
        super(x, y, new NoopResolver());
    }

    @Override
    public String getEncounterMessage() {
        return "You`re a free man now good luck";
    }
}
