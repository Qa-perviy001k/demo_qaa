package tests.Lesson3.Hw3;


import Method.MethodBeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class DemoQaHw3 extends MethodBeforeAll {


@Test
public void demoQaHw3() {

    open("/automation-practice-form");
    $(By.xpath("//*[@id='firstName']")).sendKeys("Vasya");
    $(By.xpath("//*[@id='lastName']")).sendKeys("Pupkin");
    $(By.xpath("//*[@id='userEmail']")).sendKeys("Vasya@rt.ru");
    $(By.xpath("//label[@for='gender-radio-1']")).click();
    $(By.xpath("//*[@id='userNumber']")).sendKeys("1234567899");
    $(By.xpath("//*[@id='dateOfBirthInput']")).pressEnter();
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
    $(By.xpath("//td[text()='Student Name']/following-sibling::td")).shouldHave(text("Vasya Pupkin"));
    $(By.xpath("//td[text()='Student Email']/following-sibling::td")).shouldHave(text("Vasya@rt.ru"));
    $(By.xpath("//td[text()='Gender']/following-sibling::td")).shouldHave(text("Male"));
    $(By.xpath("//td[text()='Mobile']/following-sibling::td")).shouldHave(text("1234567899"));
    $(By.xpath("//td[text()='Date of Birth']/following-sibling::td")).shouldHave(text("02 December,2025"));
    $(By.xpath("//td[text()='Subjects']/following-sibling::td")).shouldHave(text("Computer Science"));
    $(By.xpath("//td[text()='Hobbies']/following-sibling::td")).shouldHave(text("Sports"));
    $(By.xpath("//td[text()='Picture']/following-sibling::td")).shouldHave(text("ToolSqa.jpg"));
    $(By.xpath("//td[text()='Address']/following-sibling::td")).shouldHave(text("some street 1"));
    $(By.xpath("//td[text()='State and City']/following-sibling::td")).shouldHave(text("NCR Delhi"));









}



}
