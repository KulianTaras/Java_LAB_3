package ua.lviv.iot.gem.managers;

import ua.lviv.iot.gem.enums.SortOrder;
import ua.lviv.iot.gem.models.NecklaceStone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class JewelerManager {

    private List<NecklaceStone> necklaceStoneList = new ArrayList<>();

    public JewelerManager() {
    }

    public JewelerManager(final List<NecklaceStone> necklaceStones) {
        this.necklaceStoneList = necklaceStones;
    }

    public List<NecklaceStone> getNecklaceStoneList() {
        return necklaceStoneList;
    }

    public void setNecklaceStoneList(final List<NecklaceStone> necklaceStones) {
        this.necklaceStoneList = necklaceStones;
    }

    public List<NecklaceStone> sortStonesByWeight(final SortOrder sortOrder) {
        if (sortOrder == SortOrder.ASD) {
            return necklaceStoneList.stream().sorted(Comparator.
                    comparingDouble(NecklaceStone::getCaratsWeight))
                    .collect(Collectors.toList());

        } else {
            return necklaceStoneList.stream().sorted(Comparator.
                    comparingDouble(NecklaceStone::getCaratsWeight)
                    .reversed()).collect(Collectors.toList());
        }
    }

    public List<NecklaceStone> sortStonesByPrice(final SortOrder sortOrder) {
        if (sortOrder == SortOrder.ASD) {
            return necklaceStoneList.stream().sorted(Comparator.
                    comparingDouble(NecklaceStone::getPrice))
                    .collect(Collectors.toList());

        } else {
            return necklaceStoneList.stream().sorted(Comparator.
                    comparingDouble(NecklaceStone::getPrice)
                    .reversed()).collect(Collectors.toList());
        }
    }


    public List<NecklaceStone> findNecklaceStonesByTransparency(
            final int from, final int to) {
        return necklaceStoneList.stream().filter(necklaceStone -> {
            int level = necklaceStone.getTransparency().getValue();
            if ((level >= from) && (level <= to)) {
                return true;
            }
            return false;
        }).collect(Collectors.toList());
    }

    public void addStoneToList(final NecklaceStone newStone) {
        necklaceStoneList.add(newStone);
    }

}
