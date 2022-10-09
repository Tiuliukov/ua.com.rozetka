package ua.com.rozetka;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {
    public String getSearchResultTitle() {
        return $(".product__title").getText();
    }
}
