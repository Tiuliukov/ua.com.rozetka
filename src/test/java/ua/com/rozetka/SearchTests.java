package ua.com.rozetka;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.naming.directory.SearchResult;

import static com.codeborne.selenide.Selenide.*;


public class SearchTests {
    @BeforeEach
    void openHomePage(){
        open("https://rozetka.com.ua");
    }
    @Test
    void searchProductByTitleAndAddToCart (){
        var productName = "Мобільний телефон Apple iPhone 13 Pro Max 1TB Graphite (MLLK3HU/A)";
        var dataGoodsId = "318463612";
        $("[name='search']").val(productName).pressEnter();
        $(".product__title").shouldHave(Condition.text(productName));
        $(".toOrder [aria-label='Купити']").click();
        $(".modal__content").shouldHave(Condition.text(productName));
        sleep(3000);
    }

    @Test
    void searchProductByTitleTest () {
        var productName = "Мобільний телефон Apple iPhone 13 Pro Max 1TB Graphite (MLLK3HU/A)";
        new HomePage().searchFor(productName);
        var actualSearchResultTitle = new SearchResultPage().getSearchResultTitle();
        Assertions.assertEquals(productName, actualSearchResultTitle );
    }
}