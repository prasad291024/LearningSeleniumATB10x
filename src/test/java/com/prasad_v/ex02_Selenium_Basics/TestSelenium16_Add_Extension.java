package com.prasad_v.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16_Add_Extension {
    @Description("Options Class - Adding Extension to Edge Browser")
    @Test
    public void test_Selenium01() throws Exception {
        // Set Edge Options
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");

        // Use Absolute Path (TEMPORARY for debugging)
        File extensionFile = new File("C:/Users/prasa/IdeaProjects/LearningSeleniumATB10x/src/test/resources/adblock1.crx");

        // Check if the file exists
        if (!extensionFile.exists()) {
            throw new RuntimeException("Extension file not found: " + extensionFile.getAbsolutePath());
        }

        // Add Extension
        edgeOptions.addExtensions(extensionFile);

        // Start Edge with the specified options
        WebDriver driver = new EdgeDriver(edgeOptions);

        // Open YouTube
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");

        // Wait for 5 seconds to observe (Optional - Use WebDriverWait in real scenarios)
        Thread.sleep(5000);

        // Quit Browser
        driver.quit();
    }
}
