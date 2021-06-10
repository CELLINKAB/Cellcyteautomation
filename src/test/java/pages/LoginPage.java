package pages;

import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.concurrent.TimeUnit;


public class LoginPage{

    public static  WebElement userName;
    public  static WebElement password;
    public  static WebElement signin;

public void LoginIn ( String userNameBox , String passwordBox) throws InterruptedException {
 //   Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();
    Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    userName=   Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
    password=   Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId");
    signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
    Thread.sleep(1000);

    userName.sendKeys(userNameBox);
    password.sendKeys(passwordBox);

 signin.click();

    BrowserUtils.waitFor(3);

}

public void forgotPassword(){

    WebElement forgotPassword = Driver.getDriver().findElementByAccessibilityId("ForgotPasswordHyperlinkAutomationPropertiesAutomationId");
    forgotPassword.click();

}
}
