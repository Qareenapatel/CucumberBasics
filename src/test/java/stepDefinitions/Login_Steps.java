package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {

	WebDriver driver;

	@Given("users luanch chrome browser")
	public void users_luanch_chrome_browser() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/patel/Webdriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

	}

	@When("users opens url {string}")
	public void users_opens_url(String url) {
		driver.get(url);

	}

	@Then("users enters username as {string} and password as {string}")
	public void users_enters_username_as_and_password_as(String username, String password) {
		driver.findElement(By.name("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();

	}

	@When("page title shoud be {string}")
	public void page_title_shoud_be(String Actualtitle) {
		if (driver.getTitle().contains("abcd")) {
			driver.quit();
		}
	}

	@When("user click on react button")
	public void user_click_on_react_button() {
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();

	}

	@When("user click on logout")
	public void user_click_on_logout() {
		driver.findElement(By.id("logout_sidebar_link")).click();
	}

	@When("user close browser")
	public void user_close_browser() {
		driver.quit();
	}

}
