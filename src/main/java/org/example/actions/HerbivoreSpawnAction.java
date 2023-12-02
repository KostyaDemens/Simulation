package org.example.actions;

import org.example.entities.Herbivore;
import org.example.map.WorldMap;

public class HerbivoreSpawnAction extends EntitySpawnAction<Herbivore> {

    public HerbivoreSpawnAction(WorldMap map) {
        double spawnRate = 0.01;
        currentEntityAmount = map.getEntitiesByClass(Herbivore.class).size();
        maxEntityAmount = (int) (map.getMapSize() * spawnRate);
        minEntityAmount = maxEntityAmount / 2;
    }

    @Override
    public Herbivore spawnEntity() {
        return new Herbivore();
    }

}
