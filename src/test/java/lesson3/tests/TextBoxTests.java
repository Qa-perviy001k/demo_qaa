package lesson3.tests;

import beforeAll.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests extends TestBase {

    @Test
    void fillFormTest() {
        open("/text-box");
        $(By.xpath("//*[@id='userName']")).sendKeys("Vasya");
        $(By.xpath("//*[@id='userEmail']")).sendKeys("Vasya@rt.ru");
        $(By.xpath("//*[@id='currentAddress']")).sendKeys("some street 1");
        $(By.xpath("//*[@id='permanentAddress']")).sendKeys("anover street 1");
        $(By.xpath("//*[@id='submit']")).click();

        $(By.xpath("//*[@id='name']")).shouldHave(text("Vasya"));
        $(By.xpath("//*[@id='email']")).shouldHave(text("Vasya@rt.ru"));
        $(By.xpath("//p[@id='currentAddress']")).shouldHave(text("some street 1"));
        $(By.xpath("//p[@id='permanentAddress']")).shouldHave(text("anover street 1"));


    }

}