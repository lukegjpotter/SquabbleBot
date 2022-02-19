package com.lukegjpotter.selenium.squabblebot.operator.dictionary;

import com.lukegjpotter.selenium.squabblebot.operator.model.AttemptResult;
import com.lukegjpotter.selenium.squabblebot.operator.util.Constants;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OsterMillarDictionaryOperatorTest {

    private OsterMillarDictionaryOperator dictionaryOperator;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
    }

    @BeforeEach
    public void init() {
        dictionaryOperator = new OsterMillarDictionaryOperator();
    }

    @AfterEach
    public void tearDown() {
        dictionaryOperator.close();
    }

    @Test
    void applyAttemptResultAndGetNextSuggestion() {
        String expected = "solar";
        AttemptResult attemptResult = new AttemptResult(
                "S", "O", "L", "U", "S",
                Constants.GREEN, Constants.GREEN, Constants.GREEN, Constants.GREY, Constants.YELLOW);
        String actual = dictionaryOperator.applyAttemptResultAndGetNextSuggestion(attemptResult);

        assertEquals(expected, actual, "Expected: '" + expected + "' did not match Actual: '" + actual + "'.");
    }

    @Test
    @Disabled
    void clear() {
    }
}