package org.testNG.practice;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class OrangeHRM 
	{
		RemoteWebDriver driver;
		@Test
		public void LaunchApp() throws Exception  
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(5000);
		
		}
		
		@Test
		public void EnterLoginDetails() throws Exception 
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			Thread.sleep(5000);
			
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		}
		
		@Test
		public void NavigateToMyInfo() 
		{
			driver.findElement(By.xpath("//span[text()='My Info']")).click();
		}
		
		@Test
		public void VerifyMyInfo() 
		{
			System.out.println(driver.findElement(By.xpath("//img[@class='employee-image']")).isDisplayed());
			driver.quit();
		}
		
		@Test
		public void VerifyLogin() 
		{
			WebElement element = driver.findElement(By.id("welcome"));
			System.out.println(element.isDisplayed());
			System.out.println(element.getText());
			driver.quit();
		}
	}


