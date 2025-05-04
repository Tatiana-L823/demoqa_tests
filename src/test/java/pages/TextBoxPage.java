package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {


    public TextBoxPage openTextBoxPage() {
        open("/text-box");
        return this;
    }

    public TextBoxPage setUserName(String value) {
        $("#userName").setValue(value);
        return this;
    }

    public TextBoxPage setEmail(String value) {
        $("#userEmail").setValue(value);
        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        $("#currentAddress").setValue(value);
        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        $("#permanentAddress").setValue(value);
        return this;
    }

    public TextBoxPage scrollDownTextBoxPage() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        return this;
    }

    public TextBoxPage clickSubmitButton() {
        $("#submit").click();
        return this;
    }

    public TextBoxPage setUserNa1me(String value) {
        $("#userName").setValue(value);
        return this;
    }

    public TextBoxPage checkOutputName(String value) {
        $("#output #name").shouldHave(text(value));
        return this;
    }


    public TextBoxPage checkOutputEmail(String value) {
        $("#output #email").shouldHave(text(value));
        return this;
    }

    public TextBoxPage checkOutputCurrentAddress(String value) {
        $("#output #currentAddress").shouldHave(text(value));
        return this;

    }

    public TextBoxPage checkOutputPermanentAddress(String value) {
        $("#output #permanentAddress").shouldHave(text(value));
        return this;
    }
    public TextBoxPage checkOutputNameNotExist() {
        $("#output #name").shouldNotBe();
        return this;
    }
    public TextBoxPage checkOutputEmailNotExist() {
        $("#output #email").shouldNotBe();
        return this;
    }
    public TextBoxPage checkOutputCurrentAddressNotExist() {
        $("#output #currentAddress").shouldNotBe();
         return this;
    }

    public TextBoxPage checkOutputPermanentAddressNotExist() {
         $("#output #permanentAddress").shouldNotBe();
          return this;
    }
}







