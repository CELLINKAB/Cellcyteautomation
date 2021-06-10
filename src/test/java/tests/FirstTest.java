package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;


public class FirstTest extends TestBase{

@Test
        public void Test() throws InterruptedException {


    BrowserUtils.waitFor(5);
    //    Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();
        Thread.sleep(1000);

        WebElement username =
                Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
        username.sendKeys("fa@cellink.com");
        Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys("Password@123");
        BrowserUtils.waitFor(2);
        WebElement  signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
        Thread.sleep(3000);
        signin.click();



    }

    @Test

    public void general() throws InterruptedException {


        BrowserUtils.waitFor(5);
  //      Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();
        Thread.sleep(1000);

        WebElement username =
                Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
        username.sendKeys("fa@cellink.com");
        Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys("Password@123");
        Thread.sleep(1000);
        WebElement  signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
        signin.click();

        Driver.getDriver().findElementByAccessibilityId("StudiesButton").click();
        Thread.sleep(3000);
        Driver.getDriver().findElementByAccessibilityId("HomeTabItemAutomationPropertiesAutomationId").click();
        Driver.getDriver().findElementByAccessibilityId("image").click();
        Thread.sleep(1000);
        Driver.getDriver().findElementByName("No").click();
        Thread.sleep(1000);
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


        Thread.sleep(3000);
        Driver.getDriver().findElementByAccessibilityId("closeButtonImage").click();
        Thread.sleep(2000);
        Driver.getDriver().findElementByName("No").click();

       List<WebElement> image = Driver.getDriver().findElementsByAccessibilityId("view");
        System.out.println(image.size());

        



    }

    @Test
    public void Slots() throws InterruptedException {

        BrowserUtils.waitFor(5);
  //      Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();


        WebElement username =
                Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
        username.sendKeys("fa@cellink.com");
        Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys("Password@123");
        Thread.sleep(1000);
        WebElement  signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
        signin.click();

        List<WebElement> slots = Driver.getDriver().findElementsByAccessibilityId("image");

        System.out.println(slots.size());
        Actions action = new Actions(Driver.getDriver());

        Thread.sleep(5000);
        action.click(slots.get(0)).build().perform();
        Assert.assertTrue(slots.get(0).isDisplayed());
        Thread.sleep(1000);
        Driver.getDriver().findElementByAccessibilityId("closeButtonImage").click();
        action.click(slots.get(1)).build().perform();
        Assert.assertTrue(slots.get(1).isDisplayed());
        Thread.sleep(1000);
        Driver.getDriver().findElementByAccessibilityId("closeButtonImage").click();
        action.click(slots.get(2)).build().perform();
        Thread.sleep(1000);
        Assert.assertTrue(slots.get(2).isDisplayed());
        Driver.getDriver().findElementByAccessibilityId("closeButtonImage").click();
        action.click(slots.get(3)).build().perform();
        Thread.sleep(1000);
        Assert.assertTrue(slots.get(3).isDisplayed());
        Driver.getDriver().findElementByAccessibilityId("closeButtonImage").click();
        action.click(slots.get(4)).build().perform();
        Thread.sleep(1000);
        Assert.assertTrue(slots.get(4).isDisplayed());
        Driver.getDriver().findElementByAccessibilityId("closeButtonImage").click();
        action.click(slots.get(5)).build().perform();
        Thread.sleep(1000);
        Assert.assertTrue(slots.get(5).isDisplayed());
        Driver.getDriver().findElementByAccessibilityId("closeButtonImage").click();


    }

    @Test
    public void Settings() throws InterruptedException {

        Thread.sleep(1000);
  //      Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();
        Thread.sleep(1000);

        WebElement username =
                Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
        username.sendKeys("fa@cellink.com");
        Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys("Password@123");
        WebElement  signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
        signin.click();

        Thread.sleep(5000);


        Driver.getDriver().findElementByAccessibilityId("SettingButton").click();

        Thread.sleep(1000);

        Thread.sleep(2000);


        Thread.sleep(2000);
        Driver.getDriver().findElementByName("System placement").click();

        List<WebElement> CellCyteX = Driver.getDriver().findElementsByClassName("Image");
        System.out.println(CellCyteX.size());
        Thread.sleep(2000);
        Driver.getDriver().findElementByName("Analysis").click();
      //  Driver.getDriver().findElementByName("Select").click();

        Thread.sleep(1000);
        Driver.getDriver().findElementByAccessibilityId("ChangeStandardVessel").click();
        Driver.getDriver().findElementByAccessibilityId("closeButtonImage").click();
        Thread.sleep(3000);
        Driver.getDriver().findElementByAccessibilityId("Date-time format").click();


    }
@Test

    public void studiesPage() throws InterruptedException {

    Driver.getDriver();
    Thread.sleep(1000);
 //   Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();
    Thread.sleep(1000);

    WebElement username =
            Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
    username.sendKeys("fa@cellink.com");
    Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys("Password@123");
Thread.sleep(1000);
    WebElement  signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
    signin.click();
  Thread.sleep(6000);
    Driver.getDriver().findElementByAccessibilityId("StudiesButton").click();
    Thread.sleep(3000);
    Driver.getDriver().findElementByName("np test 1").click();

    Thread.sleep(3000);
    List<WebElement> deletes =  Driver.getDriver().findElementsByName("Item: Cellink.Cellcyte.UI.ViewModels.MainViews.ExperimentModel, Column Display Index: 11");
   System.out.println(deletes.size());
   Thread.sleep(4000);
   deletes.get(2).click();




}
@Test

    public void studiespageOverwievPage () throws InterruptedException {


//    Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();
    BrowserUtils.waitFor(2);

    WebElement username =
            Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
    username.sendKeys("fa@cellink.com");
    Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys("Password@123");
    Thread.sleep(1000);
    WebElement  signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
    signin.click();
    Thread.sleep(6000);

    Driver.getDriver().findElementByAccessibilityId("StudiesButton").click();
    Thread.sleep(2000);
    Driver.getDriver().findElementByName("np test 1").click();
    Thread.sleep(3000);

    Driver.getDriver().findElementByName("Enhanced contour").click();
    Thread.sleep(3000);
    List<WebElement> percents = Driver.getDriver().findElementsByAccessibilityId("PART_TextBox");
    Thread.sleep(1000);
    percents.get(0).sendKeys("22");

    WebElement studiespageOverwiev =Driver.getDriver().findElementByAccessibilityId("AnalysisPages");
    List<WebElement> headerSiteOfColor = Driver.getDriver().findElementsByAccessibilityId("HeaderSite");
    Thread.sleep(1000);
    List<WebElement> activePassive = headerSiteOfColor.get(1).findElements(By.className("Button"));
    System.out.println(activePassive.size());
    Thread.sleep(1000);
    activePassive.get(1).click();

    Thread.sleep(3000);
    List<WebElement>    Image1 = studiespageOverwiev.findElements(By.className("Image"));
    Thread.sleep(3000);
    Image1.get(0).click();
    Thread.sleep(2000);
    WebElement scaleBarPage = Driver.getDriver().findElementByAccessibilityId("AnalysisPages");
    List< WebElement >image = scaleBarPage.findElements(By.className("Image"));
    System.out.println(image.size());
    image.get(5).click();
}
@Test

    public void Analysis() throws InterruptedException {

    BrowserUtils.waitFor(5);
  //  Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();


    WebElement username =
            Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
    username.sendKeys("fa@cellink.com");
    Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys("Password@123");
    Thread.sleep(1000);
    WebElement  signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
    signin.click();
    Thread.sleep(5000);

    Driver.getDriver().findElementByAccessibilityId("StudiesButton").click();
    BrowserUtils.waitFor(7); List<WebElement> channels = Driver.getDriver().findElementsByName("Cellink.Cellcyte.UI.Modules." +
            "AnalysisModule.ViewModels.ColorChannelAnalysisViewModel");
    WebElement SavizDemo=Driver.getDriver().findElementByName("np test 1");
    SavizDemo.click();
BrowserUtils.waitFor(3);
    System.out.println(Driver.getDriver().findElementsByClassName("MenuItem").size());
    WebElement MenuItem = Driver.getDriver().findElementByClassName("AnalysisWindow");
    BrowserUtils.waitFor(3);
    MenuItem.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
    Driver.getDriver().findElementByName("Analysis").click();


    System.out.println(channels.size());
    channels.get(2).click();
    WebElement wholePage = Driver.getDriver().findElementByClassName("CreateAnalysisSetupView");
    Thread.sleep(2000);
    List<WebElement> options =  wholePage.findElements(By.className("ComboBox"));
    System.out.println(options.size());
    Thread.sleep(2000);
    options.get(0).click();

    List<WebElement> SelectsOptions = options.get(0).findElements(By.className("TextBlock"));
    System.out.println(SelectsOptions.size());
    SelectsOptions.get(3).click();

    Driver.getDriver().findElementByName("Define settings").click();

    WebElement analysisName = wholePage.findElement(By.className("TextBox"));
    Thread.sleep(2000);
    analysisName.sendKeys("adasdasdad");
    Driver.getDriver().findElementByName("Select").click();

    WebElement WholeImages = Driver.getDriver().findElementByClassName("ImageGrid");
   List<WebElement> SelectImages = Driver.getDriver().findElementsByClassName("Image");
    System.out.println(SelectImages.size());
    Thread.sleep(1000);
    SelectImages.get(7).click();
    Thread.sleep(1000);
    SelectImages.get(8).click();

    Driver.getDriver().findElementByName("Select").click();
    WebElement OpenCELLCYTEAnalysis = Driver.getDriver().findElementByName("Open CELLCYTE Analysis");
    Assert.assertFalse(OpenCELLCYTEAnalysis.isEnabled());


}
@Test

    public void ScaleBarPage() throws InterruptedException {


    BrowserUtils.waitFor(5);
  //  Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();


    WebElement username =
            Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
    username.sendKeys("fa@cellink.com");
    Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys("Password@123");
    Thread.sleep(1000);
    WebElement  signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
    signin.click();
    Thread.sleep(10000);

    Driver.getDriver().findElementByAccessibilityId("StudiesButton").click();
    Thread.sleep(2000);
    Driver.getDriver().findElementByName("np test 1").click();
    Thread.sleep(3000);
    WebElement studiespageOverwiev =Driver.getDriver().findElementByAccessibilityId("AnalysisPages");
    Thread.sleep(3000);
    List<WebElement>  Image1 = studiespageOverwiev.findElements(By.className("Image"));
    Thread.sleep(3000);
    Image1.get(0).click();

    WebElement scaleBarPage = Driver.getDriver().findElementByAccessibilityId("AnalysisPages");
    List<WebElement> activePassive =scaleBarPage.findElements(By.className("Button"));
    System.out.println(activePassive.size());
    activePassive.get(8).click();

    List<WebElement> PartTextBox = Driver.getDriver().findElementsByAccessibilityId("PART_TextBox");
    System.out.println(PartTextBox.size());
    PartTextBox.get(2).sendKeys("100");
    PartTextBox.get(3).sendKeys("100");



}
@Test

    public void changeDevicePage() throws InterruptedException {



    BrowserUtils.waitFor(5);
  //  Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();
    Thread.sleep(1000);

    WebElement username =
            Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
    username.sendKeys("fa@cellink.com");
    Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys("Password@123");
    Thread.sleep(1000);
    WebElement  signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
    signin.click();

    Thread.sleep(5000);


    Driver.getDriver().findElementByAccessibilityId("SettingButton").click();
    Driver.getDriver().findElementByName("Change device").click();
    WebElement ChangeDevicePage = Driver.getDriver().findElementByClassName("ChangeDeviceView");

    WebElement ChangeDevicePageWithTabControl = ChangeDevicePage.findElement(By.className("TabControl"));
    Thread.sleep(1000);
    ChangeDevicePageWithTabControl.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
    WebElement SetUpDeviceWithTabControl = ChangeDevicePage.findElement(By.className("TabControl"));
    Thread.sleep(2000);
    SetUpDeviceWithTabControl.sendKeys(Keys.TAB,Keys.TAB,"1911012",Keys.TAB,Keys.TAB,Keys.ENTER);
    Driver.getDriver().findElementByName("Yes").click();
    Driver.getDriver().findElementByName("No").click();
    Driver.getDriver().findElementByAccessibilityId("closeButtonImage").click();



}



@Test

    public void StudyNamePage () throws InterruptedException {


    BrowserUtils.waitFor(6);
  //  Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();
    Thread.sleep(1000);

    WebElement username =
            Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
    username.sendKeys("fa@cellink.com");
    Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys("Password@123");
    Thread.sleep(1000);
    WebElement  signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
    signin.click();

    Thread.sleep(4000);
    List<WebElement> wellplats = Driver.getDriver().findElementsByAccessibilityId("image");

    System.out.println(wellplats.size());
    Actions action = new Actions(Driver.getDriver());

    Thread.sleep(3000);
    action.click(wellplats.get(0)).build().perform();
    Thread.sleep(1000);


    Driver.getDriver().findElementByName("No").click();

    Driver.getDriver().findElementByAccessibilityId("ExperimentNameTextBox").sendKeys("FuatTest");

    Driver.getDriver().findElementByAccessibilityId("VesselTypeCombo").click();
    Thread.sleep(1000);
    List<WebElement> VesselTypeOptions = Driver.getDriver().findElementsByAccessibilityId("VesselTypeOptions");
    System.out.println(VesselTypeOptions.size());
    System.out.println(VesselTypeOptions.get(3).getText());
    VesselTypeOptions.get(1).click();

    Thread.sleep(1000);
    Driver.getDriver().findElementByAccessibilityId("VenderNameCombo").click();
    Thread.sleep(1000);
    Driver.getDriver().findElementByName("Eppendorf").click();

    Driver.getDriver().findElementByAccessibilityId("ModelNumberCombo").click();

    Thread.sleep(1000);
    Driver.getDriver().findElementByName("0030 720.016").click();



    WebElement CellsPage = Driver.getDriver().findElementByAccessibilityId("VesselGridBoard");
    WebElement WellPlate6 = CellsPage.findElement(By.className("Image"));
    Thread.sleep(3000);
    action.moveByOffset(459,110).click().build().perform();
    Thread.sleep(2000);
    WebElement CellPage =Driver.getDriver().findElementByClassName("SetupStudyView");
    Thread.sleep(5000);
    WebElement TabControlCellsPage = CellPage.findElement(By.className("TabControl"));

    TabControlCellsPage.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);




}

@Test

    public void ColorChannel () throws InterruptedException {

    BrowserUtils.waitFor(5);
 //   Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();
    Thread.sleep(1000);

    WebElement username =
            Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
    username.sendKeys("fa@cellink.com");
    Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys("Password@123");
    Thread.sleep(1000);
    WebElement  signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
    signin.click();

    Thread.sleep(4000);
    List<WebElement> wellplats = Driver.getDriver().findElementsByAccessibilityId("image");

    System.out.println(wellplats.size());
    Actions action = new Actions(Driver.getDriver());

    Thread.sleep(3000);
    action.click(wellplats.get(0)).build().perform();
    Thread.sleep(1000);


    Driver.getDriver().findElementByName("No").click();

    Driver.getDriver().findElementByAccessibilityId("ExperimentNameTextBox").sendKeys("FuatTest");

    Driver.getDriver().findElementByAccessibilityId("VesselTypeCombo").click();
    Thread.sleep(1000);
    List<WebElement> VesselTypeOptions = Driver.getDriver().findElementsByAccessibilityId("VesselTypeOptions");
    System.out.println(VesselTypeOptions.size());
    System.out.println(VesselTypeOptions.get(3).getText());
    VesselTypeOptions.get(1).click();

    Thread.sleep(1000);
    Driver.getDriver().findElementByAccessibilityId("VenderNameCombo").click();
    Thread.sleep(1000);
    Driver.getDriver().findElementByName("Eppendorf").click();

    Driver.getDriver().findElementByAccessibilityId("ModelNumberCombo").click();

    Thread.sleep(1000);
    Driver.getDriver().findElementByName("0030 720.016").click();



    WebElement CellsPage = Driver.getDriver().findElementByAccessibilityId("VesselGridBoard");
    WebElement WellPlate6 = CellsPage.findElement(By.className("Image"));
    Thread.sleep(3000);
    action.moveByOffset(459,110).click().build().perform();
    Thread.sleep(2000);
    WebElement CellPage =Driver.getDriver().findElementByClassName("SetupStudyView");
    Thread.sleep(5000);
    WebElement TabControlCellsPage = CellPage.findElement(By.className("TabControl"));

    TabControlCellsPage.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);

    Thread.sleep(2000);

        WebElement EnhouncedContour = Driver.getDriver().findElementByAccessibilityId("EnhancedContourButton");
        WebElement activePassiveButton = EnhouncedContour.findElement(By.className("Button"));
        activePassiveButton.click();

        Thread.sleep(1000);

    WebElement  GreenChannelButton  = Driver.getDriver().findElementByAccessibilityId("GreenChannelButton");
    WebElement activePassiveGreenChannelButton = GreenChannelButton.findElement(By.className("Button"));
    activePassiveGreenChannelButton.click();

    Thread.sleep(2000);

    WebElement  BlueChannelButton  = Driver.getDriver().findElementByAccessibilityId("BlueChannelButton");
    WebElement activePassiveBlueChannelButton = BlueChannelButton.findElement(By.className("Button"));
    activePassiveBlueChannelButton.click();

    Thread.sleep(2000);

    WebElement  RedChannelButton  = Driver.getDriver().findElementByAccessibilityId("RedChannelButton");
    WebElement activePassiveRedChannelButton = RedChannelButton.findElement(By.className("Button"));
    activePassiveRedChannelButton.click();

    WebElement PrewievButton = Driver.getDriver().findElementByAccessibilityId("PreviewButton");
    PrewievButton.click();
    Thread.sleep(2000);
    PrewievButton.click();

    TabControlCellsPage.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,
            Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
    Thread.sleep(2000);



}
@Test

    public void TimeSettings () throws InterruptedException {
    BrowserUtils.waitFor(5);
 //   Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();
    Thread.sleep(1000);

    WebElement username =
            Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
    username.sendKeys("fa@cellink.com");
    Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys("Password@123");
    Thread.sleep(1000);
    WebElement  signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
    signin.click();

    Thread.sleep(4000);
    List<WebElement> wellplats = Driver.getDriver().findElementsByAccessibilityId("image");

    System.out.println(wellplats.size());
    Actions action = new Actions(Driver.getDriver());

    Thread.sleep(3000);
    action.click(wellplats.get(0)).build().perform();
    Thread.sleep(1000);


    Driver.getDriver().findElementByName("No").click();

    Driver.getDriver().findElementByAccessibilityId("ExperimentNameTextBox").sendKeys("FuatTest");

    Driver.getDriver().findElementByAccessibilityId("VesselTypeCombo").click();
    Thread.sleep(1000);
    List<WebElement> VesselTypeOptions = Driver.getDriver().findElementsByAccessibilityId("VesselTypeOptions");
    System.out.println(VesselTypeOptions.size());
    System.out.println(VesselTypeOptions.get(3).getText());
    VesselTypeOptions.get(1).click();

    Thread.sleep(1000);
    Driver.getDriver().findElementByAccessibilityId("VenderNameCombo").click();
    Thread.sleep(1000);
    Driver.getDriver().findElementByName("Eppendorf").click();

    Driver.getDriver().findElementByAccessibilityId("ModelNumberCombo").click();

    Thread.sleep(1000);
    Driver.getDriver().findElementByName("0030 720.016").click();



    WebElement CellsPage = Driver.getDriver().findElementByAccessibilityId("VesselGridBoard");
    WebElement WellPlate6 = CellsPage.findElement(By.className("Image"));
    Thread.sleep(3000);
    action.moveByOffset(459,110).click().build().perform();
    Thread.sleep(2000);
    WebElement CellPage =Driver.getDriver().findElementByClassName("SetupStudyView");
    Thread.sleep(5000);
    WebElement TabControlCellsPage = CellPage.findElement(By.className("TabControl"));

    TabControlCellsPage.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);

    Thread.sleep(2000);

    WebElement EnhouncedContour = Driver.getDriver().findElementByAccessibilityId("EnhancedContourButton");
    WebElement activePassiveButton = EnhouncedContour.findElement(By.className("Button"));
    activePassiveButton.click();

    Thread.sleep(1000);

    WebElement  GreenChannelButton  = Driver.getDriver().findElementByAccessibilityId("GreenChannelButton");
    WebElement activePassiveGreenChannelButton = GreenChannelButton.findElement(By.className("Button"));
    activePassiveGreenChannelButton.click();

    Thread.sleep(2000);

    WebElement  BlueChannelButton  = Driver.getDriver().findElementByAccessibilityId("BlueChannelButton");
    WebElement activePassiveBlueChannelButton = BlueChannelButton.findElement(By.className("Button"));
    activePassiveBlueChannelButton.click();

    Thread.sleep(2000);

    WebElement  RedChannelButton  = Driver.getDriver().findElementByAccessibilityId("RedChannelButton");
    WebElement activePassiveRedChannelButton = RedChannelButton.findElement(By.className("Button"));
    activePassiveRedChannelButton.click();

    WebElement PrewievButton = Driver.getDriver().findElementByAccessibilityId("PreviewButton");
    PrewievButton.click();
    Thread.sleep(2000);
    PrewievButton.click();

    TabControlCellsPage.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,
            Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);

    TabControlCellsPage.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);



}
@Test

    public void StartScan() throws InterruptedException {
    Driver.getDriver();
    Thread.sleep(1000);
//    Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();
    Thread.sleep(1000);

    WebElement username =
            Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
    username.sendKeys("fa@cellink.com");
    Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys("Password@123");
    Thread.sleep(1000);
    WebElement  signin = Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");
    signin.click();

    Thread.sleep(4000);
    List<WebElement> wellplats = Driver.getDriver().findElementsByAccessibilityId("image");

    System.out.println(wellplats.size());
    Actions action = new Actions(Driver.getDriver());

    Thread.sleep(3000);
    action.click(wellplats.get(0)).build().perform();
    Thread.sleep(1000);


    Driver.getDriver().findElementByName("No").click();

    Driver.getDriver().findElementByAccessibilityId("ExperimentNameTextBox").sendKeys("FuatTest");

    Driver.getDriver().findElementByAccessibilityId("VesselTypeCombo").click();
    Thread.sleep(1000);
    List<WebElement> VesselTypeOptions = Driver.getDriver().findElementsByAccessibilityId("VesselTypeOptions");
    System.out.println(VesselTypeOptions.size());
    System.out.println(VesselTypeOptions.get(3).getText());
    VesselTypeOptions.get(1).click();

    Thread.sleep(1000);
    Driver.getDriver().findElementByAccessibilityId("VenderNameCombo").click();
    Thread.sleep(1000);
    Driver.getDriver().findElementByName("Eppendorf").click();

    Driver.getDriver().findElementByAccessibilityId("ModelNumberCombo").click();

    Thread.sleep(1000);
    Driver.getDriver().findElementByName("0030 720.016").click();



    WebElement CellsPage = Driver.getDriver().findElementByAccessibilityId("VesselGridBoard");
    WebElement WellPlate6 = CellsPage.findElement(By.className("Image"));
    Thread.sleep(3000);
    action.moveByOffset(459,110).click().build().perform();
    Thread.sleep(2000);
    WebElement CellPage =Driver.getDriver().findElementByClassName("SetupStudyView");
    Thread.sleep(5000);
    WebElement TabControlCellsPage = CellPage.findElement(By.className("TabControl"));

    TabControlCellsPage.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);

    Thread.sleep(2000);

    WebElement EnhouncedContour = Driver.getDriver().findElementByAccessibilityId("EnhancedContourButton");
    WebElement activePassiveButton = EnhouncedContour.findElement(By.className("Button"));
    activePassiveButton.click();

    Thread.sleep(1000);

    WebElement  GreenChannelButton  = Driver.getDriver().findElementByAccessibilityId("GreenChannelButton");
    WebElement activePassiveGreenChannelButton = GreenChannelButton.findElement(By.className("Button"));
    activePassiveGreenChannelButton.click();

    Thread.sleep(2000);

    WebElement  BlueChannelButton  = Driver.getDriver().findElementByAccessibilityId("BlueChannelButton");
    WebElement activePassiveBlueChannelButton = BlueChannelButton.findElement(By.className("Button"));
    activePassiveBlueChannelButton.click();

    Thread.sleep(2000);

    WebElement  RedChannelButton  = Driver.getDriver().findElementByAccessibilityId("RedChannelButton");
    WebElement activePassiveRedChannelButton = RedChannelButton.findElement(By.className("Button"));
    activePassiveRedChannelButton.click();

    WebElement PrewievButton = Driver.getDriver().findElementByAccessibilityId("PreviewButton");
    PrewievButton.click();
    Thread.sleep(2000);
    PrewievButton.click();

    TabControlCellsPage.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,
            Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);

    TabControlCellsPage.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
    Thread.sleep(3000);
    WebElement startScan = Driver.getDriver().findElementByAccessibilityId("StartStudyButton");
    Thread.sleep(1000);
    startScan.click();

    WebElement No = Driver.getDriver().findElementByName("No");
    No.click();

}
}

