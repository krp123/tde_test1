package org.tde.appmanager;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public LoginPage setCompany(String company) {
        $("input#emailInput")
                .shouldBe(visible)
                .setValue(company);
        return this;
    }

    public LoginPage clickNext() {
        $("input.submit")
                .shouldBe(visible)
                .click();
        return this;
    }

    public LoginPage clickSignIn() {
        $("span.submit")
                .shouldBe(visible)
                .click();
        return this;
    }

    public LoginPage setUserName(String userName) {
        $("input#userNameInput")
                .shouldBe(visible)
                .setValue(userName);
        return this;
    }

    public LoginPage setPassword(String password) {
        $("input#passwordInput")
                .shouldBe(visible)
                .setValue(password);
        return this;
    }
}
