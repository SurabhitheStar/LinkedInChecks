package org.surabhi.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties p = new Properties();
    static FileInputStream fis;

    public static void readconfig() throws IOException {
        fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\org\\surabhi\\Globalconfig.properties");
        p.load(fis);
        Settings.url = p.getProperty("ApplicationUrl");
        Settings.BrowserType = p.getProperty("BrowserType");
    }
}
