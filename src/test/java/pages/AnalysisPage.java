package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class AnalysisPage {

List<WebElement> channels = Driver.getDriver().findElementsByName("Cellink.Cellcyte.UI.Modules." +
       "AnalysisModule.ViewModels.ColorChannelAnalysisViewModel");



   // List<WebElement> options =  Driver.getDriver().findElements(By.className("ComboBox"));
   // List<WebElement> SelectsOptions = options.get(0).findElements(By.className("TextBlock"));
  //  List<WebElement> SelectImages = Driver.getDriver().findElementsByClassName("Image");




    public  void EnhouncedCounter(){

        WebElement EnhouncedCounter = channels.get(1);
        EnhouncedCounter.click();

    }


    public  void wholePage(){

        WebElement wholePage = Driver.getDriver().findElementByClassName("CreateAnalysisSetupView");
        wholePage.click();

    }
    public  void loadSettings(){

        WebElement loadSettings = Driver.getDriver().findElementByName("Load settings");
        loadSettings.click();

    }
    public  void defineSettings(){

        WebElement defineSettings = Driver.getDriver().findElementByName("Define settings");
        defineSettings.click();

    }

    public  void analysisName(String anyName){

        WebElement analysisName = Driver.getDriver().findElementByClassName("CreateAnalysisSetupView").findElement(By.className("TextBox"));

        analysisName.sendKeys(anyName);

    }

    public  void Select(){

        WebElement Select =Driver.getDriver().findElementByName("Select");
        Select.click();

    }
    public  void WholeImages(){

    WebElement WholeImages  = Driver.getDriver().findElementByClassName("ImageGrid");
    WholeImages.click();
}
    public  void OpenCELLCYTEAnalysis(){

        WebElement OpenCELLCYTEAnalysis  = Driver.getDriver().findElementByClassName("Open CELLCYTE Analysis");
        OpenCELLCYTEAnalysis.click();
    }

}
