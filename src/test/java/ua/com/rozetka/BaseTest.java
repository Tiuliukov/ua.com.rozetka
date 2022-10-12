package ua.com.rozetka;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
//import com.codeborne.selenide.WebDriverRunner;

public abstract class BaseTest {
    static {
        Configuration.baseUrl = "https://rozetka.com.ua";
        //Configuration.browser = WebDriverRunner.CHROME;
        Configuration.browser = "chrome";
        Configuration.assertionMode = AssertionMode.STRICT;
        Configuration.savePageSource = false;
        Configuration.screenshots = false;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }
}
