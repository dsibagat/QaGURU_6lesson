package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearch {
    @Test
    void selenideSearch() {
        open("https://www.google.com/");
        $("[name=q]").val("Selenide").pressEnter();
        $$(".g").shouldHave(size(7)).first().shouldHave(text("Selenide: лаконичные и стабильные UI тесты на Java"));
    }
}
