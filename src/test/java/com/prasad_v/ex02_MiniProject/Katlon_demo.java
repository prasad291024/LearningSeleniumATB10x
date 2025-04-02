package com.prasad_v.ex02_MiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Katlon_demo {

    WebDriver driver;  // Class-level WebDriver

    @BeforeClass
    public void setup() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");

        // Correct: Initialize the global WebDriver
        this.driver = new EdgeDriver(options);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
    }

    @Test
    public void testLogin() throws InterruptedException {
        // Click on 'Make Appointment' button
        WebElement makeAppointmentBtn = driver.findElement(By.id("btn-make-appointment"));
        makeAppointmentBtn.click();

        // Enter username
        WebElement usernameField = driver.findElement(By.id("txt-username"));
        usernameField.sendKeys("John Doe");

        // Enter password
        WebElement passwordField = driver.findElement(By.id("txt-password"));
        passwordField.sendKeys("ThisIsNotAPassword");

        // Click Login button
        WebElement loginBtn = driver.findElement(By.id("btn-login"));
        loginBtn.click();

        // **Verify URL after login**
        String expectedURL = "https://katalon-demo-cura.herokuapp.com/#appointment";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "URL verification failed after login!");

        // **Verify Page contains "Make Appointment" heading**
        Assert.assertTrue(driver.getPageSource().contains("Make Appointment"), "Page does not contain expected heading!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();  // Close the browser
            driver = null;   // Prevent memory leaks
        }
    }
}
