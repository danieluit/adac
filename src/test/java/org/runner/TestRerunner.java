package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"@C:\\Users\\Admin\\eclipse-workspace\\Adactin\\src\\test\\resources\\failed.txt"},glue= {"org.hotelstepdefinision"})
public class TestRerunner {
	
	

}
