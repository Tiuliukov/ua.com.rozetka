package ua.com.rozetka;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    @Step
    public void searchFor(String searchQuery) {
        $("[name='search']").val(searchQuery).pressEnter();
    }

    public static class userAccount {
        private By loginPopup = By.cssSelector(".header-actions__item.header-actions__item--user .header__button"),
                registrationPopup = By.cssSelector(".form__row .auth-modal__register-link");

        public void openLoginPopup() {
            $(loginPopup).click();
        }

        public void openRegistrationPopup() {
            $(registrationPopup).click();
        }

    }
}
