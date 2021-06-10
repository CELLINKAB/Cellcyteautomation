


package pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.Driver;


public class Settings {



    public  void changeDevice(){

        WebElement changedevice = Driver.getDriver().findElementByName("Change device");
        changedevice.click();
    }
    public  void shutDownButton(){

        WebElement shutdownbutton =  Driver.getDriver().findElementByAccessibilityId("ShutDownButton");
        shutdownbutton.click();
    }

    public void name10X(){

        WebElement name10x =  Driver.getDriver().findElementByAccessibilityId("10X");
        name10x.click();
    }
    public  void SystemPlacement(){

        WebElement systemPlacement = Driver.getDriver().findElementByName("System placement");
        systemPlacement.click();
    }
    public  void changeWifi(){

        WebElement changeWifi =Driver.getDriver().findElementByAccessibilityId("ChangeWifi");
        changeWifi.click();
    }
    public  void Select(){

        WebElement select= Driver.getDriver().findElementByName("Select");
        select.click();
    }
    public void ChangeStandartVesse(){

        WebElement changestandartvesse =  Driver.getDriver().findElementByAccessibilityId("ChangeStandardVessel");
        changestandartvesse.click();
    }
    public  void DateTimeFormat (){

        WebElement DATETIMEFORMAT =   Driver.getDriver().findElementByName("Date-time format");
        DATETIMEFORMAT.click();
    }
    public  void  closeButton(){

        WebElement CloseButton=  Driver.getDriver().findElementByAccessibilityId("closeButtonImage");
        CloseButton.click();
    }
    public  void  Analysis(){

     WebElement   analysis = Driver.getDriver().findElementByName("Analysis");
        analysis.click();

    }

    public void SoftwareVersionIsDisplayed(){

        WebElement SoftwareVersion = Driver.getDriver().findElementByAccessibilityId("SoftwareVersionName");

        Assert.assertTrue(SoftwareVersion.isDisplayed());
        System.out.println(SoftwareVersion.getAttribute("Name"));

    }

    public void LocalStorage(){

        WebElement LocalStorage = Driver.getDriver().findElementByName("Local storage");

        LocalStorage.click();


        }


    public void ExternalDisk(){

        WebElement ExternalDisk = Driver.getDriver().findElementByName("External disk");

        ExternalDisk.click();


    }
public void DateFormatID(){

        WebElement DateFormatID = Driver.getDriver().findElementByAccessibilityId("DateFormatID");
        DateFormatID.click();

}

    public void TimeFormatID(){

        WebElement TimeFormatID = Driver.getDriver().findElementByAccessibilityId("TimeFormatID");
        TimeFormatID.click();

    }

    public void HeartOSVersion(){

        WebElement HeartOSVersion = Driver.getDriver().findElementByAccessibilityId("HeartOSVersion");
        HeartOSVersion.click();

    }


}

