package cucumber.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class Config {

    private static final String RUN_PROPERTIES_PATH = "test.properties";

    public static Properties loadProperties(String RUN_PROPERTIES_PATH) {
        Properties config = new Properties();
        try (InputStream input = new FileInputStream(RUN_PROPERTIES_PATH)) {
            config.load(input);
        } catch (IOException ex) {
            throw new IllegalStateException("Reading from nonexistent file");
        }
        return config;
    }
}