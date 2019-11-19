package org.tde.tests;

import org.tde.config.Config;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class TestTest extends TestBase {
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", Config.getProperty(Config.DRIVER_PATH));
    }

    @Test
    public void loopScreenOneButtonClick() {
        open(Config.getProperty(Config.TDE_URL));
        getWebDriver().manage().window().fullscreen();
        app.getLoginPage()
                .setCompany(Config.getProperty(Config.TDE_COMPANY))
                .clickNext()
                .setUserName(Config.getProperty(Config.TDE_LOGIN))
                .setPassword(Config.getProperty(Config.TDE_PASSWORD))
                .clickSignIn();
        app.getMainMenu()
                .openAnalytics()
                .openScreenOneReport();
        app.getScreenOneReport().switchFrame();
        app.getScreenOneReport()
                .clickButton();
    }

    @AfterTest
    public void tearDown() {
        close();
    }
}
