package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Driver_Factory {

	protected static WebDriver driver;

	public ExtentReports extent;
	public ExtentTest test;

	@BeforeSuite
	public void setupReport() {
		extent = ExtentManager.createInstance();
	}

	@BeforeTest
	public static WebDriver getDriver() {

		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Chrome brower driver opened");
		}
		return driver;
	}

	@AfterSuite
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	@AfterSuite
	public void flushReport() {
		extent.flush();
	}
}
