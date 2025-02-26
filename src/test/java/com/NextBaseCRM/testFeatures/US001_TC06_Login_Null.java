package com.NextBaseCRM.testFeatures;

import com.NextBaseCRM.utilities.Driver;
import com.NextBaseCRM.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US001_TC06_Login_Null {
        /**
         * USER STORY 001 - Login Functionality for NextBaseCRM
         *
         *  Test Cases 06
         *  Login with wrong Username and correct Password
         *
         *
         *  Steps:
         *      Given I am on Authorization Page
         *      When I enter wrong username
         *      And I enter correct password
         *      And I click Login button
         *      Then I should see note: Incorrect login or password
         */

    /** Main method */
    public static void main(String[] args) {

        //------------------------------------------------------//

        //1. Ext: create an object from Driver class
            WebDriver driver = Driver.getWebDriver();

        //2. navigate to
            driver.get("http://login2.nextbasecrm.com");

        //3. Ext: verify if you are on Authorization Page, use method
            Utility.authorizationPage_TitleVerification(driver);

        //------------------------------------------------------//

        //5.
            Actions action = new Actions(driver);

        //7.1. Navigate to LoginBox & input username from the List:
            // Login Box for username
            WebElement LoginBox = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
            //find the Login Box
            action.moveToElement(LoginBox).click().perform();
            // Select All & Delete
            action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
            Utility.waitFor(3);

        //7.2. Navigate to PasswordBox & input password:
            // Password Box for password
            WebElement PasswordBox = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
            // move to password
            action.click(PasswordBox).doubleClick().sendKeys(Keys.DELETE).perform();
            Utility.waitFor(3);


        //7.3. Navigate to Login Button & click()
            // Login Button
            WebElement LoginBttn = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
            // click()
            action.click(LoginBttn).perform();
            Utility.waitFor(3);

        //8. verifying the
            WebElement incorrectLoginOrPassword = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/div[2]"));

            if (incorrectLoginOrPassword.isDisplayed()) {
                System.out.println("REPORT: The note \"incorrect login or password\" is Displayed");
            } else {
                System.out.println("REPORT: The note \"incorrect login or password\" is NOT Displayed");
            }

        //9. reporting about termination of the Testing
            System.out.println("------------------------------------------------------");
            System.out.println("Testing is complete!");
            System.out.println("======================================================");


        //10. Ext. quit()
            Driver.quit(driver);

    }
}
