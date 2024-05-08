package StepDefinitions;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {
	WebDriver driver ;
	@Given("browser is open")
	public void browser_is_open() {
		
		//String projectpath =System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver",projectpath+ "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		
		//driver= new FirefoxDriver();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
	}

	@Given("user on google search page")
	public void user_on_google_search_page() {
     
		driver.navigate().to("https://www.google.com/");
	}

	@When("user enter Text in search box")
	public void user_enter_text_in_search_box() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Automation course");
      Thread.sleep(8000);
	}

	@When("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user navigated to search result")
	public void user_navigated_to_search_result() {
		
		driver.getPageSource().contains("Courses");
		driver.quit();
	}

}
