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

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Verify slots are clickable and after this user is able to  pass other page and 1/24 wells selected is seems
// Verify green channel is selected
// Verify OpenCELLCYTEAnalysis is Enable
// Verify EnhouncedButton is Selected


public class SmokeTest extends TestBase {
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

    public void Test() throws InterruptedException, IOException {
        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("usernameMe"),ConfigurationReader.get("passwordMe"));

    }

    @Test
    // Assertion slots are clickable and after this user is able to  pass other page
    public void slots() throws InterruptedException {
        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("usernameMe"),ConfigurationReader.get("passwordMe"));
        //   homePage.slotNumber(4);
        List<WebElement> slot = Driver.getDriver().findElementsByAccessibilityId("image");
        slot.get(4).click();
        homePage.closeButtonOnly();
        slot.get(4).click();
        homePage.closeButtonOnly();
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
        System.out.println(Driver.getDriver().findElementByAccessibilityId("NumberOfSelectedClick").getText());
        Assert.assertTrue(Driver.getDriver().findElementByAccessibilityId("NumberOfSelectedClick").getText().equals("1 / 24 wells selected"));


    }

    @Test
//  update Button isDisplayed
    public void Settings() throws InterruptedException {
        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("usernameMe"),ConfigurationReader.get("passwordMe"));
        BrowserUtils.waitFor(3);

        dashBoardPage.settings();
        settings.Analysis();
        settings.SystemPlacement();
        settings.ChangeStandartVesse();
        settings.closeButton();
        Thread.sleep(2000);
        settings.DateTimeFormat();
        Assert.assertTrue(Driver.getDriver().findElementByAccessibilityId("UpdateButton").isDisplayed());


    }

    @Test
    public void studiesPage() throws InterruptedException {
        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("usernameMe"),ConfigurationReader.get("passwordMe"));
        BrowserUtils.waitFor(3);
        dashBoardPage.studies();
        WebElement DownButton = Driver.getDriver().findElementByAccessibilityId("MainDataGrid");
        DownButton.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.ENTER);
        Driver.getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        studiesPage.studiesName("np test 1");

    }

    @Test
    //Assert green channel is Enable
    public void studiespageOverwievPage() throws InterruptedException {
        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("usernameMe"),ConfigurationReader.get("passwordMe"));
        BrowserUtils.waitFor(2);
        dashBoardPage.studies();
        BrowserUtils.waitFor(2);
        WebElement DownButton = Driver.getDriver().findElementByAccessibilityId("MainDataGrid");
        DownButton.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.ENTER);
        Driver.getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        studiesPage.studiesName("np test 1");
        BrowserUtils.waitFor(1);
        studiesPageOverwiev.EnhancedContour();
        BrowserUtils.waitFor(1);
        List<WebElement> percents = Driver.getDriver().findElementsByAccessibilityId("PART_TextBox");
        percents.get(0).sendKeys("3");
        System.out.println("---------------------------------------------------------------------------------------");
        studiesPageOverwiev.GreenChannel();
        WebElement greenChannel = Driver.getDriver().findElementByName("Green channel");
        Assert.assertTrue(greenChannel.isEnabled());


    }

    @Test
// Assert OpenCELLCYTEAnalysis is Enable
    public void Analysis() throws InterruptedException {

        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("usernameMe"),ConfigurationReader.get("passwordMe"));
        BrowserUtils.waitFor(2);
        dashBoardPage.studies();
        BrowserUtils.waitFor(1);
        WebElement DownButton = Driver.getDriver().findElementByAccessibilityId("MainDataGrid");
        DownButton.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.ENTER);
        Driver.getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        studiesPage.studiesName("np test 1");
        WebElement titleBar = Driver.getDriver().findElementByName("CELLINK CELLCYTE Studio");
        BrowserUtils.waitFor(1);
        titleBar.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
        //     studiesPageOverwiev.analysis();
        BrowserUtils.waitFor(2);
        List<WebElement> channels = Driver.getDriver().findElementsByName("Cellink.Cellcyte.UI.Modules." +
                "AnalysisModule.ViewModels.ColorChannelAnalysisViewModel");
        channels.get(0).click();
        analysisPage.wholePage();
        WebElement wholePage = Driver.getDriver().findElementByClassName("CreateAnalysisSetupView");
        List<WebElement> options = wholePage.findElements(By.className("ComboBox"));
        options.get(0).click();
        List<WebElement> SelectsOptions = options.get(0).findElements(By.className("TextBlock"));
        SelectsOptions.get(1).click();
        BrowserUtils.waitFor(2);
        analysisPage.defineSettings();
        analysisPage.analysisName("fdsxfgsfxdsg");
        BrowserUtils.waitFor(3);
        WebElement AnalysisWindow = Driver.getDriver().findElementByClassName("AnalysisWindow");

        WebElement ScrollViewer = AnalysisWindow.findElement(By.className("ScrollViewer"));
        BrowserUtils.waitFor(1);
        ScrollViewer.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
        analysisPage.Select();

        WebElement ImageGrids = Driver.getDriver().findElementByClassName("ImageGrid");
        List<WebElement> SelectImages = ImageGrids.findElements(By.className("Image"));
        System.out.println(SelectImages.size());
        SelectImages.get(2).click();
        SelectImages.get(1).click();
        BrowserUtils.waitFor(4);



        analysisPage.Select();
        WebElement OpenCELLCYTEAnalysis = Driver.getDriver().findElementByName("Open CELLCYTE Analysis");
        Assert.assertTrue(OpenCELLCYTEAnalysis.isEnabled());


    }

    @Test
    // Assert 1/6 wells selected text as seems
    public void StudyNamePage() throws InterruptedException {

        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("usernameMe"),ConfigurationReader.get("passwordMe"));
        BrowserUtils.waitFor(3);
        BrowserUtils.waitFor(3);
        List<WebElement> slot = Driver.getDriver().findElementsByAccessibilityId("image");
        slot.get(0).click();
        homePage.getNoButton();
        studyNamePage.SelectType();
        List<WebElement> TypeOptions = Driver.getDriver().findElementsByAccessibilityId("VesselTypeOptions");
        TypeOptions.get(1).click();
        studyNamePage.VenderName();
        studyNamePage.selectVenderName("Eppendorf");
        studyNamePage.ModelNumberCombo();
        studyNamePage.SelectModelNumber("0030 720.113");
        action.moveByOffset(459, 110).click().build().perform();
        Thread.sleep(2000);
        System.out.println(Driver.getDriver().findElementByAccessibilityId("NumberOfSelectedClick").getText());
        Assert.assertTrue(Driver.getDriver().findElementByAccessibilityId("NumberOfSelectedClick").getText().equals("1 / 6 wells selected"));

    }

    @Test

    // Assert EnhouncedButton is Selected
    public void ColorChannel() throws InterruptedException {

        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("usernameMe"),ConfigurationReader.get("passwordMe"));
        BrowserUtils.waitFor(3);
        BrowserUtils.waitFor(3);
        List<WebElement> slot = Driver.getDriver().findElementsByAccessibilityId("image");
        slot.get(1).click();
        homePage.getNoButton();
        studyNamePage.SelectType();
        List<WebElement> TypeOptions = Driver.getDriver().findElementsByAccessibilityId("VesselTypeOptions");
        TypeOptions.get(1).click();
        studyNamePage.VenderName();
        studyNamePage.selectVenderName("Eppendorf");
        studyNamePage.ModelNumberCombo();
        studyNamePage.SelectModelNumber("0030 720.113");
        action.moveByOffset(459, 110).click().build().perform();
        Thread.sleep(2000);
        System.out.println(Driver.getDriver().findElementByAccessibilityId("NumberOfSelectedClick").getText());
        WebElement CellPage = Driver.getDriver().findElementByClassName("SetupStudyView");
        BrowserUtils.waitFor(2);
        WebElement TabControlCellsPage = CellPage.findElement(By.className("TabControl"));
        TabControlCellsPage.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
        BrowserUtils.waitFor(2);
        colorChannelPage.enhouncedContour();
        BrowserUtils.waitFor(2);
        colorChannelPage.GreenChannelButton();
        BrowserUtils.waitFor(2);
        colorChannelPage.BlueChannelButton();
        BrowserUtils.waitFor(2);
        colorChannelPage.RedChannelButton();
        WebElement EnhouncedContour = Driver.getDriver().findElementByAccessibilityId("EnhancedContourButton");
        WebElement EnhouncedButtonactivePassiveButton = EnhouncedContour.findElement(By.className("Button"));
        Assert.assertTrue(EnhouncedButtonactivePassiveButton.isSelected());

    }


    @Test

    public void downButton() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        loginPage.LoginIn(ConfigurationReader.get("usernameMe"),ConfigurationReader.get("passwordMe"));
        BrowserUtils.waitFor(2);
        dashBoardPage.studies();


        WebElement DownButton = Driver.getDriver().findElementByAccessibilityId("MainDataGrid");
            DownButton.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.ENTER);
            Driver.getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
           studiesPage.studiesName("np test 1");




    }
}