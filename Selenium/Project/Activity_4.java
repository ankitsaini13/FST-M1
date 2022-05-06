import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_4 {

	/****
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Open the browser b. Navigate to ‘https://alchemy.hguy.co/crm’ Find and select
	 * the username and password fields d. Enter login credentials into the
	 * respective fields e. Click login f. Verify that the homepage has opened. g.
	 * Close the browser.
	 */

	// Goal: Open the site and login with the credentials provided
	WebDriver driver;

	@BeforeTest
	public void setUp() {

		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");

	}

	@Test
	public void validateLogin() {
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		System.out.println("Login Successfull");
	}

	@Test(dependsOnMethods = { "validateLogin" })
	public void verifyHomePage() {
		WebElement homePage = driver
				.findElement(By.cssSelector("a.navbar-brand.with-home-icon.suitepicon.suitepicon-action-home"));
		String HomePageConfirmation = homePage.getAttribute("href");
		if (HomePageConfirmation.contains("Home")) {
			System.out.println("HomePage is opened");
		} else {
			System.out.println("Not Navigated to HomePage");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
