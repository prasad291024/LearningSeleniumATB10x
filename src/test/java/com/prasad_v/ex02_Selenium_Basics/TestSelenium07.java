package com.prasad_v.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium07 {

    @Description("Demonstrating various Selenium WebDriver commands")
    @Test
    public void test_SeleniumCommands() {

        // Selenium 4: Using Selenium Manager to automatically manage browser drivers
        WebDriver driver = new EdgeDriver();

        // 1. Open a website
        driver.get("https://www.google.com");
        System.out.println("Opened Google homepage");

        // 2. Get and print the page title
        String pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);

        // 3. Get the current URL
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        // 4. Get page source (useful for debugging)
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        // 5. Locate an element using name locator (Example: Google search bar)
        WebElement searchBox = driver.findElement(By.name("q"));

        // 6. Enter text into the search bar
        searchBox.sendKeys("Selenium WebDriver");
        System.out.println("Entered search term");

        // 7. Simulate pressing ENTER key
        searchBox.sendKeys(Keys.RETURN);
        System.out.println("Performed search operation");

        // 8. Wait for results to load (using implicit wait for simplicity)
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));

        // 9. Find an element by its XPath (Example: first search result)
        WebElement firstResult = driver.findElement(By.xpath("(//h3)[1]"));
        System.out.println("First result text: " + firstResult.getText());

        // 10. Click on the first search result
        firstResult.click();
        System.out.println("Clicked on first result");

        // 11. Navigate back
        driver.navigate().back();
        System.out.println("Navigated back");

        // 12. Navigate forward
        driver.navigate().forward();
        System.out.println("Navigated forward");

        // 13. Refresh the page
        driver.navigate().refresh();
        System.out.println("Page refreshed");

        // 14. Maximize browser window
        driver.manage().window().maximize();
        System.out.println("Maximized browser window");

        // 15. Minimize browser window
        driver.manage().window().minimize();
        System.out.println("Minimized browser window");

        // 16. Get the dimensions of the browser window
        Dimension size = driver.manage().window().getSize();
        System.out.println("Browser window size: " + size);

        // 17. Set a specific window size
        driver.manage().window().setSize(new Dimension(1024, 768));
        System.out.println("Set window size to 1024x768");

        // 18. Handle alerts (if any appear, example code - modify as needed)
        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert text: " + alert.getText());
            alert.accept(); // Accept the alert
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present");
        }

        // 19. Close the browser window
        driver.quit(); // Use driver.quit() to close all windows
        System.out.println("Closed browser");
    }
}
