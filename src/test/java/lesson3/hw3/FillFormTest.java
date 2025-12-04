package lesson3.hw3;

import beforeAll.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class FillFormTest extends TestBase {


    @Test
    public void demoHw3() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove();");
        executeJavaScript("$('#fixedban').remove();");
        $(By.xpath("//*[@id='firstName']")).sendKeys("Vasya");
        $(By.xpath("//*[@id='lastName']")).sendKeys("Pupkin");
        $(By.xpath("//*[@id='userEmail']")).sendKeys("Vasya@rt.ru");
        $(By.xpath("//label[@for='gender-radio-1']")).click();
        $(By.xpath("//*[@id='userNumber']")).sendKeys("1234567899");
        $(By.xpath("//*[@id='dateOfBirthInput']")).click();
        $(By.xpath("//*[@class='react-datepicker__month-select']")).selectOption("June");
        $(By.xpath("//*[@class='react-datepicker__year-select']")).selectOption("2000");
        $(By.xpath("//*[@node()='Choose Friday, June 9th, 2000']")).click();
        $(By.xpath("//*[@id='subjectsInput']")).sendKeys("Computer Science");
        $(By.xpath("//*[@id='subjectsInput']")).pressEnter();
        $(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
        $(By.xpath("//input[@id='uploadPicture']")).uploadFromClasspath("ToolSqa.jpg");
        $(By.xpath("//*[@id='currentAddress']")).sendKeys("some street 1");
        $(By.xpath("//*[contains(text(),'Select State')]")).click();
        $(By.xpath("//*[text()='NCR']")).click();
        $(By.xpath("//*[contains(text(),'Select City')]")).click();
        $(By.xpath("//*[text()='Delhi']")).click();
        $(By.xpath("//*[@id='submit']")).click();
        // Проверки заполнения полей на корректность
        $(By.xpath("//*[@id='example-modal-sizes-title-lg']")).shouldHave(text("Thanks for submitting the form"));
        $(By.xpath("//*[text()='Student Name']/following-sibling::td")).shouldHave(text("Vasya Pupkin"));
        $(By.xpath("//*[text()='Student Email']/following-sibling::td")).shouldHave(text("Vasya@rt.ru"));
        $(By.xpath("//*[text()='Gender']/following-sibling::td")).shouldHave(text("Male"));
        $(By.xpath("//*[text()='Mobile']/following-sibling::td")).shouldHave(text("1234567899"));
        $(By.xpath("//*[text()='Date of Birth']/following-sibling::td")).shouldHave(text("09 June,2000"));
        $(By.xpath("//*[text()='Subjects']/following-sibling::td")).shouldHave(text("Computer Science"));
        $(By.xpath("//*[text()='Hobbies']/following-sibling::td")).shouldHave(text("Sports"));
        $(By.xpath("//*[text()='Picture']/following-sibling::td")).shouldHave(text("ToolSqa.jpg"));
        $(By.xpath("//*[text()='Address']/following-sibling::td")).shouldHave(text("some street 1"));
        $(By.xpath("//*[text()='State and City']/following-sibling::td")).shouldHave(text("NCR Delhi"));

    }
}
