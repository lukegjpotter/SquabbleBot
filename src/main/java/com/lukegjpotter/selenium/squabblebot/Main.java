package com.lukegjpotter.selenium.squabblebot;

import com.lukegjpotter.selenium.squabblebot.operator.dictionary.OsterMillarDictionaryOperator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Main.java
 *
 * @author lukegjpotter
 * <p>
 * The Main class. This controls the start, setup and finish of the Program.
 */
public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        WebDriver squabbleWebDriver = new ChromeDriver();

        OsterMillarDictionaryOperator dictionaryOperator = new OsterMillarDictionaryOperator();


        // End Program
        squabbleWebDriver.close();
        System.exit(0);
    }
}
