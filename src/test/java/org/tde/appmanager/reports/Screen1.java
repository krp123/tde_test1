package org.tde.appmanager.reports;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Screen1 {
        public void clickButton() {
            $x(".//*[normalize-space(text()) and normalize-space(.)='Основные показатели эффективности']")
                    .shouldBe(Condition.visible)
                    .click();
        }
}
