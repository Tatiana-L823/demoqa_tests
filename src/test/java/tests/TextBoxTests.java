package tests;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests extends TestBase{

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Masha");
        $("#userEmail").setValue("masha@gmail.com");
        $("#currentAddress").setValue("Some street 1");
        $("#permanentAddress").setValue("Some street 2");
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        $("#submit").click();

        $("#output #name").shouldHave(text("Masha"));
        $("#output #email").shouldHave(text("masha@gmail.com"));
        $("#output #currentAddress").shouldHave(text("Some street 1"));
        $("#output #permanentAddress").shouldHave(text("Some street 2"));
    }
}
