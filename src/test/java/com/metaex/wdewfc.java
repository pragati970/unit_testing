package com.metaex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wdewfc 
{
	public static void main(String [] args) {
		 System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		  WebDriver wb = new FirefoxDriver();

		  
		  wb.get("https://www.youtube.com/");
	}
	
	
	 
}
