package ua.lviv.iot.gem;

import ua.lviv.iot.gem.enums.CleavageLevel;
import ua.lviv.iot.gem.enums.Origin;
import ua.lviv.iot.gem.enums.TransparencyLevel;
import ua.lviv.iot.gem.managers.JewelerManager;
import ua.lviv.iot.gem.models.Gem;
import ua.lviv.iot.gem.models.NecklaceStone;
import ua.lviv.iot.gem.models.SemiPreciousStone;

public class Main {
    public static void main(final String[] args) {
        Gem diamond = new Gem(TransparencyLevel.HIGH, "Israel", 5200, 1.2,
                "Diamond",
                CleavageLevel.PERFECT);
        SemiPreciousStone amethyst = new SemiPreciousStone(
                TransparencyLevel.MIDDLE, "Russian", 1200,
                0.9, "Amethyst", Origin.NATURAL);
        NecklaceStone hanggam = new NecklaceStone(TransparencyLevel.ZERO,
                "Ukraine", 200,
                0.7, "Hanggam");
        System.out.println(diamond);
        System.out.println(amethyst);
        System.out.println(hanggam);
        JewelerManager manager1 = new JewelerManager();
        manager1.addStoneToList(diamond);
        manager1.addStoneToList(amethyst);
        manager1.addStoneToList(hanggam);
        System.out.println(manager1.findNecklaceStonesByTransparency(
                TransparencyLevel.MIDDLE.getValue(),
                TransparencyLevel.HIGH.getValue()));
    }
}

