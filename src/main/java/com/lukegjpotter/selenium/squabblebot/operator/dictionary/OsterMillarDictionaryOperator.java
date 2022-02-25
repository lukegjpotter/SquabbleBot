package com.lukegjpotter.selenium.squabblebot.operator.dictionary;

import com.lukegjpotter.selenium.squabblebot.operator.model.AttemptResult;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.Closeable;

/**
 * OsterMillarDictionaryOperator.java
 *
 * @author lukegjpotter
 * <p>
 * The OsterMillar Website has a Worlde Calculator. This class operates that website. It places letters in the green,
 * yellow and grey boxes at the top. It then reads the suggested words and sends them back to the calling class.
 */
public class OsterMillarDictionaryOperator implements Closeable {

    private final WebDriver dictionaryWebDriver;

    public OsterMillarDictionaryOperator() {
        dictionaryWebDriver = new ChromeDriver();
        dictionaryWebDriver.get("https://ostermiller.org/calc/wordle-helper.html");
    }

    public String applyAttemptResultAndGetNextSuggestion(AttemptResult attemptResult) {
        // Apply Attempted Result
        WebElement position1Element = null;
        switch (attemptResult.getPosition1Colour()) {
            case "Grey":
                position1Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREY_BOX));
                break;
            case "Yellow":
                position1Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.YELLOW_POS_1));
                break;
            case "Green":
                position1Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREEN_POS_1));
                break;
            default:
                break;
        }
        if (position1Element != null) position1Element.sendKeys(attemptResult.getPosition1Letter());
        // todo Add Logger and Else Log and Error that element was not found.

        WebElement position2Element = null;
        switch (attemptResult.getPosition2Colour()) {
            case "Grey":
                position2Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREY_BOX));
                break;
            case "Yellow":
                position2Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.YELLOW_POS_2));
                break;
            case "Green":
                position2Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREEN_POS_2));
                break;
            default:
                break;
        }
        if (position2Element != null) position2Element.sendKeys(attemptResult.getPosition2Letter());
        // Else Log and Error that it was not found.

        WebElement position3Element = null;
        switch (attemptResult.getPosition3Colour()) {
            case "Grey":
                position3Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREY_BOX));
                break;
            case "Yellow":
                position3Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.YELLOW_POS_3));
                break;
            case "Green":
                position3Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREEN_POS_3));
                break;
            default:
                break;
        }
        if (position3Element != null) position3Element.sendKeys(attemptResult.getPosition3Letter());
        // Else Log and Error that it was not found.

        WebElement position4Element = null;
        switch (attemptResult.getPosition4Colour()) {
            case "Grey":
                position4Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREY_BOX));
                break;
            case "Yellow":
                position4Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.YELLOW_POS_4));
                break;
            case "Green":
                position4Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREEN_POS_4));
                break;
            default:
                break;
        }
        if (position4Element != null) position4Element.sendKeys(attemptResult.getPosition4Letter());
        // Else Log and Error that it was not found.

        WebElement position5Element = null;
        switch (attemptResult.getPosition5Colour()) {
            case "Grey":
                position5Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREY_BOX));
                break;
            case "Yellow":
                position5Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.YELLOW_POS_5));
                break;
            case "Green":
                position5Element = dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.GREEN_POS_5));
                break;
            default:
                break;
        }
        if (position5Element != null) position5Element.sendKeys(attemptResult.getPosition5Letter());
        // Else Log and Error that it was not found.

        // Get next suggestion.
        return dictionaryWebDriver.findElement(By.xpath(OsterMillarDictionaryUtils.SUGGESTED_WORD_1)).getText().substring(0, 5).trim();
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

    @Override
    public void close() {
        dictionaryWebDriver.close();
        dictionaryWebDriver.quit();
    }
}
