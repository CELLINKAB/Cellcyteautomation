package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class RegressionTestSettingsPage extends TestBase{

    //1 Verify   User should be able to see previously connected device  in the change device page
    //2 Verify   User should be able to see current version of heartOS and update button
    //3 Verify   User should be able to change storages and are they visible
    //4 Verify   User should be able to change direction of System Placement
    //5 Verify   User should be able to Select Analysis Folder
    //6 Verify   User should be able to see Current SoftwareVersion
    //7 Verify   User should be able to see and select Standart vessel types and are they changable?
    //8 Verify   User should be able to change Date Time format






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

    @Test
// Regression 2 Step 1 Visible Device which previously connected
// Assertion 44 Should User able see previously connected device is visible in the change device page

    public void Regression2Step1 () throws InterruptedException {

        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("username"),ConfigurationReader.get("password"));
        BrowserUtils.waitFor(2);
        dashBoardPage.settings();
        settings.changeDevice();

        WebElement ChangeDevicePage = Driver.getDriver().findElementByClassName("ChangeDeviceView");
        WebElement ChangeDevicePageWithTabControl = ChangeDevicePage.findElement(By.className("TabControl"));
        Assert.assertTrue(Driver.getDriver().findElementByName("Device 1 (C-1911034)").isDisplayed());
    // ChangeDevicePageWithTabControl.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        homePage.closeButtonOnly();


    }
    @Test
    // Regression 2 Step 2 Current version of heartOS displayed
// Assertion 59 Should User able see current version of heartOS
    public  void Regression2Step2 () throws InterruptedException {


        settings.HeartOSVersion();
        System.out.println(Driver.getDriver().findElementByAccessibilityId("HeartOSVersionNumber").getText());
        Assert.assertTrue(Driver.getDriver().findElementByAccessibilityId("HeartOSVersionNumber").isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElementByName("Update").isDisplayed());
        homePage.closeButtonOnly();

    }
@Test

// Regression 2 Step 3 Storage
// Assertion 80 -84 Should User able to change storages and are they visible
    public void Regression2Step3() throws InterruptedException {


    BrowserUtils.waitFor(1);
    List <WebElement> ds = Driver.getDriver().findElementsByClassName("ComboBox");
 //   System.out.println(ds.size());
   ds.get(1).click();
   // ds.click();
    BrowserUtils.waitFor(1);
    settings.ExternalDisk();
   // System.out.println(ds.get(1).getText());
    Assert.assertEquals("ExternalDisk", ds.get(1).getText());
    ds.get(1).click();
    BrowserUtils.waitFor(1);
    settings.LocalStorage();
    System.out.println(ds.get(1).getText());
    Assert.assertEquals("LocalStorage", ds.get(1).getText());


    //   settings.DefaultStorage();
}
    @Test
    // Regression 2 Step 4 SystemPlacement
// Assertion 111 Should User able see System Placement which located homepage

    public void Regression2Step4() throws InterruptedException {



        settings.SystemPlacement();

        WebElement systemPlacement = Driver.getDriver().findElementByName("System placement");
        List<WebElement> systemPlacementSide = systemPlacement.findElements(By.className("Image"));
        System.out.println(systemPlacementSide.size());
        systemPlacementSide.get(1).click();
        dashBoardPage.HomeButton();

        WebElement SeemsUser = Driver.getDriver().findElementByName("Local User");

        Assert.assertTrue(SeemsUser.isDisplayed());

    }
@Test

// Regression 2 Step 5 AnalysisFolder
// Assertion 128 Should User able Select Analysis Folder

public void Regression2Step5() throws InterruptedException {


    BrowserUtils.waitFor(2);
    dashBoardPage.settings();

    settings.Analysis();

    Assert.assertTrue(Driver.getDriver().findElementByName("Select").isDisplayed());
}

    @Test
    // Regression 2 Step 6 SoftwareVersionIsDisplayed
// Assertion 141 Should User able see Current SoftwareVersion
    public  void Regression2Step6 () throws InterruptedException {



        settings.SoftwareVersionIsDisplayed();  // Assertion in the method

    }
    //Name	Microplate 96-well

    @Test
    // Regression 2 Step 7 Change the Standard vessel types
// Assertion 141 Should User able see Standart vessel types and are they changable?
    public  void Regression2Step7 () throws InterruptedException {


        settings.ChangeStandartVesse();

        Assert.assertTrue(Driver.getDriver().findElementByName("Microplate 6-well").isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElementByName("Microplate 12-well").isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElementByName("Microplate 24-well").isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElementByName("Microplate 48-well").isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElementByName("Microplate 96-well").isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElementByName("Microplate 384-well").isDisplayed());

        homePage.closeButtonOnly();



    }

    @Test
    // Regression 2 Step 8 Change Date Time format
// Assertion 179-180 Should User able to change Date Time format?
    public  void Regression2Step8 () throws InterruptedException {


        settings.DateTimeFormat();
        Assert.assertTrue(Driver.getDriver().findElementByAccessibilityId("DateFormatID").isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElementByAccessibilityId("TimeFormatID").isDisplayed());




    }
}
