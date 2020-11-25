package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AlfaBankTests {

    @Test
    void TestAlfaBank(){
        open("https://alfabank.ru/");
        $("a[href='/cards/'").closest("span").parent().sibling(0).find("a").click();
        $(byText("Что такое вклад?")).parent().preceding(0).find("span").click();
        $("html").shouldHave(Condition.text("Федеральный закон от 23.12.2003 N 177-ФЗ"));
    }
}
