package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class ShadowEx 
{

	public static void main(String[] args) throws Exception
	{
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("start-maximized");
	        options.addArguments("disable-infobars");
	        options.addArguments("--disable-extensions"); 
	        WebDriver driver = new ChromeDriver(options);
	        driver.get("https://magnitia.com/images/courses/Selenium-with-Java-Magnitia-Content.pdf");
	        
	        
	        Thread.sleep(5000);
	       Shadow shadow = new Shadow(driver);
	        	        
	       /* WebElement root1 = shadow.findElement("#downloads");
	        WebElement shadowRoot1 = (WebElement) ((JavascriptExecutor)driver)
	        	    .executeScript("return arguments[0].shadowRoot (open)", root1);*/
	        
	        
	        WebElement r1=shadow.findElement("#viewer").findElement(By.cssSelector("#toolbar"));
	        System.out.println(r1.getTagName());
	        
	        //WebElement downloadbtn = shadowRoot1.findElement(By.cssSelector("#download"));
	        //downloadbtn.click();
	        
	}

}
