package com.utility;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Listeners implements ITestListener  
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest childExtentLogger;
	public static ExtentTest parentExtentLogger;

	public WebDriver driver;
	
	public void onTestStart(ITestResult result) 
	{


	}

	public void onTestSuccess(ITestResult result)
	{

		//		String newFileName = new SimpleDateFormat("YYYYMMMddHHmmss").format(new Date(10));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");		
		String timestamp = sdf.format(new Date());
		String projectPath =System.getProperty("user.dir");
		String screenShotPath;
		try
		{
			TakesScreenshot screenShot =(TakesScreenshot) driver;
			File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
			screenShotPath = projectPath + File.separator + "screenshot" + File.separator + timestamp + ".jpg";
			File targetPath = new File(screenShotPath);
			FileUtils.copyFile(sourceFile, targetPath);
			htmlReporter = new ExtentHtmlReporter(projectPath+"//testReports//"+timestamp+".html"); 
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			parentExtentLogger = extent.createTest("prepaid Recharge");
			childExtentLogger = parentExtentLogger.createNode("Senario");
			childExtentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
			childExtentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
			extent.flush();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}	

	public void onTestFailure(ITestResult result) 
	{
		//		String newFileName = new SimpleDateFormat("YYYYMMMddHHmmss").format(new Date(10));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");		
		String timestamp = sdf.format(new Date());
		String projectPath =System.getProperty("user.dir");
		String screenShotPath;
		try
		{
			TakesScreenshot screenShot =(TakesScreenshot) driver;
			File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
			screenShotPath = projectPath + File.separator + "screenshot" + File.separator + timestamp + ".jpg";
			File targetPath = new File(screenShotPath);
			FileUtils.copyFile(sourceFile, targetPath);

			htmlReporter = new ExtentHtmlReporter(projectPath+"//failesTCScreenshots//"+timestamp+".html"); 
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			parentExtentLogger = extent.createTest("prepaid Recharge");
			childExtentLogger = parentExtentLogger.createNode("Senario");
			childExtentLogger.log(Status.FAIL,MarkupHelper.createLabel(" - Test Case Faild", ExtentColor.RED));
			childExtentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
			extent.flush();
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}

	}

	public void onTestSkipped(ITestResult result) 
	{
		//		String newFileName = new SimpleDateFormat("YYYYMMMddHHmmss").format(new Date(10));
		String projectPath =System.getProperty("user.dir");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");		
		String timestamp = sdf.format(new Date());		

		String screenShotPath;
		try
		{
			TakesScreenshot screenShot =(TakesScreenshot) driver;
			File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
			screenShotPath = projectPath + File.separator + "screenshot" + File.separator + timestamp + ".jpg";
			File targetPath = new File(screenShotPath);
			FileUtils.copyFile(sourceFile, targetPath);

			htmlReporter = new ExtentHtmlReporter(projectPath+"//testReports//"+timestamp+".html"); 
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			parentExtentLogger = extent.createTest("prepaid Recharge");
			childExtentLogger = parentExtentLogger.createNode("Senario");
			childExtentLogger.log(Status.SKIP,MarkupHelper.createLabel(" - Test Case Skip", ExtentColor.GREY));
			childExtentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
			extent.flush();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}


}