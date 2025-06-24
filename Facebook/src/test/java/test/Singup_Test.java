package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.SignUp;
import utilites.Driver_Factory;

public class Singup_Test extends Driver_Factory {

	@Test
	public void setup() {
		driver = Driver_Factory.getDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
	}

	@Test
	public void tc_01_singupform() {
		test = extent.createTest("TC01 Enter singup page");
		SignUp sign = new SignUp(driver);
		sign.enterfirstname("ram");
		sign.enterSurname("naik");
		sign.enterMobileNuorEmailid("7799");
	}

	@Test
	public void tc_02_validupform() {
		test = extent.createTest("TC02 Enter valid page");
		SignUp sign = new SignUp(driver);
		sign.enterfirstname("ram");
		sign.enterSurname("naik");
		sign.enterMobileNuorEmailid("7799");
	}

	@Test
	public void tc_03_selectDOB() {
		test = extent.createTest("TC03 Select the DoB");
		SignUp sign = new SignUp(driver);
		sign.SelectDateofBirthd("15");
		sign.selectDateOfBirthM("Nov");
		sign.selectDateOfBirth("2023");
	}

	@Test
	public void tc_04_selectGender() {
		test = extent.createTest("TC04 Select the Gender");
		SignUp sign = new SignUp(driver);
		sign.clickGender();
	}

	@Test
	public void enterMobilenorEmailid() {
		test = extent.createTest("TC05 Enter the mobnoEmail");
		SignUp sign = new SignUp(driver);
		sign.enterMobileNuorEmailid("Test@gmail.com");
	}

	@Test
	public void tc_03_enterPassword() {
		test = extent.createTest("TC03 Enter password");
		SignUp sign = new SignUp(driver);
		sign.password("Test@123");
	}

	@Test
	public void tc_06_clickSignUp() {
		test = extent.createTest("TC06 Click on Sign Up button");
		SignUp sign = new SignUp(driver);
		sign.clickonsinup();
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
	}
	}
}
