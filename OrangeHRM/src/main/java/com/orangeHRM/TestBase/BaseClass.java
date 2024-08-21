package com.orangeHRM.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
	
	public BaseClass() {
		PageFactory.initElements(driver, this);
	}

	protected static WebDriver driver;

	public void getDriver(String browserName)
	{
		if(browserName.equalsIgnoreCase(Constants.chromeBrowser))
		{
			driver=new ChromeDriver();
		}

		else if(browserName.equalsIgnoreCase(Constants.edgeBrowser))
		{
			driver=new EdgeDriver();
		}

		else if(browserName.equalsIgnoreCase(Constants.firefoxBrowser))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			throw new IllegalArgumentException(Constants.browserWarningMessage);
		}
	}

	public void getDriver(String browserName,String... arguments)
	{
		if(browserName.equalsIgnoreCase(Constants.chromeBrowser))
		{
			
			
			
			ChromeOptions opt=new OptionsFactory().chromeOptions(arguments);
			driver=new ChromeDriver(opt);
		}

		else if(browserName.equalsIgnoreCase(Constants.edgeBrowser))
		{
			EdgeOptions opt=new OptionsFactory().edgeOptions(arguments);
			driver=new EdgeDriver(opt);
		}

		else if(browserName.equalsIgnoreCase(Constants.firefoxBrowser))
		{
			FirefoxOptions opt=new OptionsFactory().firefoxOptions(arguments);
			driver=new FirefoxDriver(opt);
		}
		else
		{
			throw new IllegalArgumentException(Constants.browserWarningMessage);
		}
	}
	
}
