package com.NextBaseCRM.testFeatures;

import com.NextBaseCRM.utilities.Driver;
import com.NextBaseCRM.utilities.DriverUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class US001_TC01_Login_AllCorrect {

    /** Main method */
    public static void main(String[] args) throws InterruptedException {

        //------------------------------------------------------//

        //1. Ext: create an object from Driver class
            WebDriver driver = Driver.getWebDriver();

        //2. navigate to
            driver.get("http://login2.nextbasecrm.com");

        //3. Ext: verify if you are on Authorization Page, use method
            DriverUtilities.authorizationPage_TitleVerification(driver);

        //------------------------------------------------------//

        //4. ArrayList with correct Usernames

        ArrayList<String> UsernameList = new ArrayList<>();

            //5. add elements to ArrayList
            UsernameList.add("helpdesk29@cybertekschool.com");
            UsernameList.add("helpdesk30@cybertekschool.com");

            UsernameList.add("marketing29@cybertekschool.com");
            UsernameList.add("marketing30@cybertekschool.com");

            UsernameList.add("hr29@cybertekschool.com");
            UsernameList.add("hr30@cybertekschool.com");

        //5.
        Actions action = new Actions(driver);

        //6.
        ArrayList<String> titlesList = new ArrayList<>();

        //7. Loop
        for (int i = 0;  i < UsernameList.size();  i++) {

            //7.1. Navigate to LoginBox & input username from the List:
                // Login Box for username
                WebElement LoginBox = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
                //find the Login Box
                action.moveToElement(LoginBox).click().perform();
                // Select All & Delete
                action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
                    DriverUtilities.waitFor(3);
                // input username from loop
                action.sendKeys(UsernameList.get(i)).perform();
                    DriverUtilities.waitFor(3);



            //7.2. Navigate to PasswordBox & input password:
                // Password Box for password
                WebElement PasswordBox = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
                // move to password
                action.click(PasswordBox).doubleClick().sendKeys(Keys.DELETE).perform();
                    DriverUtilities.waitFor(3);
                action.sendKeys("UserUser").perform();


            //7.3. Navigate to Login Button & click()
                // Login Button
                WebElement LoginBttn = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
                // click()
                action.click(LoginBttn).perform();
                    DriverUtilities.waitFor(3);


            //7.4. Collect titles:
                String titleObject = driver.getTitle();
                titlesList.add(titleObject);


            //7.5. Logout process
                // Drop List
                WebElement FunctionalityList = driver.findElement(By.id("user-block"));

                action.moveToElement(FunctionalityList).click().perform();
                    DriverUtilities.waitFor(3);


                // Logout Button
                WebElement LogOutBtn = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]/span[2]"));

                action.moveToElement(LogOutBtn).click().perform();
                    DriverUtilities.waitFor(3);

            //7.6. report
            System.out.println("Login Functionality to page for   " + UsernameList.get(i) + "   is verified");
            System.out.println("Title of the page is:  " + titleObject);
        }


        //8. print out the List of titles
        System.out.println("Total verified " + titlesList.size() + " pages");
        System.out.println("List of the titles: " + titlesList);

        //9. Ext. quit()
        Driver.quit(driver);


    }







}
