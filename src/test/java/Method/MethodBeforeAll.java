package Method;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;


public class MethodBeforeAll {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 5000;
    }
}

