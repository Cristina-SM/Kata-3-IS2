package software.ulpgc.kata3.architecture.model;

import java.util.HashMap;
import java.util.Map;

public class Barchart {
    private final String title;
    private final String xAxis;
    private final String yAxis;
    private final Map<String, Integer> dataCount;

    public Barchart(String title, String yAxis, String xAxis) {
        this.title = title;
        this.yAxis = yAxis;
        this.xAxis = xAxis;
        this.dataCount = new HashMap<>();
    }

    public String getTitle() {
        return title;
    }

    public String getxAxis() {
        return xAxis;
    }

    public String getyAxis() {
        return yAxis;
    }

    public Map<String, Integer> getDataCount() {
        return dataCount;
    }

    public void put(String category, int years) {
        dataCount.put(category, years);
    }
}
