package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public void generateJvmReport(String jsonFile) {
		
		File reportDirectry = new File("C:\\Users\\Admin\\eclipse-workspace\\Adactin\\src\\test\\resources\\Reports");
		
	Configuration  configuration =new Configuration(reportDirectry,"Adactinhotal Automation");

	configuration.addClassifications("OS", "Windows 10");
	configuration.addClassifications("Browser", " Chrome");
	configuration.addClassifications("Version", " 96.0");
	configuration.addClassifications("Sprint", " 27");

	List<String> jsonFiles = new ArrayList<String>();
	jsonFiles.add(jsonFile);

	ReportBuilder builder =new ReportBuilder(jsonFiles,configuration);
	builder.generateReports();


	}

}
