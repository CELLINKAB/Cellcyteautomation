package tests;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;


public class RegressionTestLoginConnectPage extends TestBase {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    Settings settings = new Settings();
    StudiesPage studiesPage = new StudiesPage();
    StudiesPageOverwiev studiesPageOverwiev = new StudiesPageOverwiev();
    AnalysisPage analysisPage = new AnalysisPage();
    StudyNamePage studyNamePage = new StudyNamePage();
    Actions action = new Actions(Driver.getDriver());
    ColorChannelPage colorChannelPage = new ColorChannelPage();



// Verify  user should be able to sign in valid credentials
// Verify  User should be able to see previously connected device are available
// Verify  User should be able to sign out successfully







    @Test
// Regression 1 Step 3 Sign in Successfully
    public void Regression1Step2and3() throws InterruptedException {

        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        BrowserUtils.waitFor(2);



        WebElement SeemsUser = Driver.getDriver().findElementByName("Local User");

        Assert.assertTrue(SeemsUser.isDisplayed());
        System.out.println(SeemsUser.getText());


    }
@Test
// Regression 1 Step 4
// Assertion 63 Should User able see previously connected device are available
    public void Regression1Step4 () throws InterruptedException {



WebElement DeviceName = Driver.getDriver().findElementByName("Device 3 (C-1911034)");
    System.out.println(DeviceName.getText());
Assert.assertTrue(DeviceName.isDisplayed());

}

@Test
//  Regression 1 Step 5 Sign out successfully
// Assertion line 79 Should user able to see sign in button after signing out
    public void Regression1Step5 () throws InterruptedException {


    homePage.logOut();
    BrowserUtils.waitFor(2);
    WebElement signin = Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId");
    Assert.assertEquals(signin.getText(),"SignInMenuItemAutomationPropertiesName");

}


}
