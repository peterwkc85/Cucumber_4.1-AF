package com.peterwkc.initializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeInitializer {
	private WebDriver driver;
	private static ChromeInitializer ci;
	
	private ChromeInitializer() {
	}
	
	public static ChromeInitializer getInstance() {
		if (ci == null) {
			ci = new ChromeInitializer();
		}
		
		return ci;
	}

	public void setup() { 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public void tearDown() {
		try { 
			if (driver != null) {
				driver.quit();
			}
		} catch (Exception ex) {
			
		}
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
}
