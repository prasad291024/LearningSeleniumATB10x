package com.prasad_v.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class TestSelenium02 {

    @Description("TC#1 - Open the app.vwo.com and verify the title!")
    @Test
    public void test_Selenium02(){
        System.out.println("Hello World!");

        // Open the URL
        EdgeDriver driver  = new EdgeDriver();
        // new EdgeDriver(); -> POST Request(Browser Driver) (localhost:XXXXX), Create New Session Endpoint


        // Navigate the URL -> get the URL
        driver.get("https://app.vwo.com");


        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        driver.quit();


    }

}
