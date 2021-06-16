package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class RegressionTestHomePage {



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

    public void Regression4Step1() throws InterruptedException {

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





    }
    @Test
    public void Regression4Step2(){

        List<WebElement> slot = Driver.getDriver().findElementsByAccessibilityId("image");
        slot.get(0).click();
        BrowserUtils.waitFor(2);
        WebElement EditStudy = Driver.getDriver().findElementByName("Edit Study");

        if(EditStudy.isDisplayed()) {

        slot.get(1).click();
        }else {
            homePage.getNoButton();
        }






    }
    @Test
    public void Regression4Step3(){





    }
    @Test
    public void Regression4Step4(){





    }
    @Test
    public void Regression4Step5(){





    }
    @Test
    public void Regression4Step6(){





    }
    @Test
    public void Regression4Step7(){





    }
}
