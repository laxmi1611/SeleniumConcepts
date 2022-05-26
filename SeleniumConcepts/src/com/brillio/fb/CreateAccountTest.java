package com.brillio.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccountTest {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\U1124545\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

       driver.get("https://www.facebook.com/");
       
       driver.findElement(By.linkText("Create New Account")).click();
       driver.findElement(By.name("firstname")).sendKeys("john");
       driver.findElement(By.name("lastname")).sendKeys("wick");
       driver.findElement(By.id("password_reg_input")).sendKeys("welcome123");
       
       Select selectDay=new Select(driver.findElement(By.id("day")));
       selectDay.deselectByVisibleText("15");
       
       driver.findElement(By.xpath("//input[@value='-1']")).click();
       
       driver.findElement(By.name("websubmit")).click();

	}

}
