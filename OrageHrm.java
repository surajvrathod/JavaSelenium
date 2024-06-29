package day2;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
 1)open app
 2)Check logo
 3)login
 4)logout

*/


public class OrageHrm {
	
	  WebDriver driver=new ChromeDriver();
  @Test(priority=1)
	void openapp() {
	  System.out.println("open");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.manage().window().maximize();
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.navigate().refresh();
  //driver.close();
 driver.manage().window().maximize();	
 System.out.println("Test1 Passed");
 
 
 
	}
	@Test(priority=2)
	void testLogo() throws InterruptedException {
		
		Thread.sleep(10000);
	boolean status=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo-mobile']//img[@alt='orangehrm-logo']")).isDisplayed();
	System.out.println(status);
	if(status==true) {
		System.out.println("Logo Displayed");
	}
	else {
		System.out.println("Logo Not Displayed");
	}
		
	}
	@Test(priority=3)
	void login() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	System.out.println("Successfully Logged in");
	}
	@Test(priority=4)
	void close() {
		driver.close();
		System.out.println("Successfully closed");
		
	}
}
