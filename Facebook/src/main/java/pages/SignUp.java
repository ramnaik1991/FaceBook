package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

	WebDriver driver;

	By Firstname = By.name("firstname");
	By Surname = By.name("lastname");
	By Day = By.id("day");
	By Month = By.id("month");
	By Year = By.id("year");
	By Gender = By.xpath("//label[contains(text(),'Male')]\r\n");
	By MobileNuorEmailid = By.xpath("//input[@name='reg_email__']");
	By Password = By.xpath("//input[@name='reg_passwd__']");
	By Singup = By.xpath("//button[contains(text(),'Sign Up')]\r\n" + "");

	public SignUp(WebDriver driver) {
		this.driver = driver;
	}

	public void enterfirstname(String firstname) {
		driver.findElement(Firstname).sendKeys("ram");

	}

	public void enterSurname(String Surname) {
		driver.findElement(Firstname).sendKeys("naik");
	}

	public void SelectDateofBirthd(String day) {
		Select selectDay = new Select(driver.findElement(Day));
		selectDay.deselectByValue("day");

	}

	public void selectDateOfBirthM(String month) {
		Select selectMonth = new Select(driver.findElement(Month));
		selectMonth.selectByVisibleText(month);

	}

	public void selectDateOfBirth(String year) {
		Select selectYear = new Select(driver.findElement(Year));
		selectYear.selectByVisibleText(year);

	}

	public void clickGender() {
		driver.findElement(Gender).click();
	}

	public void enterMobileNuorEmailid() {
		driver.findElement(MobileNuorEmailid).sendKeys("7799527");
	}

	public void password() {
		driver.findElement(Password).sendKeys("Admin@123");
	}

	public void clickonsinup() {
		driver.findElement(Singup);
	}

	
	}

