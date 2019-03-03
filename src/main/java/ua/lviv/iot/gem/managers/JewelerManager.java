package ua.lviv.iot.gem.managers;

import ua.lviv.iot.gem.enums.SortOrder;
import ua.lviv.iot.gem.models.NecklaceStone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JewelerManager {

    private List<NecklaceStone> necklaceStoneList = new ArrayList<>();

    public List<NecklaceStone> getNecklaceStoneList() {
        return necklaceStoneList;
    }

    public void setNecklaceStoneList(final List<NecklaceStone> list) {
        this.necklaceStoneList = list;
    }

    public JewelerManager() {
    }

    public JewelerManager(final List<NecklaceStone> necklaceStones) {
        this.necklaceStoneList = necklaceStones;
    }

    public List<NecklaceStone> sortStonesByWeight(final SortOrder sortOrder) {
        return getNecklaceStones(sortOrder, Comparator.comparingDouble(NecklaceStone::getCaratsWeight));
    }

    public List<NecklaceStone> sortStonesByPrice(final SortOrder sortOrder) {
        return getNecklaceStones(sortOrder, Comparator.comparingDouble(NecklaceStone::getPrice));
    }

    private List<NecklaceStone> getNecklaceStones(final SortOrder sortOrder,
                                                  final Comparator<NecklaceStone> necklaceStoneComparator) {
        List<NecklaceStone> result;
        if (sortOrder == SortOrder.ASD) {
            result = necklaceStoneList.stream()
                    .sorted(necklaceStoneComparator).collect(Collectors.toList());

        } else {
            result =  necklaceStoneList.stream()
                    .sorted(necklaceStoneComparator
                            .reversed()).collect(Collectors.toList());
        }
        return result;
    }


    public List<NecklaceStone> findNecklaceStonesByTransparency(final int from, final int to) {
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
