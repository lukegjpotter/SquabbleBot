package com.lukegjpotter.selenium.squabblebot.operator.dictionary;

import com.lukegjpotter.selenium.squabblebot.operator.model.AttemptResult;
import com.lukegjpotter.selenium.squabblebot.operator.util.Constants;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OsterMillarDictionaryOperatorTest {

    private OsterMillarDictionaryOperator dictionaryOperator;
    private AttemptResult attemptResultSolus, attemptResultBlank;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
    }

    @BeforeEach
    public void init() {
        dictionaryOperator = new OsterMillarDictionaryOperator();
        attemptResultSolus = new AttemptResult(
                "S", "O", "L", "U", "S",
                Constants.GREEN, Constants.GREEN, Constants.GREEN, Constants.GREY, Constants.YELLOW);
        attemptResultBlank = new AttemptResult(
                "", "", "", "", "",
                Constants.YELLOW, Constants.GREY, Constants.YELLOW, Constants.GREEN, Constants.GREEN);
    }

    @AfterEach
    public void tearDown() {
        dictionaryOperator.close();
    }

    @Test
    void applyAttemptResultAndGetNextSuggestion_Solus() {
        String expected = "solar";
        String actual = dictionaryOperator.applyAttemptResultAndGetNextSuggestion(attemptResultSolus);

        assertEquals(expected, actual, "Expected: '" + expected + "' did not match Actual: '" + actual + "'.");
    }

    @Test
    void applyAttemptResultAndGetNextSuggestion_BlankAttemptedResult() {
        String expected = "alert";
        String actual = dictionaryOperator.applyAttemptResultAndGetNextSuggestion(attemptResultBlank);

        assertEquals(expected, actual, "Expected: '" + expected + "' did not match Actual: '" + actual + "'.");
    }

    @Test
    void clear() {
        String expected = "alert";
        dictionaryOperator.applyAttemptResultAndGetNextSuggestion(attemptResultSolus);
        dictionaryOperator.clear();
        String actual = dictionaryOperator.applyAttemptResultAndGetNextSuggestion(attemptResultBlank);

        assertEquals(expected, actual, "Expected: '" + expected + "' did not match Actual: '" + actual + "'.");
    }
}