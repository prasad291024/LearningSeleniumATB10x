package com.prasad_v.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01(){

        // Selenium 3
        // In older versions of Selenium, we had to manually set the WebDriver path
        // Example: System.setProperty("webdriver.gecko.driver", "/path/geckodriver");

        // Selenium 4
        // Selenium Manager is now built-in and can automatically manage driver binaries
        // This means we don’t need to download and set the driver manually

        // Creating an instance of EdgeDriver, which will launch the Edge browser
        EdgeDriver driver = new EdgeDriver();

        // Navigating to Google's homepage
        driver.get("https://google.com");

        // Note: The driver instance should be closed using driver.quit() to release resources
        // driver.quit(); (Uncomment this to properly close the browser after execution)
    }
}

