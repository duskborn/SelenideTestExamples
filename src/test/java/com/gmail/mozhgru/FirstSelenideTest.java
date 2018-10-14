package com.gmail.mozhgru;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FirstSelenideTest {

    @BeforeClass
    public static void openBrowser(){
        Configuration.browser = "chrome";
        open("https://www.google.com/");
    }

    @Test
    public void testCreateTask(){
        $(By.id("lst-ib")).setValue("Task 4").pressEnter();
    }
}
