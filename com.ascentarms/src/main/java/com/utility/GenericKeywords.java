package com.utility;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericKeywords extends ApplicationKeywords
{
	public static WebDriver driver;
	private String value;
	private int index;

	public GenericKeywords(String classname) {
		System.out.println("GenericKeywords class Name: " + classname);
		logger =Logger.getLogger(classname);
		PropertyConfigurator.configure(System.getProperty("user.dir") + "/ConfigProperties/log4j.properties");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hhmmss");
		System.setProperty("current.date", classname + "_" + dateFormat.format(new Date()));
	}

	public void openBrowser(String browserName)

	{


		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();

		}
		else if ( browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();

		}
		else if ( browserName.equalsIgnoreCase("ie"))
		{
			driver = new InternetExplorerDriver();

		}
		else if ( browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();

		}
	}
	public void openUrl(String url)
	{
		driver.get(url);
	}



	public static WebElement waitForElementVisible(WebDriver driver, WebElement element, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public WebElement elementFind(WebElement element) {

		logger.info("find element action is started");


		try {
			logger.info("find element action is complted and avialable");
		} catch (Throwable e) {
			logger.info("element is not found:" + e);
		}

		return element;

	}







	public void enterRandomData(WebElement element, String baseData) {
		logger.info("SendKeys with random suffix is started");
		highlightElement(element);

		// Randomly choose to add letters or numbers
		boolean useLetters = new Random().nextBoolean();

		String finalData = baseData + generateRandomSuffix(2, useLetters);
		elementFind(element).clear();
		elementFind(element).sendKeys(finalData);

		logger.info("Entered value: " + finalData);
		logger.info("SendKeys with random suffix is completed");
	}

	private String generateRandomSuffix(int length, boolean useLetters) {
		String characters = useLetters ? "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz" : "0123456789";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			sb.append(characters.charAt(random.nextInt(characters.length())));
		}
		return sb.toString();
	}

	public void enterRandomMailIdUsingTimeStamp(WebElement element, String fullEmail) {
		logger.info("SendKeys with date email is started");
		highlightElement(element);

		// Validate and split email
		int atIndex = fullEmail.indexOf("@");
		if (atIndex == -1) {
			throw new IllegalArgumentException("Invalid email format: missing '@' in " + fullEmail);
		}

		String base = fullEmail.substring(0, atIndex);
		String domain = fullEmail.substring(atIndex);  // Includes '@'

		// Generate date in ddMMyy format
		String updateTimeAndDate = new SimpleDateFormat("ddMMyy").format(new Date());

		// Final email
		String finalEmail = base + updateTimeAndDate + domain;

		elementFind(element).clear();
		elementFind(element).sendKeys(finalEmail);

		logger.info("Entered email: " + finalEmail);
		logger.info("SendKeys with date email is completed");
	}


	public void click(WebElement element)
	{
		logger.info("click action is started");
		highlightElement(element);
		elementFind(element).click();
		logger.info("Click action is completed");
	}


	public void highlightElement(WebElement element) 
	{
		logger.info("highlightElement action is started");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		element = elementFind(element);
		executor.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
		System.out.println("highlight finished");
		logger.info("highlightElement action is Completed");

	}
	public void clearEnter(WebElement element, String data) 
	{
		highlightElement(element);
		element = elementFind(element);
		if (element.isDisplayed() == true) {
			if (element.isEnabled() == true) {
				element.clear();
				element.sendKeys(data);

			}
		}
		logger.info("clear and enter data is : "+data);
		logger.info("clear and enter action is completed");
	}

	public void selectDropdown(WebElement element, String data)
	{
		Select s1 = new Select(element);
		s1.selectByVisibleText(data);
	}                            
	public void selectByIndexDropdown(WebElement element, String dropdownValue)
	{
		Select s1 = new Select(element);
		s1.selectByIndex(index);

	}
	public void selectByValueDropdown(WebElement element, String dropdownValue)
	{
		Select s1 = new Select(element);
		s1.selectByValue(value);

	}
	public static String TimeStampFolder() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd/");
		String format = dateFormat.format(new Date());

		return format;

	}

	public static String TimeStamp() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
		String format = dateFormat.format(new Date());

		return format;

	}

	public void quitWindow() 
	{
		driver.quit();

	}
}
