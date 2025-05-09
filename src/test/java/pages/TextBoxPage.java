package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {

    SelenideElement
        userNameInput = $("#userName"),
        userEmailInput = $("#userEmail"),
        currentAddressInput = $("#currentAddress"),
        permanentAddressInput = $("#permanentAddress"),
        submitButton = $("#submit"),
        outputName = $("#output #name"),
        outputEmail = $("#output #email"),
        outputCurrentAddress = $("#output #currentAddress"),
        outputPermanentAddress = $("#output #permanentAddress");



    public TextBoxPage openTextBoxPage() {
        open("/text-box");
        return this;
    }

    public TextBoxPage setUserName(String value) {
        userNameInput.setValue(value);
        return this;
    }

    public TextBoxPage setEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);
        return this;
    }

    public TextBoxPage scrollDownTextBoxPage() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        return this;
    }

    public TextBoxPage clickSubmitButton() {
        submitButton.click();
        return this;
    }



    public TextBoxPage checkOutputName(String value) {
        outputName.shouldHave(text(value));
        return this;
    }


    public TextBoxPage checkOutputEmail(String value) {
        outputEmail.shouldHave(text(value));
        return this;
    }

    public TextBoxPage checkOutputCurrentAddress(String value) {
        outputCurrentAddress.shouldHave(text(value));
        return this;

    }

    public TextBoxPage checkOutputPermanentAddress(String value) {
        outputPermanentAddress.shouldHave(text(value));
        return this;
    }
    public TextBoxPage checkOutputNameNotExist() {
        outputName.shouldNotBe();
        return this;
    }
    public TextBoxPage checkOutputEmailNotExist() {
        outputEmail.shouldNotBe();
        return this;
    }
    public TextBoxPage checkOutputCurrentAddressNotExist() {
        outputCurrentAddress.shouldNotBe();
         return this;
    }

    public TextBoxPage checkOutputPermanentAddressNotExist() {
        outputPermanentAddress.shouldNotBe();
          return this;
    }
}







