package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_FacebookTitleVerification {
    public static void main(String[] args) {

        //1.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. open www
        driver.get("https://www.facebook.com");

        //3. verify title
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        //4. verify
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Facebook title verification PASSED");
        } else {
            System.out.println("Facebook title verification FAILED");
        }

        //5.
        driver.quit();
    }
}
