package com.peterwkc.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.peterwkc.stepsdef",
		plugin = {"com.peterwkc.plugin.MyEventListener","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
				"json:target/cucumber-report.json"})
public class ParallelRunner {
}

// ==============================================================================================

/*
 * java cucumber.api.cli.Main --help
 * 
 * 
 */
