package software.ulpgc.kata3.architecture.io;

import software.ulpgc.kata3.app.Title;

public interface TitleDeserializer {
    Title deserializer(String line);
}
