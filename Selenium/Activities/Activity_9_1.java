package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/selects");
		
		WebElement dropdown = driver.findElement(By.id("single-select"));
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("Option 2");
		System.out.println(dropdown.getText());
		select.selectByIndex(3);
		System.out.println(dropdown.getText());
		select.selectByValue("4");
		System.out.println(dropdown.getText());
		
		List<WebElement> options= select.getAllSelectedOptions();
		for(WebElement option: options) {
			System.out.println("Option:"+option.getText());
			
		}
		
		driver.close();
		
		
		
		
	}

}
