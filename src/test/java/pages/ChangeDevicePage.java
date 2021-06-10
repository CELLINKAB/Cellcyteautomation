package pages;

import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class ChangeDevicePage {


    List<WebElement> ChangeDevicePageWithTabControl = Driver.getDriver().findElementsByClassName("TabControl");


public void ChangeDevicePage(){

    WebElement ChangeDevicePage = Driver.getDriver().findElementByClassName("ChangeDeviceView");
   ChangeDevicePage.click();

}
}
