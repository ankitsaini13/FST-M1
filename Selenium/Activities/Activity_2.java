package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_2 {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println(title);
		String id = driver.findElement(By.id("about-link")).getText();
		System.out.println(id);
		//String className = driver.findElement(By.className("ui inverted huge green button")).getText();
		//System.out.println(className);
		String linktext= driver.findElement(By.linkText("About Us")).getText();
		System.out.println(linktext);
		String css = driver.findElement(By.cssSelector("a#about-link")).getText();
		System.out.println(css);
		//css.click();
		
		
	}

}
