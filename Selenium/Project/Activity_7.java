import java.time.Duration;
import java.util.List;
import java.util.Iterator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



	
	//Reading a popup that contains additional information about the account/lead.
	
	

	public class Activity_7 {
		WebDriver driver;
		WebDriverWait wait;

		@BeforeTest
		public void setUp() {
			driver = new FirefoxDriver();
			driver.get("http://alchemy.hguy.co/crm");
			Reporter.log("Login successfull");

		}

		@Test
		public void printPhoneNyumber() {
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			driver.findElement(By.id("bigbutton")).click();
			WebElement sales = driver.findElement(By.xpath("//*[text()='Sales']"));
			Actions a = new Actions(driver);
			a.moveToElement(sales).build().perform();
			driver.findElement(By.id("moduleTab_9_Accounts")).click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("MassUpdate")));
			WebElement form = driver.findElement(By.id("MassUpdate"));
			List<WebElement> additionalInfo = form.findElements(By.xpath("//*[contains(@title,'Additional Details')]"));
			
			Iterator<WebElement> it = additionalInfo.iterator();
			while (it.hasNext()) {
				it.next().click();
				WebElement widget = form.findElement(By.className("phone"));
				if (widget.getText() != null) {
					System.out.println("Phone :" + widget.getText());
					break;
				} else
					continue;
			}
		}

			


		@AfterTest
		public void tearDown() {
			driver.quit();
			Reporter.log("Successfully closed driver instance");
		}
	}