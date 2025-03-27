package com.prasad_v.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestSelenium15 {

    @Description("Options Class")
    @Test
    public void test_Selenium01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        // FirefoxOptions, ChromeOptions, SafariOptions

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?

//        edgeOptions.addArguments("--window-size=1280,720");
//        edgeOptions.addArguments("--window-size=800,600");
//        edgeOptions.addArguments("--incognito");
//        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--headless");





        EdgeDriver driver = new EdgeDriver(edgeOptions);

        Thread.sleep(5000);
        driver.quit();



    }

}