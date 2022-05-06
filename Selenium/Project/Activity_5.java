import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_5 {

	// Goal: Get the color of the navigation menu

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
	public void printColor() {

		WebElement bgcolor = driver.findElement(By.id("toolbar"));
		System.out.println(bgcolor.getCssValue("color"));

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
