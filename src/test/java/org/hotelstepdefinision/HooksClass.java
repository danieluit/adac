package org.hotelstepdefinision;

import org.base.LibGlobal;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends LibGlobal {

	@Before
	public void beforeExecution() {
		getDriver();
		maximize();
		loadUrl("https://adactinhotelapp.com/");

	}

	@After
	public void afterExeecution(Scenario sc) {
		TakesScreenshot th = (TakesScreenshot) driver;
		byte[] screenshotAs = th.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "image/png");
		quit();

	}

}
