package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTests extends TestBase {

    @Test
    void successfulRegistrationTest() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("document.querySelectorAll('iframe').forEach(e => e.remove());");

        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Egorov");
        $("#userEmail").setValue("alex@egorov.com");
        executeJavaScript("document.querySelectorAll('iframe').forEach(e => e.remove());");
        $("#genterWrapper").$(byText("Other")).click();
        $("#userNumber").setValue("1234567890");
        executeJavaScript("document.querySelectorAll('iframe').forEach(e => e.remove());");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("2008");
        executeJavaScript("document.querySelectorAll('iframe').forEach(e => e.remove());");
        $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("Math").pressEnter();
        executeJavaScript("document.querySelectorAll('iframe').forEach(e => e.remove());");
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#currentAddress").setValue("Some address 1");
        executeJavaScript("document.querySelectorAll('iframe').forEach(e => e.remove());");
        $("#state").click();
        executeJavaScript("document.querySelectorAll('iframe').forEach(e => e.remove());");
        $("#stateCity-wrapper").$(byText("NCR")).click();
        executeJavaScript("document.querySelectorAll('iframe').forEach(e => e.remove());");
        $("#city").click();
        executeJavaScript("document.querySelectorAll('iframe').forEach(e => e.remove());");
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Alex"), text("Egorov"),
                text("alex@egorov.com"), text("1234567890"));
    }
}