package software.ulpgc.kata3.architecture.io;

import software.ulpgc.kata3.app.Title;
import software.ulpgc.kata3.architecture.model.Barchart;

import java.io.File;
import java.util.List;

public class MockBarchartLoader implements BarchartLoader {
    @Override
    public Barchart load() {
        TsvTitleDeserializer deserializer = new TsvTitleDeserializer();
        TsvTitleReader file = new TsvTitleReader(new File("C:\\Users\\Cristina\\IdeaProjects\\Kata2\\title.basics.tsv"), deserializer);
        List<Title> titles = file.read();
        return barchartDefault(titles);
    }

    private Barchart barchartDefault(List<Title> titles) {
        Barchart barchart = new Barchart("Movies per Year", "Years", "Num of movies");
        int year1990to2000 = 0;
        int year2000to2010 = 0;
        int year2010to2020 = 0;
        for (Title title : titles) {
            int year = title.getStartYear();
            if (year >= 1990 && year < 2000) year1990to2000++;
            barchart.put("1990-2000", year1990to2000);
            if (year >= 2000 && year < 2010) year2000to2010++;
            barchart.put("2000-2010", year2000to2010);
            if (year >= 2010 && year < 2020) year2010to2020++;
            barchart.put("2010-2020", year2010to2020);
        }
        return barchart;
    }
}
