package tests.demoqa.regitsterForm.pages;

import com.codeborne.selenide.SelenideElement;
import tests.demoqa.regitsterForm.pages.components.DatePickerComponent;
import tests.demoqa.regitsterForm.pages.components.SubjectComponent;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationFromPage {
    //Component
    DatePickerComponent datePickerComponent = new DatePickerComponent();
    SubjectComponent subjectComponent = new SubjectComponent();

    //Elements
    private final SelenideElement FIRST_NAME = $("#firstName");
    private final SelenideElement LAST_NAME = $("#lastName");
    private final SelenideElement EMAIL = $("#userEmail");
    private final SelenideElement PHONE = $("#userNumber");
    private final SelenideElement CHECKBOX = $("[for='hobbies-checkbox-3']");

    //Actions

    public RegistrationFromPage openPage(){
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }

    public RegistrationFromPage setFirstName(String value){
        FIRST_NAME.setValue(value);

        return this;
    }

    public void clearFirstName(){
        FIRST_NAME.clear();
    }

    public RegistrationFromPage setLastName(String value){
        LAST_NAME.setValue(value);

        return this;
    }

    public RegistrationFromPage setEmail(String value){
        EMAIL.setValue(value);

        return this;
    }

    public RegistrationFromPage setGender(String value){
        $(value).click();

        return this;
    }

    public RegistrationFromPage setPhone(String value){
        PHONE.setValue(value);

        return this;
    }

    public RegistrationFromPage setBirthday(String day, String month, String year){
        $("#dateOfBirthInput").click();
        datePickerComponent.setDay(day, month, year);

        return this;
    }

    public RegistrationFromPage setSubject(String value){
        subjectComponent.subjectSelect(value);

        return this;
    }

    public RegistrationFromPage setCheckBox(){
        CHECKBOX.click();

        return this;
    }
}
