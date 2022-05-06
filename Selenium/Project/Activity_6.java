import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_6 {

	// Goal: Make sure that the “Activities” menu item exists and is clickable
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
	}

	@Test(dependsOnMethods = { "validateLogin" })
	public void verifyActivitiesTab() {
		WebElement activities = driver.findElement(By.id("grouptab_3"));
		Assert.assertTrue(activities.isDisplayed());
		Assert.assertTrue(activities.isEnabled());
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
