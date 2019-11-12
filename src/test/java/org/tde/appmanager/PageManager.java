package org.tde.appmanager;

public class PageManager {
    private LoginPage loginPage;
    private HomePage homePage;


    public LoginPage getLoginPage() {
        if (loginPage == null)
            loginPage = new LoginPage();
        return loginPage;
    }

    public HomePage getHomePage() {
        if (homePage == null)
            homePage = new HomePage();
        return homePage;
    }
}
