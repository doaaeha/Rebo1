package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;
	
//
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.manage().window().maximize();
//		driver.get("https://www.letskodeit.com/login");
//	}
//	
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username , String password) {
//		
//		driver.findElement(By.id("email")).sendKeys(username);
//		driver.findElement(By.id("login-password")).sendKeys(password);
//		System.out.println("enter username and password");
//	
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//		driver.findElement(By.id("login")).click();
//		System.out.println("click on login");
//		
//	}
//
//	@Then("user navigated to home page")
//	public void user_navigated_to_home_page() {
//		boolean element = driver.findElement(By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[7]/a")).isDisplayed();
//	System.out.println(element);
//	driver.quit();	}

}
