package ua.lviv.iot.gem.managers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.gem.enums.CleavageLevel;
import ua.lviv.iot.gem.enums.Origin;
import ua.lviv.iot.gem.enums.SortOrder;
import ua.lviv.iot.gem.enums.TransparencyLevel;
import ua.lviv.iot.gem.models.Gem;
import ua.lviv.iot.gem.models.NecklaceStone;
import ua.lviv.iot.gem.models.SemiPreciousStone;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JewelerManagerTest {

    private NecklaceStone hanggam1;
    private Gem hanggam2;
    private SemiPreciousStone hanggam3;
    private JewelerManager jewelerManager;
    private List<NecklaceStone> expectedList;
    private List<NecklaceStone> actualList;

    @Before
    public void setUp() {
        jewelerManager = new JewelerManager();

        hanggam1 = new NecklaceStone();
        hanggam1.setCaratsWeight(0.9);
        hanggam1.setCountry("Ukraine");
        hanggam1.setName("Hanngam");
        hanggam1.setTransparency(TransparencyLevel.MIDDLE);
        hanggam1.setPrice(1000.0);

        hanggam2 = new Gem();
        hanggam2.setName("Hanggam");
        hanggam2.setPrice(800.0);
        hanggam2.setCleavage(CleavageLevel.QUITE_PERFECT);
        hanggam2.setCaratsWeight(0.4);
        hanggam2.setCountry("Ukraine");
        hanggam2.setTransparency(TransparencyLevel.ZERO);

        hanggam3 = new SemiPreciousStone();
        hanggam3.setType(Origin.NATURAL);
        hanggam3.setCaratsWeight(0.6);
        hanggam3.setCountry("Ukraine");
        hanggam3.setPrice(600.0);
        hanggam3.setTransparency(TransparencyLevel.HIGH);
        hanggam3.setName("Hanngam");

        jewelerManager.addStoneToList(hanggam1);
        jewelerManager.addStoneToList(hanggam2);
        jewelerManager.addStoneToList(hanggam3);
    }


    @Test
    public void sortStonesByWeightWhenOrderIsAsdTest() {
      expectedList = Arrays.asList(hanggam2, hanggam3, hanggam1);
        SortOrder asc = SortOrder.ASD;
        actualList = jewelerManager.sortStonesByWeight(asc);
        Assert.assertEquals(expectedList, actualList);

    }

    @Test
    public void sortStonesByWeightWhenOrderIsDesdTest() {
        expectedList = Arrays.asList(hanggam1, hanggam3, hanggam2);
        SortOrder desc = SortOrder.DESC;
        actualList = jewelerManager.sortStonesByWeight(desc);
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    public void setNecklaceStoneListTestWhenOrderIsAsdTest() {
        expectedList = Arrays.asList(hanggam3, hanggam2, hanggam1);
        SortOrder asc = SortOrder.ASD;
        actualList = jewelerManager.sortStonesByPrice(asc);
        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void setNecklaceStoneListTestWhenOrderIsDesdTest() {
        expectedList = Arrays.asList(hanggam1, hanggam2, hanggam3);
        SortOrder desc = SortOrder.DESC;
        actualList = jewelerManager.sortStonesByPrice(desc);
        Assert.assertEquals(expectedList, actualList);
    }
    @Test
    public void findNecklaceStonesByTransparencyTest() {
        Set<NecklaceStone> expectedList = new HashSet(Arrays.asList(hanggam1,  hanggam3));
        int from = TransparencyLevel.MIDDLE.getValue();
        int to = TransparencyLevel.HIGH.getValue();
        Set<NecklaceStone> actualList = new HashSet<>();
        actualList.addAll(jewelerManager.findNecklaceStonesByTransparency(from,to));
        Assert.assertEquals(expectedList,actualList);
    }
    @Test
    public void toStringNecklaceStoneTest() {
        String testString = "NecklaceStoneRepository:\n" +
                "name = Hanngam\n" +
                "transparency = MIDDLE\n" +
                "country = Ukraine\n" +
                "price = 1000.0\n" +
                "weight in carats = 0.9"+ "\n" + "\n\n";
        Assert.assertEquals(hanggam1.toString(),testString);
    }
    @Test
    public void toStringGemTest() {
        String testString = "NecklaceStoneRepository -> Gem:\n" +
                "name = Hanggam\n" +
                "transparency = ZERO\n" +
                "country = Ukraine\n" +
                "price = 800.0\n" +
                "weight in carats = 0.4\n" +
                "cleavage = QUITE_PERFECT\n" +
                "\n";
        Assert.assertEquals(hanggam2.toString(),testString);
    }
    @Test
    public void toStringSemiPreciousStoneTest() {
        String testString = "NecklaceStoneRepository -> SemiPreciousStone:\n" +
                "name = Hanngam\n" +
                "transparency = HIGH\n" +
                "country = Ukraine\n" +
                "price = 600.0\n" +
                "weight in carats = 0.6\n" +
                "type of origin = NATURAL\n\n";
        Assert.assertEquals(hanggam3.toString(),testString);
    }
}