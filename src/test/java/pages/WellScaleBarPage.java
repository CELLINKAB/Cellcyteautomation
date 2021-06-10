package pages;

import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class WellScaleBarPage {



    List<WebElement> activePassive = Driver.getDriver().findElementsByClassName("Button");
    List<WebElement> PartTextBox = Driver.getDriver().findElementsByAccessibilityId("PART_TextBox");

public void scaleBarPage(){

    WebElement scaleBarPage = Driver.getDriver().findElementByAccessibilityId("AnalysisPages");
    scaleBarPage.click();

}


}
