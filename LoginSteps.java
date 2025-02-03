package StepDefinitions;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjectClass.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
    LoginPage Page;
    

    // Gien user login
    @Given("User login is on the login")
    public void user_is void on_the_login_page() {
    driver = (WebDriver) new ChromeDriver();
    Page = new LoginPage(driver);
    driver.get("https://www.naaptol.com/"); 
}

   // When username and password
   @When(" User enters \"<username>\"  and \"<password>\"")
   public void user_enters__username_and_password(String username, String password) {
   Page.login(password, password);
}
   @Then("User should see the welcome message")
   public void user_should_see_the_welcome_message() {
	   Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
	   driver.quit();  
}
   }