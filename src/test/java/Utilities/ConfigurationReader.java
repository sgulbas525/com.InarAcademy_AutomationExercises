package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties config;

    static {
        try {
            String path = System.getProperty("user.dir") + "/Configuration.properties";
            FileInputStream fis = new FileInputStream(path);
            config = new Properties();
            config.load(fis);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("!!There occurs an error while loading the file!!");
        }
    }

    public static String getProperty(String key) {
        return config.getProperty(key);
    }


}