package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	protected WebDriver driver;
	private By txt_userName = By.id("email");
	private By txt_password = By.id("login-password");
	private By btn_login = By.id("login");
	private By  coursestext =By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[7]/a");
	
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		
	}

	public void enterUsername(String username) {

		driver.findElement(txt_userName).sendKeys(username);

	}

	public void enterPassword(String password) {

		driver.findElement(txt_password).sendKeys(password);

	}

	public void clickButtonLogin() {

		driver.findElement(btn_login).click();

	}
	
	public void validUserAndPassword(String username, String password) {

		driver.findElement(txt_userName).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();

	}
	
	public boolean checkLoginDone() {
		
		boolean element = driver.findElement(coursestext).isDisplayed();
		return element;
	}

}
