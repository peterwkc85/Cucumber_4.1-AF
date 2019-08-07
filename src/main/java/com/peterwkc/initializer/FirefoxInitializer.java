package com.peterwkc.initializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxInitializer {
	private WebDriver driver;
	private static FirefoxInitializer fi;
	
	private FirefoxInitializer() {
	}
	
	public static FirefoxInitializer getInstance() {
		if (fi == null) {
			fi = new FirefoxInitializer();
		}
		
		return fi;
	}
	
	public void setup() { 
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
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
