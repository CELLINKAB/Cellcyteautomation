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

public class RegressionTestSetupNewStudyPart2 extends TestBase{
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
    PrewievPage prewievPage = new PrewievPage();


    @Test

    public void Regression3Step8() throws InterruptedException {

        BrowserUtils.waitFor(3);
        loginPage.LoginIn(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        //   homePage.slotNumber(4);
        List<WebElement> slot = Driver.getDriver().findElementsByAccessibilityId("image");

        slot.get(1).click();
        homePage.getNoButton();

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

        WebElement CellPage =Driver.getDriver().findElementByClassName("SetupStudyView");

        WebElement TabControlCellsPage = CellPage.findElement(By.className("TabControl"));

        TabControlCellsPage.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);

        colorChannelPage.enhouncedContour();
        colorChannelPage.GreenChannelButton();
        colorChannelPage.RedChannelButton();


    prewievPage.prewievButton();

        WebElement  BlueChannelButton  = Driver.getDriver().findElementByAccessibilityId("BlueChannelButton");
        WebElement activePassiveBlueChannelButton = BlueChannelButton.findElement(By.className("Button"));
        Assert.assertFalse(activePassiveBlueChannelButton.isSelected());
        prewievPage.prewievButton();

        TabControlCellsPage.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,
                Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);




    }

    @Test

    public void Regression3Step10() throws InterruptedException {

    List<WebElement> PART_IncreaseRepeatButton = Driver.getDriver().findElementsByAccessibilityId("PART_IncreaseRepeatButton");
    PART_IncreaseRepeatButton.get(0).click();
    PART_IncreaseRepeatButton.get(0).click();
    PART_IncreaseRepeatButton.get(1).click();
    PART_IncreaseRepeatButton.get(3).click();
    List<WebElement> partTextBox = Driver.getDriver().findElementsByAccessibilityId("PART_TextBox");
    System.out.println(partTextBox.size());
    Assert.assertEquals("2",partTextBox.get(0).getText());
    int IntervalHours = Integer.parseInt(partTextBox.get(0).getText());
    int PeriodHours = Integer.parseInt(partTextBox.get(3).getText());
    Assert.assertTrue(IntervalHours>PeriodHours);

    WebElement CellPage =Driver.getDriver().findElementByClassName("SetupStudyView");

    WebElement TabControlCellsPage = CellPage.findElement(By.className("TabControl"));

    TabControlCellsPage.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
    Thread.sleep(3000);


}


    @Test

    public void Regression3Step11() throws InterruptedException {

    WebElement startScan = Driver.getDriver().findElementByAccessibilityId("StartStudyButton");
    Thread.sleep(1000);
    startScan.click();

    WebElement No = Driver.getDriver().findElementByName("No");
    No.click();

}
}
