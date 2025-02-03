package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjectClass.LoginPage;

public class LoginTest {
	ChromeDriver driver;
	LoginPage loginPage;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		driver.get("https://www.naaptol.com/");
	}

	@Test
	public void testlogin() {
		loginPage.login("user", "Masai@54321");
		Assert.assertTrue(((WebDriver) driver).findElement(By.id("welcome")).isDisplayed());

	}

	@AfterMethod
	public void teamDown() {
		driver.quit();
	}

}
