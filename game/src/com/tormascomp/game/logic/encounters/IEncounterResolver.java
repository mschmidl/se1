package com.tormascomp.game.logic.encounters;

import com.tormascomp.game.map.entities.Hero;
import com.tormascomp.game.map.entities.MapEntity;

public interface IEncounterResolver {

    void resolve(MapEntity mapEntity, Hero hero);
}
