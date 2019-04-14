package ua.lviv.iot.gem;

import ua.lviv.iot.gem.models.NecklaceStone;

import java.io.*;
import java.util.List;

public class NecklaceStoneWriter {
    public NecklaceStoneWriter() {
    }

    public final void writeToFile(final List<NecklaceStone> list,
                                  final File file) throws IOException {
        int i;
        try (FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
             BufferedWriter bufWriter = new BufferedWriter(osw);) {

            for (i = 0; i < list.size(); i++) {
                bufWriter.write(list.get(i).getHeaders());
                bufWriter.newLine();
                bufWriter.write(list.get(i).toCSV());
                if (i < list.size() - 1) {
                    bufWriter.newLine();
                }
            }
        }

    }
}
