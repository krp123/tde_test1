package org.tde.appmanager.reports;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ScreenOneReport {
    public void clickButton() {
//        SelenideElement button = $(By.xpath("//*[contains(text(), 'Проходка')]"));
//        SelenideElement button = $(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проходка'])[1]/following::button[1]"));

//        SelenideElement button = $(By.xpath("//*[@id=\"pvExplorationHost\"]/div/div/exploration/div/explore-canvas-modern/div/div[2]/div/div[2]/div[2]/visual-container-repeat/visual-container-modern[6]/transform/div/div[3]/visual-modern/div/button"));
//        ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].click()", button);
        SelenideElement button = $("span.button-text");
        button.click();

    }

    public void loopButtonClicks() {
        while (true) {
            SelenideElement button1 = $(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Основные показатели эффективности'])[1]/following::button[1]"));
            SelenideElement button2 = $(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проходка'])[1]/following::button[1]"));
            SelenideElement button3 = $(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Скважин'])[1]/following::button[1]"));
            SelenideElement button4 = $(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Коммерческая скорость'])[1]/following::button[1]"));
            SelenideElement button5 = $(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='НПВ'])[1]/following::button[1]"));
            ElementsCollection buttons = null;
            buttons.add(button1);
            buttons.add(button2);
            buttons.add(button3);
            buttons.add(button4);
            buttons.add(button5);
            for (SelenideElement button : buttons) {
                button.shouldBe(visible).click();
            }
        }
    }
}

