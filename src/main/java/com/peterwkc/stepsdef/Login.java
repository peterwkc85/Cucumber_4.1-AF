package com.peterwkc.stepsdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.peterwkc.pages.LoginPages;
import com.peterwkc.initializer.ChromeInitializer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	private ChromeInitializer ci = ChromeInitializer.getInstance();
	private WebDriver driver = ci.getDriver();
	
	private LoginPages lp = PageFactory.initElements(driver, LoginPages.class);
	
	@Given("the user is on the login page")
	public void preLogin() {
		lp.prelogin();
	}
	
	@When("the user enter login info and sign in")
	public void enterLoginInfo() {
		lp.enterLoginInfo();
	}
	
	@Then("the user should redirect to homepage")
	public void logined() {
		
	}
}
