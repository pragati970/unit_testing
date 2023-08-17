package com.metaex;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnitTest {
	WebDriver dr;
  @BeforeTest
  public void BT() {
	  
	  
	  dr = new ChromeDriver();
	  dr.get("http://localhost:9093/");

      dr.manage().window().maximize();
//	  System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe"); // Set the path to your geckodriver executable
//	  FirefoxOptions options = new FirefoxOptions();
//	  options.setBinary("./Drivers/firefox.exe"); // Set the path to your Firefox binary
//	  WebDriver wb = new FirefoxDriver(options);
//
// 
//	  
//	  wb.get("https://www.youtube.com/");
  }
  @Test(priority=1)
  public void TC001() throws InterruptedException {
      
      Thread.sleep(1000);
	  
	  dr.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[1]/a")).click();
      Thread.sleep(2000);
      dr.navigate().back();
	  dr.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
      Thread.sleep(2000);
      dr.navigate().back();
      Thread.sleep(2000);

  }
  @Test(priority=2)
  public void TC002() throws InterruptedException {

	  
	  dr.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[4]/button/span/a")).click();
      Thread.sleep(2000);
	  dr.findElement(By.xpath("/html/body/div/div/form/div[1]/input")).sendKeys("git@gmail.com");
      Thread.sleep(2000);
	  dr.findElement(By.xpath("/html/body/div/div/form/div[2]/input")).sendKeys("1247571451");
      Thread.sleep(2000);
	  dr.findElement(By.xpath("/html/body/div/div/form/button")).click();
	  String exp = "DATA SAVED SUCCESSFULLY!";
	  String act = dr.findElement(By.xpath("/html/body/script")).getText();
	  if(exp.equals(act)) 
	  {
		  System.out.println("Customer Registartion Sucessfull");
		  
	  }
  }
	  @Test(priority=3)
	  public void TC003() throws InterruptedException {

		  

		  dr.findElement(By.xpath("/html/body/div/div/form/div[1]/input")).sendKeys("git@gmail.com");
	      Thread.sleep(2000);
		  dr.findElement(By.xpath("/html/body/div/div/form/div[2]/input")).sendKeys("1247571451");
	      Thread.sleep(2000);
		  dr.findElement(By.xpath("/html/body/div/div/form/button")).click();

			  
		  }
	  @Test(priority=4)
	  public void TC004() throws InterruptedException {

		  
	      Thread.sleep(2000);
		  dr.findElement(By.xpath("/html/body/div/form/div[1]/input")).sendKeys("aKiishanasa Kumar");
	      Thread.sleep(2000);
		  dr.findElement(By.xpath("/html/body/div/form/div[2]/input")).sendKeys("Sahsswu");
	      Thread.sleep(2000);
		  dr.findElement(By.xpath("/html/body/div/form/div[3]/input[1]")).sendKeys("25/02/1998");
	      Thread.sleep(2000);
		  dr.findElement(By.xpath("/html/body/div/form/div[3]/input[2]")).click();
	      Thread.sleep(2000);
		  dr.findElement(By.xpath("/html/body/div/form/div[4]/input")).sendKeys("git@gmail.com");
	      Thread.sleep(2000);
		  dr.findElement(By.xpath("/html/body/div/form/div[5]/input")).sendKeys("8917222174");
	      Thread.sleep(2000);
	      Select objSelect = new Select(dr.findElement(By.xpath("/html/body/div/form/div[6]/select")));
	      objSelect.selectByVisibleText("Class XII");
	      dr.findElement(By.xpath("/html/body/div/form/div[7]/button[1]")).click();
	      Thread.sleep(2000);
	      
	      if(dr.findElement(By.xpath("/html/body/div[2]/img")).isDisplayed())
	      {
	    	  System.out.println("Student Registration Sucess");
	      }

	      

	  }
  
}
