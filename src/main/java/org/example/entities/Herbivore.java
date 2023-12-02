package org.example.entities;

import org.example.map.Cell;
import org.example.map.WorldMap;

public class Herbivore extends Creature {

    public Herbivore() {
        setSpeed(2);
        setHitPoints(10);
        setTarget(Grass.class);
        addTargetClass(Grass.class);
    }

    @Override
    public void consume(Cell targetLocation, WorldMap map) {
        map.removeEntity(targetLocation);
    }

    @Override
    public String displayIcon() {
        return "\uD83D\uDC07";
    }
}
