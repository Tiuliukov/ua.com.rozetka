package ua.com.rozetka;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    @Step
    public void searchFor(String searchQuery) {
        $("[name='search']").val(searchQuery).pressEnter();
    }
}
