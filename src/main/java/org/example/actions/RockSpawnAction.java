package org.example.actions;

import org.example.entities.Rock;
import org.example.map.WorldMap;

public class RockSpawnAction extends EntitySpawnAction<Rock> {

    public RockSpawnAction(WorldMap map) {
        double spawnRate = 0.08;
        currentEntityAmount = map.getEntitiesByClass(Rock.class).size();
        maxEntityAmount = (int) (map.getMapSize() * spawnRate);
        minEntityAmount = maxEntityAmount / 4;

    }

    @Override
    public Rock spawnEntity() {
        return new Rock();
    }
}
