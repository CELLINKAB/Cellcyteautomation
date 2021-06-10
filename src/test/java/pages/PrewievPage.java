package pages;

import org.openqa.selenium.WebElement;
import utilities.Driver;

public class PrewievPage {

   public void prewievButton(){

       WebElement 	PreviewButton = Driver.getDriver().findElementByAccessibilityId("PreviewButton");
       PreviewButton.click();
   }


}
