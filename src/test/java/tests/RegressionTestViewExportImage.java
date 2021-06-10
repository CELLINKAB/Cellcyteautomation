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

public class RegressionTestViewExportImage extends TestBase  {
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
    public void Regression5Step1() throws InterruptedException {

        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        dashBoardPage.studies();
        BrowserUtils.waitFor(5);
        WebElement wholePage = Driver.getDriver().findElementByAccessibilityId("MainDataGrid");

      //  wholePage.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN
      //          ,Keys.PAGE_DOWN,Keys.PAGE_DOWN ,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.ENTER);
        BrowserUtils.waitFor(1);
        studiesPage.studiesName("Cells 3");

        WebElement NPTEST1 = Driver.getDriver().findElementByName("Cells 3");
        Assert.assertEquals(NPTEST1.getText(),"Cells 3");



    }
    @Test
    public void Regression5Step2(){

        WebElement ImageGrids = Driver.getDriver().findElementByClassName("ImageGrid");
        List<WebElement> SelectImages = ImageGrids.findElements(By.className("Image"));
        System.out.println(SelectImages.size());

        Assert.assertTrue(SelectImages.get(1).isDisplayed());
        Assert.assertTrue(SelectImages.get(2).isDisplayed());
        Assert.assertTrue(SelectImages.get(3).isDisplayed());
        Assert.assertTrue(SelectImages.get(4).isDisplayed());
        Assert.assertTrue(SelectImages.get(5).isDisplayed());











    }
    @Test
    public void Regression5Step3(){

        WebElement ImageGrids = Driver.getDriver().findElementByClassName("ImageGrid");
        List<WebElement> SelectImages = ImageGrids.findElements(By.className("Image"));
        SelectImages.get(1).click();
        Assert.assertTrue(Driver.getDriver().findElementByClassName("Image").isDisplayed());

        WebElement 	Thumb = Driver.getDriver().findElementByAccessibilityId("Thumb");

        WebElement DecreaseLarge = Driver.getDriver().findElementByAccessibilityId("DecreaseLarge");

        WebElement IncreaseLarge = Driver.getDriver().findElementByAccessibilityId("IncreaseLarge");



    }
    @Test
    public void Regression5Step4(){







    }
    @Test
    public void Regression5Step5(){





    }
    @Test
    public void Regression5Step6(){





    }
    @Test
    public void Regression5Step7(){





    }
    @Test
    public void Regression5Step8(){





    }

}
