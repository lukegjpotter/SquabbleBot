# Squabble Bot

A bot that will play the Wordle Battle Royale, Squabble.

## Downloads, Build and Run

**1. SquabbleBot Source Code**

Download SquabbleBot with Command Line, or via ZIP File on Github.

    git clone https://github.com/lukegjpotter/SquabbleBot.git

**2. Update the Version of ChromeDriver**

This task will need to be done fairly frequently for best compatibility. So that the `ChromeDriver` versions matches
your Chrome Browser version.

SquabbleBot uses Selenium to operate the website. Selenium needs a WebDriver to operate the Browser. In the case of
Google Chrome, which is the recommended browser for SquabbleBot, the Webdriver needed is `ChromeDriver`.

This can be done automatically on the Command Line with:

    Mac -> ./gradlew chromeDriverOperations
    Win -> gradlew.bat chromeDriverOperations

This will download the `ChromeDriver` to the `build` directory (it'll create it if needed),
e.g. `SquabbleBot/build/chromedriver/mac/chromedriver`. Then set the `chromedriverlocation.properties` file so that
SquabbleBot knows where the driver is on different operating systems.

**3. Build and Run**

Build and Run SquabbleBot by invoking the Gradle Wrapper

    Mac -> ./gradlew run
    Win -> gradlew.bat run

## Misc Tasks

#### Manually update the ChromeDriver

To do this process manually, download the `ChromeDriver` from

    https://chromedriver.chromium.org/downloads

If you are on a version of Google Chrome that you cannot update. Check the version that you require by opening your own
Chrome browser and going to

    chrome://settings/help

Then on Chromium.org choose that version to get the correct Chrome Driver.

Place the driver in the `SquabbleBot/src/main/resources` directory.

#### Change Browser that is used

If you want to use another browser for the WebDriver it will require some surgery. Find Replace all instances of
`new ChromeDriver();` and `System.getProperty("user.dir") + "/src/main/resources/chromedriver");` to use the WebDriver
that you want.  
For example, you can download the Firefox WebDriver, GeckoDriver from here:

    https://github.com/mozilla/geckodriver/releases

And other browsers by expanding the "Browsers" on the Selenium Downloads Page:

    https://www.selenium.dev/downloads/