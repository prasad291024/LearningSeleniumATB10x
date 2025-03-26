package com.prasad_v.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium11 {
    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {

        // this is not possible
        ChromeDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();


        // this is possible
        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();
    }
}
