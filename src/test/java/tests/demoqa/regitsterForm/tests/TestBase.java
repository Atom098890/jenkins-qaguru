package tests.demoqa.regitsterForm.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;



public class TestBase {

    @BeforeAll
    static void config() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }

    @AfterEach
    void addAttach() {
        Attach.screenShot("Last screenshots");
        Attach.pageSource();
        Attach.browserConsoleLogs();
    }
}
