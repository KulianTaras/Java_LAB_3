package ua.lviv.iot.stone.managers;

import ua.lviv.iot.stone.enums.SortOrder;
import ua.lviv.iot.stone.models.*;

import java.util.*;
import java.util.stream.Collectors;


public class JewelerManager {

    private List<NecklaceStone> necklaceStoneList = new ArrayList<>();

    public List<NecklaceStone> getNecklaceStoneList() {
        return necklaceStoneList;
    }

    public void setNecklaceStoneList(List<NecklaceStone> necklaceStoneList) {
        this.necklaceStoneList = necklaceStoneList;
    }

    public JewelerManager() {
    }

    public JewelerManager(List<NecklaceStone> necklaceStones) {
        this.necklaceStoneList = necklaceStones;
    }

    public List<NecklaceStone> sortStonesByWeight(SortOrder sortOrder) {
        if (sortOrder == SortOrder.ASD) {
            return necklaceStoneList.stream().sorted(Comparator.comparingDouble(NecklaceStone::getCaratsWeight)).collect(Collectors.toList());

        } else {
            return necklaceStoneList.stream().sorted(Comparator.comparingDouble(NecklaceStone::getCaratsWeight).reversed()).collect(Collectors.toList());
        }
    }

    public List<NecklaceStone> sortStonesByPrice(SortOrder sortOrder) {
        if (sortOrder == SortOrder.ASD) {
            return necklaceStoneList.stream().sorted(Comparator.comparingDouble(NecklaceStone::getPrice)).collect(Collectors.toList());

        } else {
            return necklaceStoneList.stream().sorted(Comparator.comparingDouble(NecklaceStone::getPrice).reversed()).collect(Collectors.toList());
        }
    }


    public List<NecklaceStone> findNecklaceStonesByTransparency(int from, int to) {
        return necklaceStoneList.stream().filter(necklaceStone -> {
            int level = necklaceStone.getTransparency().getValue();
            if ((level >= from) && (level <= to)) {
                return true;
            }
            return false;
        }).collect(Collectors.toList());
    }

    public void addStoneToList(NecklaceStone newStone) {
        necklaceStoneList.add(newStone);
    }

}
