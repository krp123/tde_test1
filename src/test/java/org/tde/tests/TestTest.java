package org.tde.tests;

import org.openqa.selenium.WebDriver;
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
    public void test() {
        open(url);
        app.getLoginPage()
                .setCompany(companyName)
                .clickNext()
                .setUserName(username)
                .setPassword(password)
                .clickSignIn();
        app.getHomePage()
                .openAnalytics();
    }


    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
