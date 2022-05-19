package com.NextBaseCRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authorization_page {
    //------------------------------------------------------//

//    /** 1. Initialization of the page: */
//    public Authorization_page(){
//        PageFactory.initElements(Driver.getWebDriver(), this);
//    }

    //------------------------------------------------------//



    /** 2. WebElements: */
    // Login Box for username
    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"))
    public WebElement LoginBox;

    // Password Box for password
    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"))
    public WebElement PasswordBox;

    // Login Button
    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[2]/input"))
    public WebElement LoginBttn;

    // Drop List
    @FindBy(id = "user-block")
    public WebElement FunctionallityList;

    // Logout Button
    @FindBy(xpath = ("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]/span[2]"))
    public WebElement LogOutBttn;

    // Incorrect login or password message
    @FindBy(xpath = ("//*[@id=\"login-popup\"]/div[2]" ))
    public WebElement ErrorText;

    // Forgot Your Password Button
    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[2]/a"))
    public WebElement ForgotYourPasswordButton;





    //------------------------------------------------------//


    /** 3. Methods: */

    /** Verification Title for Authorization Page */
    public static void verification_AuthorizationPage_Title(WebDriver driver, String exp_Title) {
        String act_Title = driver.getTitle();
//        String exp_Title = "Authorization";
        if (act_Title.equals(exp_Title)){
            System.out.println("Verification the Authorization page PASS");
        } else {
            System.out.println("Verification the Authorization page FAIL");
            // navigate to home page
            //driver.get("http://login2.nextbasecrm.com");
        }

    }


    //------------------------------------------------------//


}
