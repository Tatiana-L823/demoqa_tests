package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests extends TestBase{

    @Test
    void fillFormTest() {
        Faker faker = new Faker(new Locale("de-DE"));

/*        String
                userName = "Masha",
                userEmail = "masha@gmail.com",
                currentAddress = "Some street 1",
                permanentAddress = "Some street 2";*/

        String
                userName = faker.name().fullName(),
                userEmail = faker.internet().emailAddress(),
                currentAddress = faker.address().fullAddress(),
                permanentAddress = faker.address().fullAddress();

        open("/text-box");
        $("#userName").setValue(userName);
        $("#userEmail").setValue(userEmail);
        $("#currentAddress").setValue(currentAddress);
        $("#permanentAddress").setValue(permanentAddress);
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        $("#submit").click();

        $("#output #name").shouldHave(text(userName));
        $("#output #email").shouldHave(text(userEmail));
        $("#output #currentAddress").shouldHave(text(currentAddress));
        $("#output #permanentAddress").shouldHave(text(permanentAddress));
    }
}
