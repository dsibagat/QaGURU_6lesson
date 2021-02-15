package tests;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexSearch {

    @Test
    void selenideSearchWithYandex() {
        open("https://yandex.ru/");
        $("#text").val("Selenide").pressEnter();
        $("#search-result").shouldHave(text("Selenide: лаконичные и стабильные UI тесты на Java"));
    }
}
