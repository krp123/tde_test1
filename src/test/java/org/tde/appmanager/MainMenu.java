package org.tde.appmanager;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainMenu {
    public MainMenu openAnalytics() {
        $("a[href='/rusgazburenie/PronovaAnalyticsReport']")
                .shouldBe(visible)
                .click();
        Selenide.sleep(5000);
        return this;
    }

    public MainMenu openBalanceReport() {
        $("li[data-reportid='dd318b1b-4dd8-49ac-ad18-1d71bd32c4ca']")
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    public MainMenu openScreenOneReport() {
        $("li[data-reportid='47c570f7-d8ad-4963-bebf-dddad0286761']")
                .shouldBe(visible)
                .click();
        Selenide.sleep(15000);
        return this;
    }
}
