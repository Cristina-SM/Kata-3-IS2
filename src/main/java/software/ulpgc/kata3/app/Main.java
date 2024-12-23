package software.ulpgc.kata3.app;

import software.ulpgc.kata3.architecture.io.MockBarchartLoader;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        MockBarchartLoader loader = new MockBarchartLoader();
        frame.getDisplay().show(loader.load());
        frame.setVisible(true);
    }
}
