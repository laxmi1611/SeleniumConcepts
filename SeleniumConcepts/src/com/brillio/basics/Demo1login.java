package com.brillio.basics;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\U1124545\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		String url=driver.getCurrentUrl();
		System.out.println("url");
		
		driver.findElement(By.id("welcome")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("logout")).click();
	
		
	    driver.quit();
		
	    
	}

}
