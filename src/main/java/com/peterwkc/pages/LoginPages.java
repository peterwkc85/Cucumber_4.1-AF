package com.peterwkc.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Fail;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.peterwkc.utils.Pause;
import com.peterwkc.initializer.ChromeInitializer;


public class LoginPages {
	
	private ChromeInitializer ci = ChromeInitializer.getInstance();
	private WebDriver driver = ci.getDriver();
	
	private static final Logger logger = LogManager.getLogger(LoginPages.class);
	
	
	public void prelogin() {
		try {
			driver.manage().window().maximize();
			driver.navigate().to("http://demo.guru99.com/V4/");
			Pause.pause(12000);
			logger.info("\n\nLogin");
        }	
        catch(NoSuchElementException | ElementNotInteractableException e) {
        	Fail.fail(e.getCause() +  " <-> " + e.getLocalizedMessage());
        	logger.error(e.getLocalizedMessage());
        }
	}
	
	public void enterLoginInfo() {
		try {
			
        }	
        catch(NoSuchElementException | ElementNotInteractableException e) {
        	Fail.fail(e.getCause() +  " <-> " + e.getLocalizedMessage());
        	logger.error(e.getLocalizedMessage());
        }
	}
	
	
	
}
