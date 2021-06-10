package pages;

import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class StudiesPageOverwiev {

    public List<WebElement> percents = Driver.getDriver().findElementsByAccessibilityId("PART_TextBox");
  public  List<WebElement> activePassive = Driver.getDriver().findElementsByClassName("Button");
  public List<WebElement> headerSiteOfColor = Driver.getDriver().findElementsByAccessibilityId("HeaderSite");


    public void studiespageOverwiev (){

        WebElement studiespageOverwiev = Driver.getDriver().findElementByAccessibilityId("AnalysisPages");
        studiespageOverwiev.click();

    }

    public void analysis (){

        WebElement analysis =Driver.getDriver().findElementByName("Analysis");
        analysis.click();

    }
    public void  EnhancedContour(){

        WebElement EnhancedContour =Driver.getDriver().findElementByName("Enhanced contour");
        EnhancedContour.click();

    }
    public void RedChannel (){

        WebElement RedChannel =Driver.getDriver().findElementByName("Red channel");
        RedChannel.click();
    }
    public void GreenChannel (){

        WebElement GreenChannel =Driver.getDriver().findElementByName("Green channel");
        GreenChannel.click();
    }
    public void BlueChannel (){

        WebElement BlueChannel =Driver.getDriver().findElementByName("Blue channel");
        BlueChannel.click();
    }


}
