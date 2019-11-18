package org.tde.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestTest extends TestBase {

    ChromeDriver driver;
    String url = "https://ru-portal.tde.at/rusgazburenie/React#/rigoverview";
    String companyName = "tde";
    String username = "tde\\lushenko_d";
    String password = "Ghjcnjqgfhjkm123";

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/user/work/aqa/tde_test/src/test/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void loopScreenOneButtonClick() {
        open(url);
        app.getLoginPage()
                .setCompany(companyName)
                .clickNext()
                .setUserName(username)
                .setPassword(password)
                .clickSignIn();
        app.getMainMenu()
                .openAnalytics()
                .openScreenOneReport();
        Selenide.sleep(15000);
        SelenideElement frame = $("div#contentPlaceHolder > iframe");
        driver.switchTo()
                .frame(frame);
        app.getScreenOneReport()
                .clickButton();

    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
