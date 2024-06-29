package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String [] args){
		System.out.println("Welcome to Testing");
		
		//ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> checkboxes=(List<WebElement>) driver.findElement(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for(int i=0;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
			
		
	}

}
