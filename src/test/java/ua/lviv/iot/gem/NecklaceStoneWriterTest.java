package ua.lviv.iot.gem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.lviv.iot.gem.NecklaceStoneWriter;
import ua.lviv.iot.gem.enums.CleavageLevel;
import ua.lviv.iot.gem.enums.Origin;
import ua.lviv.iot.gem.enums.TransparencyLevel;
import ua.lviv.iot.gem.managers.JewelerManager;
import ua.lviv.iot.gem.models.Gem;
import ua.lviv.iot.gem.models.NecklaceStone;
import ua.lviv.iot.gem.models.SemiPreciousStone;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NecklaceStoneWriterTest {
    private File file = new File("output.csv");
    private NecklaceStoneWriter writer = new NecklaceStoneWriter();
    private List<NecklaceStone> listTest = new ArrayList<NecklaceStone>();
    private JewelerManager managerTest = new JewelerManager();

    @Before
    public void setUp() {
        listTest = new ArrayList<>();

        NecklaceStone obj1 = new NecklaceStone(TransparencyLevel.MIDDLE,
                "Ukraine", 600.0, 0.9, "Burshtun");

        NecklaceStone obj2 = new Gem(TransparencyLevel.HIGH, "USA", 400.0, 0.4,
                "Diamond", CleavageLevel.PERFECT);

        NecklaceStone obj3 = new SemiPreciousStone(TransparencyLevel.ZERO,
                "Japanese", 800.0, 1.2, "Hanngam", Origin.NATURAL);

        listTest.add(obj1);
        listTest.add(obj2);
        listTest.add(obj3);

        managerTest.setNecklaceStoneList(listTest);
    }

    @Test
    public void testWriteToFile() throws IOException {
        System.out.println(listTest);
        writer.writeToFile(listTest, file);
        Assert.assertNotEquals(file.length(), 0);
    }
}