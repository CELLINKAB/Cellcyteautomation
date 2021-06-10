package pages;

import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public  class HomePage  {

    public List<WebElement>        slot = Driver.getDriver().findElementsByAccessibilityId("image");

   public void slotNumber(int slotNumber){

       switch (slotNumber){

           case 1 : WebElement wellPlatRightUp = slot.get(0);
           wellPlatRightUp.click();
           break;
           case 2 : WebElement wellPlatRightMiddle = slot.get(1);
           wellPlatRightMiddle.click();
           break;
           case 3 : WebElement wellPlatRightDown = slot.get(2);
           wellPlatRightDown.click();
           break;
           case 4 : WebElement wellPlatLeftUp  = slot.get(3);
           wellPlatLeftUp.click();
           break;
           case 5 : WebElement wellPlatLeftMiddle = slot.get(4);
           wellPlatLeftMiddle.click();
           break;
           case 6 : WebElement wellPlatLeftDown  = slot.get(5);
           wellPlatLeftDown.click();
           break;


       }
   }

  //  public WebElement      wellPlatRightUp = slot.get(0);
 //  public WebElement       wellPlatRightMiddle = slot.get(1);
 //  public WebElement       wellPlatRightDown =slot.get(2);
  // public WebElement       wellPlatLeftUp = slot.get(3);
  // public WebElement       wellPlatLeftMiddle= slot.get(4);
 //  public WebElement       wellPlatLeftDown = slot.get(5);

    public void logOut() throws InterruptedException {

        WebElement LogOutMenu = Driver.getDriver().findElementByClassName("MenuItem");
        LogOutMenu.click();
        Thread.sleep(2000);
        WebElement signOut = Driver.getDriver().findElementByAccessibilityId("SignOutMenuItemAutomationPropertiesAutomationId");
        signOut.click();

    }
    public void closeButton() throws InterruptedException {
        WebElement closeButton = Driver.getDriver().findElementByAccessibilityId("closeButtonImage");
        closeButton.click();
        Thread.sleep(2000);
        WebElement No = Driver.getDriver().findElementByName("No");
        No.click();


    }
    public void closeButtonOnly(){
        WebElement closeButton = Driver.getDriver().findElementByAccessibilityId("closeButtonImage");
        closeButton.click();

    }


public void getNoButton(){

    WebElement no = Driver.getDriver().findElementByName("No");
    no.click();
}
    public void getYesButton(){

        WebElement yes = Driver.getDriver().findElementByName("Yes");
        yes.click();
    }

 //   public WebElement   no = Driver.getDriver().findElementByName("no");
 //   public WebElement    yes = Driver.getDriver().findElementByName("yes");




}
