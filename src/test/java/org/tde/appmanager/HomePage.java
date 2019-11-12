package org.tde.appmanager;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class HomePage {

    public void openAnalytics() {
        $("a[href='/rusgazburenie/PronovaAnalyticsReport']")
                .shouldBe(visible)
                .click();
    }
}
