package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps_POM {

	WebDriver driver = new ChromeDriver();
	LoginPage login = new LoginPage(driver);

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/login");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		login.enterUsername(username);
		login.enterPassword(password);
		System.out.println("enter username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		login.clickButtonLogin();
		System.out.println("click on login");
	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() {
		boolean element = login.checkLoginDone();
		System.out.println(element);
		driver.quit();
	}

}
