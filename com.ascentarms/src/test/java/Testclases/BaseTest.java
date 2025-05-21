package Testclases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.utility.ApplicationKeywords;
import com.utility.GenericKeywords;
import com.utility.ReadConfigFile;

	public class BaseTest extends ApplicationKeywords
	{
		public BaseTest() throws IOException
		{
//			super();
		}


		ReadConfigFile readconf=new ReadConfigFile();

		public String browser=readconf.openBrowser();
		public String url=readconf.getUrl();
		public static WebDriver driver;
		public static ExtentHtmlReporter htmlReporter;
		public static ExtentReports extent;
		public static ExtentTest childExtentLogger;
		public static ExtentTest parentExtentLogger;

		@BeforeClass
		public  void setUp() throws Throwable
		{	
			GenericKeywords keyWords=new GenericKeywords(browser);
			keyWords.openBrowser(browser);
			driver= GenericKeywords.driver;
			keyWords.openUrl(url);
			driver.manage().window().maximize();	
		}
		@AfterMethod
		public void CaptureScreenshot() throws IOException
		{
			String filename = new SimpleDateFormat("YYYYMMMddHHmmss").format(new Date(10));
			String path=System.getProperty("user.dir");
			System.out.println(path);
			TakesScreenshot shot= (TakesScreenshot)driver;
			File srcShot=shot.getScreenshotAs(OutputType.FILE);
			File destination=new File(path+"//screenshots//"+filename+".jpeg");
			FileUtils.copyFile(srcShot,destination);
		}

		@AfterClass
		public void testReports() throws IOException
		{
			String newFileName = new SimpleDateFormat("YYYYMMMddHHmmss").format(new Date(10));
			String projectPath =System.getProperty("user.dir");

			TakesScreenshot screenShot =(TakesScreenshot) driver;
			File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
			String screenShotPath = projectPath+"\\screenshot\\"+newFileName+".jpg";
			File targetPath = new File(screenShotPath);
			FileUtils.copyFile(sourceFile, targetPath);
			htmlReporter = new ExtentHtmlReporter(projectPath+"//testReports//"+newFileName+".html"); 
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			parentExtentLogger = extent.createTest("prepaid Recharge");
			childExtentLogger = parentExtentLogger.createNode("Senario");
			childExtentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
			//	childExtentLogger.log(Status.FAIL,MarkupHelper.createLabel(" - Test Case Failed", ExtentColor.RED));
			//	childExtentLogger.log(Status.SKIP,MarkupHelper.createLabel(" - Test Case Skip", ExtentColor.GREY));
			childExtentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
			extent.flush();

		}
		//@AfterTest
		public void tearDown() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.quit();
		}


	}


