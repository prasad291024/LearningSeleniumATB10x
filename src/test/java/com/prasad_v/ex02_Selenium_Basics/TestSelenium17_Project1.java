package com.prasad_v.ex02_Selenium_Basics;
// Locators - Find the Web elements
// Open the URL https://app.vwo.com/#/login
// Find the Email id** and enter the email as **admin@admin.com**
// Find the Pass inputbox** and enter passwrod as **admin**.
// Find and Click on the submit button
// Verify that the error message is shown "Your email, password, IP address or location did not match"


import io.qameta.allure.Description;
import junit.framework.TestCase; // JUnit TestCase for assertions
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Project1 {

    // Test Description: This test verifies that when invalid email and password are entered,
    // an appropriate error message is displayed on the VWO login page.

    @Description("Verify that with invalid email and password, an error message is shown on app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception {

        // 1️⃣ Set up Edge browser options
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized"); // Launch browser in maximized mode

        // 2️⃣ Initialize the WebDriver (Edge browser)
        WebDriver driver = new EdgeDriver(edgeOptions);

        // 3️⃣ Navigate to the VWO login page
        driver.get("https://app.vwo.com");

        // ℹ️ Alternative method: driver.navigate().to("https://app.vwo.com");
        // Difference: `get()` waits for page load, while `navigate().to()` doesn’t always wait.

        // 4️⃣ Locate the email input field and enter an invalid email address

        // 📝 HTML for reference:
        // <input type="email" class="text-input W(100%)" name="username"
        // id="login-username" data-qa="hocewoqisi">
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        // 5️⃣ Locate the password input field and enter an invalid password

        // 📝 HTML for reference:
        // <input type="password" class="text-input W(100%)" name="password"
        // id="login-password" data-qa="jobodapuxe">
        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("admin");

        // 6️⃣ Locate the login button and click it to attempt login

        // 📝 HTML for reference:
        // <button type="submit" id="js-login-btn"
        // class="btn btn--positive btn--inverted W(80%) H(48px) Fz(16px)">
        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click(); // Click the login button

        // 7️⃣ Wait for the error message to appear (Explicit Wait recommended, but using Thread.sleep for simplicity)
        Thread.sleep(3000); // ⚠️ Not recommended in real projects; use WebDriverWait instead

        // 8️⃣ Locate the error message and validate its text

        // 📝 HTML for reference:
        // <div class="notification-box-description" data-qa="rixawilomi">
        // Your email, password, IP address or location did not match</div>
        WebElement error_message = driver.findElement(By.className("notification-box-description"));

        // ✅ Assertion: Verify that the error message text is correct
        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

        // 9️⃣ Close the browser after test execution
        driver.quit();
    }
}
