package com.prasad_v.ex02_Selenium_Basics;  // Package name (helps in organizing code)

import io.qameta.allure.Description;  // For adding test case descriptions in reports
import org.openqa.selenium.WebDriver; // WebDriver interface to interact with the browser
import org.openqa.selenium.edge.EdgeDriver; // Edge browser driver
import org.testng.Assert; // TestNG Assertion for validation
import org.testng.annotations.Test; // TestNG annotation for marking test methods

public class TestSelenium10 {  // TestNG will execute test methods inside this class

    // Test Case 1: Verifies if the webpage opens and checks the title
    @Description("TC #1 - Test Selenium - Open the URL and check the Title")
    @Test  // Marks this method as a TestNG test case
    public void test_Selenium01() {
        System.out.println("Test Selenium Started"); // Log for tracking execution

        // Step 1: Launch the Edge browser
        System.out.println("Opening the URL");
        WebDriver driver = new EdgeDriver(); // Initializes the Edge browser

        // Step 2: Navigate to the website
        driver.get("https://katalon-demo-cura.herokuapp.com/"); // Opens the URL

        // Step 3: Maximize the browser window for better visibility
        driver.manage().window().maximize();

        // Step 4: Get and print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("The Title of the page is: " + pageTitle);

        // Step 5: Validate if the expected text is present in the page source
        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("CURA Healthcare Service is visible"); // Log message
            Assert.assertTrue(true);  // Test passes if text is found
        } else {
            System.out.println("CURA Healthcare Service is not visible"); // Log message
            Assert.fail("CURA Healthcare Service is missing from the page!"); // Test fails
        }

        // Step 6: Close the browser session after execution
        driver.quit();
        System.out.println("Browser closed successfully.");
    }
}
