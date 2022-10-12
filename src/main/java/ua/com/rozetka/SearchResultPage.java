package ua.com.rozetka;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {
    @Step
    public String getSearchResultTitle() {
        return $(".product__title").getText();
    }
}
