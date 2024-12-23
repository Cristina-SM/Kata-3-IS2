package software.ulpgc.kata3.app;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import software.ulpgc.kata3.architecture.view.BarchartDisplay;
import software.ulpgc.kata3.architecture.model.Barchart;

import javax.swing.*;
import java.awt.*;

public class JFreeBarcharDisplay extends JPanel implements BarchartDisplay {
    public JFreeBarcharDisplay() {
        this.setLayout(new BorderLayout());
    }

    @Override
    public void show(Barchart barchart) {
        removeAll();
        add(new ChartPanel(getAddapt(barchart)));
    }

    private static JFreeChart getAddapt(Barchart barchart) {
        return JFreeBarcharAdapter.addapt(barchart);
    }
}
