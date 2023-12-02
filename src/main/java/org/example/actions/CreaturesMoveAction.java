package org.example.actions;

import org.example.entities.Creature;
import org.example.map.Cell;
import org.example.map.WorldMap;

import java.util.ArrayList;
import java.util.Map;

public class CreaturesMoveAction extends Action {
    private int allCreaturesOnMap = 0;
    private final ArrayList<Boolean> pathlessCreaturesFlags = new ArrayList<>();

    @Override
    public void perform(WorldMap map) {
        for (Class<? extends Creature> clazz : Creature.getHeirClasses()) {
            Map<Cell, ? extends Creature> creatureKindOnMap = map.getEntitiesByClass(clazz);
            allCreaturesOnMap += creatureKindOnMap.size();
            for (Map.Entry<Cell, ? extends Creature> e : creatureKindOnMap.entrySet()) {
                boolean isCreatureMoveDone = e.getValue().makeMove(e.getValue(), e.getKey(), map);

                if (!isCreatureMoveDone) {
                    pathlessCreaturesFlags.add(false);
                }
            }
        }
        if (allCreaturesOnMap != pathlessCreaturesFlags.size()) {
            pathlessCreaturesFlags.clear();
        }
    }

    public boolean isAllCreaturesPathless(WorldMap map) {
        return pathlessCreaturesFlags.size() == allCreaturesOnMap && map.isCreaturesTargetsExist();
    }
}
