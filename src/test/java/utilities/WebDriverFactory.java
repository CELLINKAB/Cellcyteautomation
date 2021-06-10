package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {
    //write a static method that takes a string parameter
    //based on value of parameter
    //the method must return chromedriver or firefoxdriver object
    //name : getDriver

    public static WebDriver getDriver(String browserType){

        WebDriver driver=null;

        switch (browserType.toLowerCase()){
            case "chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
            case "fireworks":
                WebDriverManager.firefoxdriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

        }

        return driver;
    }

}
