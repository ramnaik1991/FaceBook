package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Factory {

	private static WebDriver driver;
	
	public static WebDriver getDriver(){
		
		if (driver==null) {
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Chrome brower driver opened");
		}
		return driver;
	}
	
	public static void quitDriver() {
		if (driver!=null) {
			driver.quit();
			driver=null;
		}
	}

	

}
