package org.tde.appmanager;

import org.tde.appmanager.reports.ScreenOneReport;

public class PageManager {
    private LoginPage loginPage;
    private MainMenu mainMenu;
    private ScreenOneReport screenOneReport;

    public LoginPage getLoginPage() {
        if (loginPage == null)
            loginPage = new LoginPage();
        return loginPage;
    }

    public MainMenu getMainMenu() {
        if (mainMenu == null)
            mainMenu = new MainMenu();
        return mainMenu;
    }

    public ScreenOneReport getScreenOneReport() {
        if (screenOneReport == null)
            screenOneReport = new ScreenOneReport();
        return screenOneReport;
    }
}
