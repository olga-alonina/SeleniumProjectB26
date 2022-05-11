package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        //1.
        WebDriverManager.chromedriver().setup();

        //2.
        WebDriver driver = new ChromeDriver();

        //3.
        driver.manage().window().maximize();

        //---------------------------------------------------

        //4.
        driver.get("https://www.yahoo.com");

        //5.
        String actualTitle = driver.getTitle();
        System.out.println("Actual title of " + driver.getCurrentUrl() + " is: "
        + actualTitle);

        //6.
        String expectedTitle = "Yahoo";

        //7.
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification Passed!");
        } else {
            System.out.println("Title verification Failed!");
        }


        //
        driver.quit();
    }
}
