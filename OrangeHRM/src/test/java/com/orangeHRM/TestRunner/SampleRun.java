package com.orangeHRM.TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleRun{

	String expected="Freedom";

	int i=2;

	@Test
	public void userLogin()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WELCOME234\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//browser Launch
		WebDriver driver=new ChromeDriver();
		System.out.println("INFO : ---> : Chrome Browser Launched Successfully");

		//To maximize
		driver.manage().window().maximize();
		System.out.println("INFO : ---> : Chrome Browser Maximized Successfully");
		
		

		//To pass PageURL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("INFO : ---> : Page URL Passed Successfully");

		//To print Page Title
		String pageTitle= driver.getTitle();
		System.out.println("INFO : ---> : Page Title Captured Successfully as "+pageTitle);

		//To print Page URL
		String pageURL=driver.getCurrentUrl();
		System.out.println("INFO : ---> : Page URL Captured Successfully as "+pageURL);
		
		WebElement emailField=driver.findElement(By.xpath("//input[@name='username']"));
		
		WebElement passwordField=driver.findElement(By.xpath("//input[@name='password']"));
		
		WebElement loginButton=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		emailField.sendKeys("adminData");
		
		passwordField.sendKeys("Admin@123");
		
		loginButton.click();
	}

	@Test
	public void m1()
	{
		String actual="data";
		Assert.assertEquals(actual,expected);
	}

	@Test
	public void m2()
	{
		Assert.assertTrue(i>=5, "i value is smaller than 5");

		for(int m=0;m<=i;m++)
		{
			System.out.println(m);
		}
	}

}
