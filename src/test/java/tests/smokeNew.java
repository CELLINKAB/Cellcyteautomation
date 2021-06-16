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

public class smokeNew extends TestBase{

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

    public void smoke1() throws InterruptedException {



        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        dashBoardPage.studies();
        BrowserUtils.waitFor(5);
        WebElement wholePage = Driver.getDriver().findElementByAccessibilityId("MainDataGrid");

        //  wholePage.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN
        //          ,Keys.PAGE_DOWN,Keys.PAGE_DOWN ,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.ENTER);
        BrowserUtils.waitFor(1);
        studiesPage.studiesName("Image Load test");

        WebElement NPTEST1 = Driver.getDriver().findElementByName("Image Load test");
        Assert.assertEquals(NPTEST1.getText(),"Image Load test");
        BrowserUtils.waitFor(2);
        WebElement titleBar = Driver.getDriver().findElementByName("CELLINK CELLCYTE Studio");
        titleBar.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,Keys.TAB, Keys.ENTER);
        BrowserUtils.waitFor(2);
        List<WebElement> channels = Driver.getDriver().findElementsByName("Cellink.Cellcyte.UI.Modules." +
                "AnalysisModule.ViewModels.ColorChannelAnalysisViewModel");
        channels.get(0).click();

        WebElement wholePage1 = Driver.getDriver().findElementByClassName("CreateAnalysisSetupView");
        List<WebElement> options = wholePage1.findElements(By.className("ComboBox"));
        System.out.println(options.get(0).getText());
        options.get(0).click();
        List<WebElement> SelectsOptions = options.get(0).findElements(By.className("TextBlock"));
        SelectsOptions.get(0).click();
        BrowserUtils.waitFor(1);
        analysisPage.loadSettings();

        Driver.getDriver().findElementByAccessibilityId("4").click();

        Driver.getDriver().findElementByName("Open").click();

        Driver.getDriver().findElementByName("Next").click();
        Driver.getDriver().findElementByName("Select all wells").click();
        Driver.getDriver().findElementByName("Next").click();
        WebElement AnalysisTimePointSelectionView = Driver.getDriver().findElementByClassName("AnalysisTimePointSelectionView");

   //     List<WebElement> menuItem = Driver.getDriver().findElementsByClassName("MenuItem");
    //    System.out.println(menuItem.size());

    //    menuItem.get(3).click();

      WebElement ucline=  AnalysisTimePointSelectionView.findElement(By.className("MenuItem"));
      ucline.click();
        Driver.getDriver().findElementByName("Select all").click();
        Driver.getDriver().findElementByName("Next").click();
        Driver.getDriver().findElementByName("Start analysis").click();
        BrowserUtils.waitFor(2);


    }

    @Test

    public void deneme (){








    }

}
