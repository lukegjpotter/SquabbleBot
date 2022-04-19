package com.lukegjpotter.selenium.squabblebot.operator.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ChromeDriverPropertiesFileHandler {

    public static void setChromeDriverSystemProperties() {
        try (InputStream propertiesFileInputStream = new FileInputStream("src/main/resources/chromedriverlocation.properties")) {
            Properties properties = new Properties();
            properties.load(propertiesFileInputStream);
            String chromeDriverLocation = properties.getProperty("webdriver.chrome.driver");
            System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
