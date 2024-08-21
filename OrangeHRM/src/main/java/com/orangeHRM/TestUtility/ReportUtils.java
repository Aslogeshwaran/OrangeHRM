package com.orangeHRM.TestUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.orangeHRM.TestBase.Constants;

public class ReportUtils {

	
	public static ExtentReports generateReport()
	{
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(Constants.reportsPath+"//extent"+System.currentTimeMillis()+".html");
		
		ExtentReports reports=new ExtentReports();
		
		sparkReporter.config().setDocumentTitle("Orange HRM - Project");
		
		sparkReporter.config().setReportName("Automation Results of Orange HRM");
		
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		sparkReporter.config().setTimeStampFormat("dd-MM-yyyy hh:mm:ss, EEEE");
		
		reports.attachReporter(sparkReporter);
		
		return reports;
	}
}
