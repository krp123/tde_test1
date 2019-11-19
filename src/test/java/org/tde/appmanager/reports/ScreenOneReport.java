package org.tde.appmanager.reports;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ScreenOneReport {
    public ScreenOneReport switchFrame() {
        SelenideElement frame = $("div#contentPlaceHolder > iframe");
        switchTo()
                .frame(frame);
        return this;
    }

    public void clickButton() {
        while (true) {
            ElementsCollection buttons = $$("button.themableBackgroundColor");
            for (SelenideElement button : buttons) {
                ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].click()", button);
                Selenide.sleep(5000);
            }
        }
    }
}

