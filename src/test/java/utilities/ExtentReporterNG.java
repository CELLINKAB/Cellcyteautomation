package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReporterNG {

    static ExtentReports extent;

    public static ExtentReports extentReportGenerator() {
        String projectPath = System.getProperty("user.dir");
        String path;

        path = projectPath + "/test-output/report.html";

        //initialize the html reporter with the report path
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        extent = new ExtentReports();

        //attach the html report to report object
        extent.attachReporter(reporter);

        //title in report
        reporter.config().setReportName("Test Results");

//set environment information

        extent.setSystemInfo("Company Name", "Cellink ");


        extent.setSystemInfo("OS", System.getProperty("os.name"));

        extent.setSystemInfo("Project Name","CellCyte Studio");

        return extent;
    }
}
