package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Kerstin {
	
	WebDriver driver;

	@Given("User1 navigates to Login page")
	public void user1_navigates_to_login_page() {
	    
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
	}


	@When("^User1 enters valid email address into email field$")
	public void user1_enters_valid_email_address_into_email_field() {
		
		driver.findElement(By.id("input-email")).sendKeys("hans.huckbein@gmail.com");
	}

	@And("^User1 enters valid password into password field$")
	public void user1_enters_valid_password_into_password_field() {

		driver.findElement(By.id("input-password")).sendKeys("12345");	
	}

	@When("User1 clicks on Login button")
	public void user1_clicks_on_login_button() {

		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("User1 should get successfully logged in")
	public void user1_should_get_successfully_logged_in() {
		
		WebElement editYourAccoutInformation = driver.findElement(By.linkText("Edit your account information"));
		Assert.assertTrue(editYourAccoutInformation.isDisplayed());

		driver.quit();
	}
}
