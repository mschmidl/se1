package com.tormascomp.game.logic.encounters;

import com.tormascomp.game.map.entities.Hero;
import com.tormascomp.game.map.entities.MapEntity;

public class NoopResolver implements IEncounterResolver{
    @Override
    public void resolve(MapEntity mapEntity, Hero hero) {

    }
}
