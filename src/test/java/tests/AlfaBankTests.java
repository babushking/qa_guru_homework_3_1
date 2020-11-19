package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class AlfaBankTests {

    @Test
    void TestAlfaBank(){
        open("https://alfabank.ru/");
        $("span").sibling(1).closest("а").find("Вклады").click();
    }
}
