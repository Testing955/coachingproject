package ListnersandExtentReports;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistners implements ITestListener
{
public void onTestStart(ITestResult result) 
{
System.out.println("Test is started......");
}
public void onTestSuccess(ITestResult result) 
{
	System.out.println("Test is success......");
}
public void onTestFailure(ITestResult result) 
{
	System.out.println("Test is failure......");
}  
public void onTestSkipped(ITestResult result) 
{
	System.out.println("Test is skipped......");
}
public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
{
	System.out.println("Test is failed......");
}
}
