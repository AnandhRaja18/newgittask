package com.taskday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anand Raja\\eclipse-workspace\\com.tasks\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
