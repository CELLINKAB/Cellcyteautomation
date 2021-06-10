package pages;

import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class StudiesPage {




    public  List<WebElement> delete   = Driver.getDriver().findElementsByName("Item: " +
                     "Cellink.Cellcyte.UI.ViewModels.MainViews.ExperimentModel, Column Display Index: 11");

    public void studiesName(String studiesName){

        BrowserUtils.waitFor(3);
         WebElement studiesname = Driver.getDriver().findElementByName(""+studiesName+"");

        studiesname.click();
}
    public void ArchiveStatusIconView (){


              WebElement ArchiveStatusIconView =Driver.getDriver().findElementByClassName("ArchiveStatusIconView");

              ArchiveStatusIconView.click();

}


}
