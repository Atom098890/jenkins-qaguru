package tests.demoqa.regitsterForm.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SubjectComponent {
    SelenideElement subjectInput = $("#subjectsInput");

    public void subjectSelect(String value){
        subjectInput.setValue(value).pressEnter();
    }
}
