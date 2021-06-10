package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.ExcelUtil;


public class DataDrivenTesting extends TestBase  {
    ExcelUtil excelFile = new ExcelUtil("src/test/resources/example.xlsx", "Ark1");

    @DataProvider
    public Object[][] readExcel() throws InterruptedException {

        //Thread.sleep(5000);
        System.out.println(excelFile.columnCount());
        System.out.println(excelFile.rowCount());

       // System.out.println(excelFile.getColumnsNames());
    String [] [] data = excelFile.getDataArrayWithoutFirstRow();
return data;
    }

    @Test(dataProvider = "readExcel")

    public void readExcelFile(String username,String password) throws InterruptedException {
        BrowserUtils.waitFor(4);
        LoginPage LG = new LoginPage();
     //   LG.LoginIn(username,password);

        Driver.getDriver();

   //     Driver.getDriver().findElementByAccessibilityId("SignInMenuItemAutomationPropertiesAutomationId").click();
        Thread.sleep(1000);

        WebElement Username = Driver.getDriver().findElementByAccessibilityId("UsernameTextBoxAutomationPropertiesAutomationId");
        Username.sendKeys(""+username+"");
        Driver.getDriver().findElementByAccessibilityId("PasswordPasswordBoxAutomationPropertiesAutomationId").sendKeys(""+password+"");
        Thread.sleep(1000);
        WebElement signin=  Driver.getDriver().findElementByAccessibilityId("SignInButtonAutomationPropertiesAutomationId");

        signin.click();

        System.out.println("username = " + username);

        System.out.println("password = " + password);

    //    WebElement failLogIn = Driver.getDriver().findElementByName("Login failed");
        BrowserUtils.waitFor(5);
        Assert.assertTrue(Driver.getDriver().findElementByName("Login failed").isDisplayed());

    }
}