package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;


public class RegressionTestSetUpNewStudy extends TestBase  {


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



    public  void Regression3Step1 () throws InterruptedException {

        // Regression 3 Step 1 Selected slot becomes unavailable

        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        //   homePage.slotNumber(4);
        List<WebElement> slot = Driver.getDriver().findElementsByAccessibilityId("image");
        slot.get(3).click();
        Thread.sleep(2000);
        homePage.getNoButton();
        Thread.sleep(3000);


        System.out.println("------------------------------------------------------------------------------------");
        Driver.getDriver().findElementByAccessibilityId("ExperimentNameTextBox").sendKeys("FuatTest");

        Driver.getDriver().findElementByAccessibilityId("VesselTypeCombo").click();
        Thread.sleep(1000);
        List<WebElement> VesselTypeOptions = Driver.getDriver().findElementsByAccessibilityId("VesselTypeOptions");
        System.out.println(VesselTypeOptions.size());
        System.out.println(VesselTypeOptions.get(3).getText());
        VesselTypeOptions.get(3).click();
        Thread.sleep(1000);
        Driver.getDriver().findElementByAccessibilityId("VenderNameCombo").click();
        Thread.sleep(1000);
        Driver.getDriver().findElementByName("Eppendorf").click();

        Thread.sleep(1000);

        Driver.getDriver().findElementByAccessibilityId("ModelNumberCombo").click();

        Thread.sleep(1000);
        Driver.getDriver().findElementByName("0030 722.116").click();

        System.out.println("--------------------------------------------------------------------------------------");
        action.moveByOffset(459, 110).click().build().perform();
        Thread.sleep(2000);

        homePage.closeButtonOnly();
        homePage.getYesButton();
        slot.get(3).click();
        Assert.assertTrue(Driver.getDriver().findElementByName("Remove Vessel").isDisplayed());
        Driver.getDriver().findElementByName("Remove Vessel").click();
        BrowserUtils.waitFor(1);
        homePage.getYesButton();

        System.out.println("----------------------------------------------------------------------------------------------------------------------");

//Regression3Step2----------------------------------------------------------------------------------------------------------------------------------------

    }
@Test

        public  void Regression3Step2 () throws InterruptedException {
    List<WebElement> slot = Driver.getDriver().findElementsByAccessibilityId("image");

    BrowserUtils.waitFor(3);
            // loginPage.LoginIn(ConfigurationReader.get("usernameMe"), ConfigurationReader.get("passwordMe"));
            //   homePage.slotNumber(4);
            slot.get(3).click();
            Thread.sleep(2000);

            homePage.getYesButton();
            BrowserUtils.waitFor(5);

            WebElement wholePage = Driver.getDriver().findElementByClassName("DataGrid");
            wholePage.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,Keys.PAGE_DOWN,Keys.PAGE_DOWN, Keys.ENTER);
            studiesPage.studiesName("96 rgb");
            Driver.getDriver().findElementByName("Copy study settings").click();

            System.out.println(Driver.getDriver().findElementByAccessibilityId("NumberOfSelectedClick").getText());
            Assert.assertTrue(Driver.getDriver().findElementByAccessibilityId("NumberOfSelectedClick").getText().equals("4 / 96 wells selected"));

            homePage.closeButtonOnly();
            homePage.getNoButton();

    System.out.println("----------------------------------------------------------------------------------------------------------------------");

        }



//Regression3Step3----------------------------------------------------------------------------------------------------------------------------------------
@Test
        public  void Regression3Step3 () throws InterruptedException {
    List<WebElement> slot = Driver.getDriver().findElementsByAccessibilityId("image");


    BrowserUtils.waitFor(3);
             slot.get(3).click();
            Thread.sleep(1000);
            homePage.getNoButton();
            Thread.sleep(1000);

            Driver.getDriver().findElementByAccessibilityId("ExperimentNameTextBox").sendKeys("FuatTest");

            Driver.getDriver().findElementByAccessibilityId("VesselTypeCombo").click();
            List<WebElement> VesselTypeOptions = Driver.getDriver().findElementsByAccessibilityId("VesselTypeOptions");
            System.out.println(VesselTypeOptions.size());
            Assert.assertEquals("6-well", VesselTypeOptions.get(1).getText());
            Assert.assertEquals("12-well", VesselTypeOptions.get(2).getText());
            Assert.assertEquals("24-well", VesselTypeOptions.get(3).getText());
            Assert.assertEquals("48-well", VesselTypeOptions.get(4).getText());
            Assert.assertEquals("96-well", VesselTypeOptions.get(5).getText());
            Assert.assertEquals("384-well", VesselTypeOptions.get(6).getText());
             BrowserUtils.waitFor(2);
            Driver.getDriver().findElementByAccessibilityId("VesselTypeCombo").click();

            homePage.closeButtonOnly();
            homePage.getNoButton();

            System.out.println("----------------------------------------------------------------------------------------------------------------------");

//Regression3Step4----------------------------------------------------------------------------------------------------------------------------------------


        }



    @Test

    public  void Regression3Step4and5 () throws InterruptedException {

        BrowserUtils.waitFor(3);

        //      loginPage.LoginIn(ConfigurationReader.get("usernameMe"),ConfigurationReader.get("passwordMe"));
        //   homePage.slotNumber(4);
        List<WebElement> slot = Driver.getDriver().findElementsByAccessibilityId("image");

        slot.get(3).click();
        Thread.sleep(2000);
        homePage.getNoButton();
        Thread.sleep(3000);

        Driver.getDriver().findElementByAccessibilityId("ExperimentNameTextBox").sendKeys("FuatTest");

        Driver.getDriver().findElementByAccessibilityId("VesselTypeCombo").click();
        BrowserUtils.waitFor(2);
        List<WebElement> VesselTypeOptions = Driver.getDriver().findElementsByAccessibilityId("VesselTypeOptions");

        System.out.println(VesselTypeOptions.size());
        System.out.println(VesselTypeOptions.get(3).getText());
        VesselTypeOptions.get(3).click();

        action.moveByOffset(459, 110).click().build().perform();
        Thread.sleep(2000);

        Assert.assertEquals("C1", Driver.getDriver().findElementByAccessibilityId("RangeSelectedClick").getText());


        //Regression3Step5----------------------------------------------------------------------------------------------------------------------------------------
        Assert.assertTrue(Driver.getDriver().findElementByAccessibilityId("NumberOfSelectedClick").getText().equals("1 / 24 wells selected"));

        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        homePage.closeButtonOnly();
        homePage.getNoButton();
    }

@Test

        public void Regression3Step6and7 () throws InterruptedException {
    BrowserUtils.waitFor(3);

    //      loginPage.LoginIn(ConfigurationReader.get("usernameMe"),ConfigurationReader.get("passwordMe"));
    //   homePage.slotNumber(4);
    List<WebElement> slot = Driver.getDriver().findElementsByAccessibilityId("image");

    slot.get(3).click();
    Thread.sleep(2000);
    homePage.getNoButton();
    Thread.sleep(3000);

    Driver.getDriver().findElementByAccessibilityId("ExperimentNameTextBox").sendKeys("FuatTest");

    Driver.getDriver().findElementByAccessibilityId("VesselTypeCombo").click();
    BrowserUtils.waitFor(2);
    List<WebElement> VesselTypeOptions = Driver.getDriver().findElementsByAccessibilityId("VesselTypeOptions");

    System.out.println(VesselTypeOptions.size());
    System.out.println(VesselTypeOptions.get(3).getText());
    VesselTypeOptions.get(3).click();

    action.moveByOffset(459, 110).click().build().perform();
    Thread.sleep(2000);
    WebElement CellPage =Driver.getDriver().findElementByClassName("SetupStudyView");

    WebElement TabControlCellsPage = CellPage.findElement(By.className("TabControl"));

    TabControlCellsPage.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);

    colorChannelPage.enhouncedContour();
    colorChannelPage.GreenChannelButton();
    colorChannelPage.RedChannelButton();


    WebElement  BlueChannelButton  = Driver.getDriver().findElementByAccessibilityId("BlueChannelButton");
    WebElement activePassiveBlueChannelButton = BlueChannelButton.findElement(By.className("Button"));
    Assert.assertFalse(activePassiveBlueChannelButton.isSelected());


    //Regression3Step7----------------------------------------------------------------------------------------------------------------------------------------
    WebElement  GreenChannelButton  = Driver.getDriver().findElementByAccessibilityId("GreenChannelButton");

    WebElement ms = GreenChannelButton.findElement(By.name("  ms"));
    ms.click();
   WebElement  number = ms.findElement(By.className("TextBox"));
    number.sendKeys("23");

    Assert.assertEquals(number.getText(),"23");

    WebElement  RedChannel  = Driver.getDriver().findElementByAccessibilityId("RedChannelButton");

    WebElement ms1 = RedChannel.findElement(By.name("  ms"));
    ms1.click();
    WebElement number1 = RedChannel.findElement(By.className("TextBox"));
    number1.sendKeys("12");
    Assert.assertEquals(number1.getText(),"12");


    homePage.closeButtonOnly();
    homePage.getNoButton();

   // slot.get(3).click();

   // Thread.sleep(2000);
 //   Driver.getDriver().findElementByName("Remove Vessel").click();
 //   homePage.getYesButton();




    }



}
