package com.prasad_v.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium12 {
    @Description("TC Description")
    @Test
    public void test_Selenium12() throws Exception {
        System.out.println("This is the Test Selenium12");

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com"); // Open the website
        Thread.sleep(1000);

        // navigation commands -
        driver.navigate().to("https://www.bing.com");
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        // get commands -
        System.out.println(driver.getTitle());


        driver.quit();
    }

}
