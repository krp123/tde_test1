package org.tde.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    public static final String TDE_URL = "tde.url";
    public static final String TDE_LOGIN = "tde.login";
    public static final String TDE_PASSWORD = "tde.password";
    public static final String TDE_COMPANY = "tde.company";
    public static final String DRIVER_PATH = "tde.driverPath";

    private static Properties properties = new Properties();

    public static String getProperty(String name) {
        if (properties.isEmpty()) {
            try (InputStream is = Config.class.getClassLoader()
                    .getResourceAsStream("tde.properties")) {
                properties.load(is);
            } catch (IOException ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
        return properties.getProperty(name);
    }
}
