package com.lukegjpotter.selenium.squabblebot.operator.dictionary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * OsterMillarDictionaryOperator.java
 *
 * @author lukegjpotter
 * <p>
 * The OsterMillar Website has a Worlde Calculator. This class operates that website. It places letters in the green,
 * yellow and grey boxes at the top. It then reads the suggested words and sends them back to the calling class.
 */
public class OsterMillarDictionaryOperator {

    private WebDriver dictionaryWebDriver;

    public OsterMillarDictionaryOperator() {
        dictionaryWebDriver = new ChromeDriver();
        dictionaryWebDriver.get("https://ostermiller.org/calc/wordle-helper.html");
    }

    public void clear() {
        // Green Guesses
        dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREEN_POS_1)).clear();
        dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREEN_POS_2)).clear();
        dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREEN_POS_3)).clear();
        dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREEN_POS_4)).clear();
        dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREEN_POS_5)).clear();

        // Yellow Guesses
        dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.YELLOW_POS_1)).clear();
        dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.YELLOW_POS_2)).clear();
        dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.YELLOW_POS_3)).clear();
        dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.YELLOW_POS_4)).clear();
        dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.YELLOW_POS_5)).clear();

        // Grey Guesses
        dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREY_BOX)).clear();
    }
}
