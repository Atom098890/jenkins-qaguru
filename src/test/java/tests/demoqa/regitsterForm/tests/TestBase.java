package tests.demoqa.regitsterForm.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;



public class TestBase {
    @BeforeAll
    static void config() {
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
}
