import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Activity_9 {

	@Test
	public void activity_9() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		WebElement sales = driver.findElement(By.xpath("//*[text()='Sales']"));
		Actions a = new Actions(driver);

		a.moveToElement(sales).build().perform(); // Thread.sleep(2000);
		driver.findElement(By.id("moduleTab_9_Leads")).click();
		Thread.sleep(3000);

		for (int i = 1; i < 11; i++) {//// tr[@class='oddListRowS1' or @class= 'evenListRowS1']/td[3]
			String name = driver
					.findElement(By.xpath("(//tr[@class='oddListRowS1' or @class= 'evenListRowS1']/td[3])[" + i + "]"))
					.getText();
			String user = driver
					.findElement(By.xpath("(//tr[@class='oddListRowS1' or @class= 'evenListRowS1']/td[8])[" + i + "]"))
					.getText();

			System.out.println("The " + i + " name in the table is: " + name);
			System.out.println("The " + i + " user in the table is: " + user);

		}
		driver.close();
	}

}
