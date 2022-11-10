package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemProperties {
    @Test
    void systemTest() {
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }

    @Tag("property")
    @Test
    void systemTest2() {
        String browserName = System.getProperty("browser_name", "opera");
        String browserVersion = System.getProperty("browser_version", "101");
        String browserSize = System.getProperty("browser_size", "1920x1080");
        System.out.println(browserName);
        System.out.println(browserVersion);
        System.out.println(browserSize);
    }

    @Test
    void systemTest1() {
        System.setProperty("browser", "opera");
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }

    @Test
    @Tag("someTest")
    void someTest() {
        String out = System.getProperty("some_text", "Def");
        System.out.print("Hello " + out);
    }
}
