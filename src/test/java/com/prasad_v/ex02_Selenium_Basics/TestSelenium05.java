package com.prasad_v.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium05 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/images");

        driver.quit();
    }
}
