package tests.demoqa.regitsterForm.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class DatePickerComponent {
    public void setDay(String day, String month, String year){
        $(".react-datepicker__month-select").selectOption(month); //9 July
        $(".react-datepicker__year-select").selectOption(year); //1993
        $(".react-datepicker__day--0" + day).click();
    }
}
