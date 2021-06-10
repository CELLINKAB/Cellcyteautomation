package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.TestBase;

import java.io.IOException;


public class Listeners extends TestBase implements ITestListener {


    ExtentReports extent = ExtentReporterNG.extentReportGenerator();
    ExtentTest test;


    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test pass");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //take the screenshot and return location of screenshot
        String screenShotPath = null;
        try {
            screenShotPath = BrowserUtils.getScreenshot(result.getMethod().getMethodName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //add your screenshot to your report
        test.log(Status.INFO, MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
        //capture the exception and put inside the report
        test.fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        test.log(Status.FAIL, "TimeOut Exception observed");
    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
        //this is when the report actually created
        extent.flush();
    }
}



