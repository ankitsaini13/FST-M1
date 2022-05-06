import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_8 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");

	}

	@Test
	public void validateName() {

		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		WebElement sales = driver.findElement(By.xpath("//*[text()='Sales']"));
		Actions a = new Actions(driver);
		a.moveToElement(sales).build().perform();
		driver.findElement(By.id("moduleTab_9_Accounts")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("listViewBody")));
		// First 5 Odd number rows
		for (int i = 1; i < 6; i++) {
			String name = driver.findElement(By.xpath("(//tr[@class='oddListRowS1']/td[3])[" + i + "]")).getText();
			System.out.println("The name of " + i + " odd number is:" + name);
		}
		
	}
	

	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
