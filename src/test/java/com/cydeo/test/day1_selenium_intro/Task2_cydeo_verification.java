package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_cydeo_verification {

    public static void main(String[] args) {

        /**
         * TC #1: Cydeo practice tool verifications
         * 1. Open Chrome browser
         * 2. Go to https://practice.cydeo.com
         * 3. Verify URL contains
         *          Expected: cydeo
         * 4. Verify title:
         *          Expected: Practice
         */
        //1. 2. 3.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //---------------------------------------------------

        //4.
        driver.get("https://practice.cydeo.com");

        //5.
        String expectedURL = "cydeo";
        String currentURL = driver.getCurrentUrl();
                if (currentURL.contains(expectedURL)){
                    System.out.println("URL verification Passed");
                }else{
                    System.out.println("URL verification Failed");
                }
        //7.
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
                if (actualTitle.equals(expectedTitle)){
                    System.out.println("Title verification Passed");
                } else {
                    System.out.println("Title verification Failed");
                }
        driver.quit();

    }
}
