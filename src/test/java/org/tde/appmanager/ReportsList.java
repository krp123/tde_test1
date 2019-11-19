package org.tde.appmanager;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class ReportsList {
    public void openScreen1() {
        $("li[data-reportid='47c570f7-d8ad-4963-bebf-dddad0286761']")
                .shouldBe(Condition.visible)
                .click();
    }
}
