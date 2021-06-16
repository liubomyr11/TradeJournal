package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {
    private static Properties config;
    static {
        try {
            File file = new File("resources/env-v.properties");
            FileInputStream input = new FileInputStream(file);
            config = new Properties();
            config.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key) {
        return config.getProperty(key);
    }
}