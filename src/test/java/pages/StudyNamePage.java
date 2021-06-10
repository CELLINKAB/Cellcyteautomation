package pages;

import org.openqa.selenium.WebElement;
import utilities.Driver;

public class StudyNamePage {

  //  public WebElement SelectType = Driver.getDriver().findElementByAccessibilityId("VesselTypeCombo") ;
    //public List< WebElement> TypeOptions = Driver.getDriver().findElementsByAccessibilityId("VesselTypeOptions") ;
  //  public WebElement VenderName = Driver.getDriver().findElementByAccessibilityId("VenderNameCombo") ;
  //  public WebElement selectVenderName = Driver.getDriver().findElementByName("") ;
   // public WebElement ModelNumberCombo = Driver.getDriver().findElementByAccessibilityId("ModelNumberCombo") ;
  //  public  WebElement SelectModelNumber = Driver.getDriver().findElementByAccessibilityId("itShouldBeNUMber") ;
//    public WebElement images = Driver.getDriver().findElementByAccessibilityId("NoPostionsCombo");
 //   public List< WebElement> selectImages = Driver.getDriver().findElementsByAccessibilityId("PositionOptions");
//  List   < WebElement >venderNameOtherOptions = Driver.getDriver().findElementsByClassName("ListBoxItem");
     public void SelectType(){
        WebElement SelectType = Driver.getDriver().findElementByAccessibilityId("VesselTypeCombo");
        SelectType.click();

    }

    public  void VenderName(){
    WebElement VenderName = Driver.getDriver().findElementByAccessibilityId("VenderNameCombo") ;
    VenderName.click();


}

    public  void selectVenderName(String venderName){
        WebElement selectVenderName = Driver.getDriver().findElementByName(""+venderName+"") ;
        selectVenderName.click();


    }
    public  void images(){
        WebElement images = Driver.getDriver().findElementByAccessibilityId("NoPostionsCombo") ;
        images.click();


    }

    public  void ModelNumberCombo(){
        WebElement ModelNumberCombo = Driver.getDriver().findElementByAccessibilityId("ModelNumberCombo") ;
        ModelNumberCombo.click();


    }

    public void SelectModelNumber(String number){

        WebElement SelectModelNumber = Driver.getDriver().findElementByName(""+number+"") ;
        SelectModelNumber.click();


    }
}
