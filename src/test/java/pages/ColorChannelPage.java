package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class ColorChannelPage {



    public void enhouncedContour(){

        WebElement EnhouncedContour = Driver.getDriver().findElementByAccessibilityId("EnhancedContourButton");
        WebElement activePassiveButton = EnhouncedContour.findElement(By.className("Button"));
        activePassiveButton.click();


    }

    public void GreenChannelButton(){


        WebElement  GreenChannelButton  = Driver.getDriver().findElementByAccessibilityId("GreenChannelButton");
        WebElement activePassiveGreenChannelButton = GreenChannelButton.findElement(By.className("Button"));
        activePassiveGreenChannelButton.click();


    }

    public void BlueChannelButton(){



        WebElement  BlueChannelButton  = Driver.getDriver().findElementByAccessibilityId("BlueChannelButton");
        WebElement activePassiveBlueChannelButton = BlueChannelButton.findElement(By.className("Button"));
        activePassiveBlueChannelButton.click();
    }

    public void RedChannelButton(){


        WebElement  RedChannelButton  = Driver.getDriver().findElementByAccessibilityId("RedChannelButton");
        WebElement activePassiveRedChannelButton = RedChannelButton.findElement(By.className("Button"));
        activePassiveRedChannelButton.click();

    }







}
