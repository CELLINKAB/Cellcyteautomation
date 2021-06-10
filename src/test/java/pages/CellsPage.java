package pages;

import org.openqa.selenium.WebElement;
import utilities.Driver;

public class CellsPage {




    public void CellsPage(){

        WebElement CellsPage = Driver.getDriver().findElementByAccessibilityId("VesselGridBoard");
        CellsPage.click();

    }

}
