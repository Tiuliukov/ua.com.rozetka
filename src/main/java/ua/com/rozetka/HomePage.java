package ua.com.rozetka;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public void searchFor(String searchQuery) {
        $("[name='search']").val(searchQuery).pressEnter();
    }
}
