package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:src\\test\\resources\\Reports\\out.json"},features= {"src\\test\\resources"}, glue = {"org.hotelstepdefinision"},strict= true,monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE)
public class TestRunnerClass {
	
	@AfterClass
	public static void afterclass() {
		
	 Reporting reporting = new Reporting();
	 reporting.generateJvmReport("C:\\Users\\Admin\\eclipse-workspace\\Adactin\\src\\test\\resources\\Reports\\out.json");

	}
	
	
}
