package org.testNG.practice;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions 
{
	@Test
  public void method1() throws Exception
  {
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
	Thread.sleep(5000);
	String Expectedvalue = ("HYR Tutorials - Google Search");
	String ActualValue =driver.getTitle();
	assertEquals(ActualValue, Expectedvalue);
	
	
	Thread.sleep(5000);
	  
  }
  
}
