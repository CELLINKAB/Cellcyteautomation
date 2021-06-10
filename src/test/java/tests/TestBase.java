package tests;


import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import utilities.Driver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class TestBase {


    WindowsDriver  driver = null;




    @BeforeClass

    public  void beforeTest() throws MalformedURLException {


try {

            Driver.getDriver().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
            DesiredCapabilities cap = new DesiredCapabilities();
          //    cap.setCapability("app", "Root");
            //Cellink.Cellcyte.UI.exe
            //C:\Program Files\CELLINK\CELLINK CELLCYTE Studio\Cellink.Cellcyte.UI.exe
            cap.setCapability("app", "C:\\Program Files\\CELLINK\\CELLINK CELLCYTE Studio\\Cellink.Cellcyte.UI.exe");
        //    cap.setCapability("platformName", "Windows");
      //      cap.setCapability("deviceName", "WindowsPC");

          driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
} catch (Exception e) {

    e.printStackTrace();
}
    }

    @AfterClass

    public void afterMethod() throws IOException {


   //   WebElement titleBar = Driver.getDriver().findElementByAccessibilityId("TitleBar");

 //   WebElement close = titleBar.findElement(By.name("Close"));
 //   close.click();

    driver.quit();

    Runtime.getRuntime().exec("taskkill /F /IM Cellink.Cellcyte.UI.exe");
    }


}
//Cellink.Cellcyte.AnalysisService.exe
//Cellink.Cellcyte.UI.exe








