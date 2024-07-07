package com.tormascomp.game.map;

import com.tormascomp.game.map.entities.MapEntity;

public class Map {
    private MapEntity[][] map = new MapEntity[20][20];

    public boolean isOccupied(int x, int y) {
        return map[x][y] != null;
    }
    public MapEntity getMapEntity(int x, int y) {
        return map[x][y];
    }

    public void setMapEntity(int x, int y, MapEntity mapEntity) {
        map[x][y] = mapEntity;
    }
}
