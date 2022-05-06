package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		
		//row
		List<WebElement> row = driver.findElements(By.xpath("//table[contains(@id,'sortable')]/tbody/tr"));
		System.out.println("No.of rows:"+row.size());
		
		//col
		List<WebElement> col = driver.findElements(By.xpath("//table[contains(@id,'sortable')]/thead/tr/th"));
		System.out.println("No.of columns:"+col.size());
		
		//Find and print the cell value at the second row and second column.
		
		
		
	
		
		

	}

}
