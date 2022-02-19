package com.lukegjpotter.selenium.squabblebot.tools;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
    }

    @BeforeEach
    public void init() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) driver.quit();
    }

    @Test
    @Disabled
    public void verifyGitHubTitle() {
        driver.get("https://www.github.com");
        String pageTitle = driver.getTitle();

        assertTrue(pageTitle.contains("GitHub"), "Page Title does not contain GitHub");
    }
}
