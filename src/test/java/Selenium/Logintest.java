package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logintest {
	String driverPath = "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver=new ChromeDriver();
	
	@BeforeTest
	void navigateTo() throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(2000);
	}
	@AfterTest
	void exit() {
		driver.quit();
	}
	@Test(priority=1)
	void login() throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();  //click on login
		Thread.sleep(3000);
		
	}
	@Test(priority=2)
	void buzz() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Buzz']")).click();  //click on buzz
		Thread.sleep(3000);
		WebElement post= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		post.click();
		post.sendKeys("Hello WAM");
		driver.findElement(By.xpath("//button[@type='submit']")).click();  //click on post
		Thread.sleep(3000);
	}
	
}
