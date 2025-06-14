package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.SignUp;
import utilites.Driver_Factory;

public class Singup_Test {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = Driver_Factory.getDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
	}

	@Test
	public void enterfirstname() {
		SignUp sign = new SignUp(driver);
		sign.enterfirstname("ram");
	}

	@Test
	public void entersurname() {
		SignUp surn = new SignUp(driver);
		surn.enterSurname("naik");
	}

	@Test
	public void SelectDateofbirth() {
		SignUp Dateofbirthday = new SignUp(driver);
		Dateofbirthday.SelectDateofBirthd("30");
	}

	@Test
	public void SelectDateofbirthmon() {
		SignUp Dateofbirthmon = new SignUp(driver);
		Dateofbirthmon.SelectDateofBirthd("Dec");
	}

	@Test
	public void SelectDateofbirthyr() {
		SignUp Dateofbirthyr = new SignUp(driver);
		Dateofbirthyr.SelectDateofBirthd("1992");

	}

	@Test
	public void clickGender() {
		SignUp Genderbutn = new SignUp(driver);
		Genderbutn.clickGender();
	}

	@Test
	public void enterMobileNuorEmailid() {
		SignUp enterMoborMai = new SignUp(driver);
		enterMoborMai.enterMobileNuorEmailid();
	}

	@Test
	public void EnterPassword() {
		SignUp enterpass = new SignUp(driver);
		enterpass.password();

	}

	@Test
	public void clickSignUpButton() {
		SignUp sign = new SignUp(driver);
		sign.clickonsinup();
	}

	@Test
	public void runSignupTest() {
		setup();
		enterfirstname();
		entersurname();

	}
	@AfterMethod
	public void teardown() {
		Driver_Factory.getDriver();
	}

}
