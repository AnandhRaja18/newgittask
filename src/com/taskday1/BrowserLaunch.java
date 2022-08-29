package com.taskday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anand Raja\\eclipse-workspace\\com.tasks\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com/");
		
		driver.close();
	}

}
