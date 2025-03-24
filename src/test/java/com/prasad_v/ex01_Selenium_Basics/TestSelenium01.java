package com.prasad_v.ex01_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {
    @Test
    public void test_VerifyVWOLogin() throws InterruptedException {
        // Write the code which will execute the perform the ui interactions
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getSessionId());
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
    }
}
