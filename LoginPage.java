package PageObjectClass;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// creatw WebDriver
	WebDriver driver;

	// locate username
	@FindBy(id="username")
	WebElement username;
	
	// locate password
	@FindBy(id="password")
	WebElement password;
	
	// locate login
	@FindBy(id="login")
	WebElement loginButton;
	
	public LoginPage(ChromeDriver driver2) {
		this.driver=(WebDriver) driver2;
		PageFactory.initElements((SearchContext) driver2,this);
	}
	public void login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
	}
}
