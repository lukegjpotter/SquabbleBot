package com.lukegjpotter.selenium.squabblebot;

import com.lukegjpotter.selenium.squabblebot.operator.dictionary.OsterMillarDictionaryOperator;
import com.lukegjpotter.selenium.squabblebot.operator.util.ChromeDriverPropertiesFileHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main.java
 *
 * @author lukegjpotter
 * <p>
 * The Main class. This controls the start, setup and finish of the Program.
 */
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("SquabbleBot Starting");
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/build/chromedriver/mac/chromedriver");
        ChromeDriverPropertiesFileHandler.setChromeDriverSystemProperties();
        WebDriver squabbleWebDriver = new ChromeDriver();

        OsterMillarDictionaryOperator dictionaryOperator = new OsterMillarDictionaryOperator();

        // End Program
        squabbleWebDriver.close();
        log.info("SquabbleBot Ending");
        System.exit(0);
    }
}
