import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_1 {
	
	/*a. Open a browser.
		b. Navigate to ‘http://alchemy.hguy.co/crm’.
		c. Get the title of the website.
		d. Make sure it matches “SuiteCRM” exactly.
		e. If it matches, close the browser.*/
	
	WebDriver driver;
	
	@BeforeTest()
		public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		
	}
	
        @Test
		public void validateTitle() {
		String title = driver.getTitle();
		System.out.println("The title of the page is: "+title);
		Assert.assertEquals(title, "SuiteCRM");
        }
		
		@AfterTest
		public void tearDown() {
		driver.quit();
		}

}
