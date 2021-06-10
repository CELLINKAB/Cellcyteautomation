package utilities;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class BrowserUtils {

    /**
     * take ss
     *
     * @param name take a name of a test and returns a path to ss takes
     */
    public static String getScreenshot(String name) throws IOException {

        // name the ss with the current date time to avoid duplicate name
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        //TakesScreenshot -> interface from selenium which takes ss
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();

        File source = ts.getScreenshotAs((OutputType.FILE));

        // full path for the ss location
        String target = System.getProperty("user.dir") + "\\test-output\\Screenshots\\" + name + date + ".png";

        File finalDestination = new File(target);

        //save the ss to the given path
        FileUtils.copyFile(source, finalDestination);

        return target;
    }

    /**
     * Performs a pause with Thread.sleep
     *
     * @param seconds
     */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    }

