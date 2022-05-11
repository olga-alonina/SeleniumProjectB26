package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class Basic_Navigation {
    public static void main(String[] args) throws InterruptedException {
            /** Practice */
        ArrayList<String> titleList = new ArrayList<String>();

        // 1. Setup WebDriverManager
        WebDriverManager.chromedriver().setup();

        // 2. Create instance of Webdriver
        WebDriver driver = new ChromeDriver();

        // 3. get the first page using one of the options:
        driver.get("https://yahoo.com");
//        driver.navigate().to("https://yahoo.com");

        // 4. use Thread.sleep() to see what is happening
        Thread.sleep(2000); //2000 = 2 sec
            // adding "throws InterruptedException" to line with main method

        // 5. navigate(), detCurrentUrl()
        driver.get("https://ria.ru");
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.navigate().back();
            Thread.sleep(2000); //2000 = 2 sec
        driver.navigate().forward();
            Thread.sleep(2000); //2000 = 2 sec
        driver.navigate().refresh();
            Thread.sleep(2000); //2000 = 2 sec
        driver.navigate().refresh();
            Thread.sleep(2000); //2000 = 2 sec

        // 6.
        System.out.println("Page title: " + driver.getTitle());
        titleList.add(driver.getTitle());

        // 7. navigate to tesla.com, getCurrentUrl(), getTitle()
        driver.get("https://tesla.com");
        Thread.sleep(2000);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());
        titleList.add(driver.getTitle());

        System.out.println(Arrays.toString(new ArrayList[]{titleList}));


        // quit()
        driver.quit();

    }
}
