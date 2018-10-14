package com.gmail.mozhgru;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;

import static com.codeborne.selenide.Selenide.*;

public class FirstSelenideTest {

    @BeforeClass
    public void testCreateTask(){
        Configuration.browser = "chrome";
        open("http://todomvc-socketstream.herokuapp.com/#/all");
    }


}
