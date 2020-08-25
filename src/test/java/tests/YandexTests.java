package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

class YandexTests {

    @Test
    void selenideSearchInYandex() {
        // Открыть google
        open("https://ya.ru");

        // Ввести Selenide в поиск
        $("#text").setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text("selenide.org"));
    }
}


