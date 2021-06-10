package utilities;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class Driver {

    // private static final ThreadLocal<WindowsDriver> driverPool = new ThreadLocal<>();


    private static WindowsDriver<WebElement> driver;
    private static URL driverUrl;

    static {
        try {
            driverUrl = new URL("http://127.0.0.1:4723");
        } catch (
                MalformedURLException e
        ) {
            e.printStackTrace();
        }
    }



    public static WindowsDriver getDriver() {

        if (driver != null) {

            return driver;
        }


        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app", "Root");

      //  cap.setCapability("app", "C:\\Program Files\\CELLINK\\CELLINK CELLCYTE Studio\\Cellink.Cellcyte.UI.exe");
      //  cap.setCapability("platformName", "Windows");
     //   cap.setCapability("deviceName", "WindowsPC");
        driver = new WindowsDriver<>(driverUrl, cap);


        return driver;




    }






}