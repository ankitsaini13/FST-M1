import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_3 {

	/*
	 * Open a browser. b. Navigate to ‘http://alchemy.hguy.co/crm’. Get the first
	 * copyright text in the footer. d. Print the text to the console. e. Close the
	 * browser.
	 * 
	 * 
	 * 
	 */

	// Print the first copyright text in the footer to the console
	WebDriver driver;

	@BeforeTest
	public void setUp() {

		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");

	}

	@Test
	public void firstCopyRight() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		WebElement copyRight = driver.findElement(By.id("admin_options"));
		// WebElement copyRight = driver.findElement(By.xpath("//a[text(),'©
		// Supercharged by SuiteCRM'])"));
		System.out.println("The first CopyRight text in the footer is:" + copyRight.getText());
		driver.close();

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
