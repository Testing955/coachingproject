package ListnersandExtentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
public ExtentSparkReporter sparkReporter;
public ExtentReports extent;
public ExtentTest test;	
public void onStart(ITestContext context)
{
sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html"); 
sparkReporter.config().setDocumentTitle("Automation Title");
sparkReporter.config().setReportName("Prince Gaurav");
sparkReporter.config().setTheme(Theme.DARK);
extent = new ExtentReports();
extent.attachReporter(sparkReporter);
extent.setSystemInfo("computer","local");
extent.setSystemInfo("Environment","QA");
extent.setSystemInfo("Tester name", "Prince Gaurav");
extent.setSystemInfo("Type of tester","Automation testing");
extent.setSystemInfo("os", "window 10");
extent.setSystemInfo("Browser name","chrome,firefox,edge");
}
public void onTestSuccess(ITestResult result)
{
test = extent.createTest(result.getName());
test.log(Status.PASS,"Test case is passded: "+result.getName());
}
public void onTestFailure(ITestResult result)
{
test = extent.createTest(result.getName());
test.log(Status.FAIL,"Test case failed: "+result.getThrowable());
}
public void onTestSkipped(ITestResult result)
{
test = extent.createTest(result.getName());
test.log(Status.SKIP,"Test case is skipped: " + result.getName());
}
public void onFinish(ITestContext context)
{
extent.flush();
}

}
