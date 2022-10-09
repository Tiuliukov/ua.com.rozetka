package ua.com.rozetka;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SearchTests {
    @Test
    void searchProductByTitle(){
        open("https://rozetka.com.ua");
        $("[name='search']").val("Мобільний телефон Apple iPhone 13 Pro Max 1TB Graphite");
    }

} 