package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends ParentPage{
    private final static String urlHomePage = "https://rozetka.com.ua/ukr/";

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage openHomePage(){
        try {
            open(urlHomePage);
        } catch (Exception e) {
            Assert.fail("Can not open Login Page" + e);
        }
        return  this;
    }
}
