package ua.com.rozetka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPopupTests extends BaseTest{
    @BeforeEach
    void openHomePage(){
        open("/");
    }
    @Test
    void openLoginPopupTest() {
        new HomePage.userAccount()
                .openLoginPopup();
        new LoginPopup()
                .fillLogin("tmp.test.user.aqa@gmail.com")
                .fillPassword("IvCUZ4qv5")
                .clickOnLogin();
        sleep(5000);
    }
}
