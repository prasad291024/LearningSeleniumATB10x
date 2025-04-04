package com.prasad_v.Task02_30thMarch;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Katalon_MakeAppointmentPage {

    @Test(groups = "sanity", priority = 1)
    @Description("Tc01 - Verify the entire Make Appointment flow and Logout functionality")
    public void test_MakeAppointmentFlow() {
        // Initialize Edge browser
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // Create WebDriverWait for explicit waits
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the Katalon demo site
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // Click 'Make Appointment' button
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-make-appointment")));
        button.click();

        // Enter valid username using placeholder-based XPath
        List<WebElement> emailFields = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Username']")));
        emailFields.get(1).sendKeys("John Doe");

        // Enter valid password using placeholder-based XPath
        List<WebElement> passwordFields = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        passwordFields.get(1).sendKeys("ThisIsNotAPassword");

        // Click 'Login' button
        WebElement loginButton = driver.findElement(By.cssSelector("button#btn-login"));
        loginButton.click();

        // Verify redirection after login
        wait.until(ExpectedConditions.urlContains("#appointment"));
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://katalon-demo-cura.herokuapp.com/#appointment");
        System.out.println("Current URL after login: " + currentUrl);

        // Select facility from dropdown (Static dropdown)
        Select facilityDropdown = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("combo_facility"))));
        facilityDropdown.selectByIndex(1); // Selecting second option

        // Select 'Hospital Readmission' checkbox
        WebElement checkbox = driver.findElement(By.id("chk_hospotal_readmission"));
        checkbox.click();

        // Select 'Medicaid' radio button
        WebElement radioButton = driver.findElement(By.cssSelector("input[value='Medicaid']"));
        radioButton.click();

        // Enter visit date
        WebElement calendar = driver.findElement(By.id("txt_visit_date"));
        calendar.sendKeys("09/04/2025");

        // Enter comments
        WebElement commentBox = driver.findElement(By.id("txt_comment"));
        commentBox.sendKeys("This is a comment for test appointment.");

        // Click on 'Book Appointment'
        WebElement bookAppointmentButton = driver.findElement(By.id("btn-book-appointment"));
        bookAppointmentButton.click();

        // Wait for and verify confirmation message
        WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Appointment Confirmation']")));
        Assert.assertEquals(confirmationMessage.getText(), "Appointment Confirmation");
        System.out.println("Confirmation message: " + confirmationMessage.getText());

        // Open menu and logout
        WebElement menuToggle = driver.findElement(By.id("menu-toggle"));
        menuToggle.click();

        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']")));
        logoutButton.click();

        // Verify that user is redirected to homepage
        wait.until(ExpectedConditions.urlToBe("https://katalon-demo-cura.herokuapp.com/"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
        System.out.println("User successfully logged out. Page Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
