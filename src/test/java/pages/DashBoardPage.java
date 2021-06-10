package pages;


import org.openqa.selenium.WebElement;
import utilities.Driver;


public class DashBoardPage {





    public  void HomeButton(){

        WebElement homebutton =Driver.getDriver().findElementByAccessibilityId("HomeTabItemAutomationPropertiesAutomationId");
        homebutton.click();
    }

    public  void settings(){

        WebElement settings = Driver.getDriver().findElementByAccessibilityId("SettingButton");
        settings.click();
    }
    public  void studies(){

        WebElement Studies = Driver.getDriver().findElementByAccessibilityId("StudiesButton");
        Studies.click();

    }

}