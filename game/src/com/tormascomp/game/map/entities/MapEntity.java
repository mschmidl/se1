package com.tormascomp.game.map.entities;

import com.tormascomp.game.logic.encounters.IEncounterResolver;

public abstract class MapEntity {
    protected int x;
    protected int y;

    protected IEncounterResolver encounterResolver;

    public MapEntity(int x, int y, IEncounterResolver encounterResolver) {
        this.x = x;
        this.y = y;
        this.encounterResolver = encounterResolver;
    }

    public abstract String getEncounterMessage();
    public abstract char getMapChar();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public IEncounterResolver getEncounterResolver() {
        return encounterResolver;
    }
}
