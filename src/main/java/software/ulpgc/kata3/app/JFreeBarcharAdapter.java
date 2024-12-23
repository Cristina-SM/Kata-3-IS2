package software.ulpgc.kata3.app;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import software.ulpgc.kata3.architecture.model.Barchart;

public class JFreeBarcharAdapter {
    public static JFreeChart addapt(Barchart barchart){
        return ChartFactory.createBarChart(
                barchart.getTitle(),
                barchart.getxAxis(),
                barchart.getyAxis(),
                datasetOf(barchart)
        );
    }

    private static CategoryDataset datasetOf(Barchart barchart) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String category: barchart.getDataCount().keySet()){
            dataset.addValue(barchart.getDataCount().get(category),category, barchart.getTitle());
        }
        return dataset;
    }
}
