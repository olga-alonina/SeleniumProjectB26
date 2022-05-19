package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {

    public static void main(String[] args) throws InterruptedException {
    /*
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/
        3- Click to A/B Testing from top of the list.
        4- Verify title is:
            Expected: No A/B Test
        5- Go back to home page by using the .back();
        6- Verify title equals:
            Expected: Practice
     */

     //1.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    //2.
        driver.get("https://practice.cydeo.com/");
        Thread.sleep(2000);

    //3.
        WebElement abLinkText = driver.findElement(By.linkText("A/B Testing"));
        abLinkText.click();
        Thread.sleep(2000);


        //4.
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "No A/B Test";

        if (actualTitle1.equals(expectedTitle1)){
            System.out.println("A/B Testing page title verification PASSED");
        } else {
            System.out.println("A/B Testing page title verification FAILED");
        }

    //5.
        driver.navigate().back();
        Thread.sleep(2000);


        //6.
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Practice";

        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Practice page title verification PASSED");
        } else {
            System.out.println("A/B Testing page title verification FAILED");
        }

    //
        driver.quit();


    }
}
