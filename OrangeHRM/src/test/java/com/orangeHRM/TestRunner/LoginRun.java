package com.orangeHRM.TestRunner;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orangeHRM.PageObjects.DashBoardPage;
import com.orangeHRM.PageObjects.LoginPage;
import com.orangeHRM.TestBase.BaseClass;
import com.orangeHRM.TestBase.Constants;
import com.orangeHRM.TestUtility.DriverUtils;
import com.orangeHRM.TestUtility.ExcelUtils;
import com.orangeHRM.TestUtility.ListenersUtils;

@Listeners(ListenersUtils.class)
public class LoginRun extends BaseClass{

	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	ExcelUtils excel;
	SoftAssert sa;
	
	@BeforeClass
	public void setUp()
	{
		getDriver(Constants.chromeBrowser);
		DriverUtils.maximize();
		DriverUtils.implicitWait(2);
		DriverUtils.get(Constants.pageURL);
		loginPage=new LoginPage();
		dashBoardPage=new DashBoardPage();
		excel=new ExcelUtils(Constants.excelSheetsPath+"//DataDriven.xlsx", "Sheet3");
		sa=new SoftAssert();
	}
	
	@Test(priority = 0)
	public void printTitle()
	{
		String expectedTitle="Orange HRM";
		String actualTitle=DriverUtils.getTitle();
		
		System.out.println(actualTitle);
//		sa.assertEquals(actualTitle, expectedTitle);
//		System.out.println(1);
//		System.out.println(1);
//		System.out.println(1);
//		sa.assertAll();
	}
	
	@Test(priority = 1)
	public void printCurrentURL()
	{
		String expectedURL="https://www.orangeHRM.com";
		String actualURL=DriverUtils.getCurrentURL();
		System.out.println(actualURL);
//		sa.assertEquals(actualURL, expectedURL);
//		System.out.println(1);
//		System.out.println(1);
//		System.out.println(1);
//		sa.assertAll();
	}
	
//	@Test(priority = 2,dataProvider = "loginData",dataProviderClass = DataGenerator.class)
//	public void verifyLogin(String userName,String password)
//	{
//		loginPage.enterValueOnEmailField(userName);
//		loginPage.enterValueOnPasswordField(password);
//		loginPage.clickLoginButton();
//	}
	
	@Test(priority = 2)
	public void verifyLogin()
	{
		loginPage.enterValueOnEmailField(excel.getSingleValue(0, 0));
		loginPage.enterValueOnPasswordField("ryeuweruye");
		loginPage.clickLoginButton();
		
		try
		{
			loginPage.dashBoardIcon.isDisplayed();
			System.out.println("INFO :--->: Login SuccessFul...");
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("INFO :--->: Login Failed...");
			System.out.println("INFO :--->: Please Enter Valid UserName and Password...");
		}
	}
	
//	@Test(priority = 3)
//	public void verifyTimeSheets()
//	{
//		dashBoardPage.clickOnTimeSheetButton();
//	}
	
//	@AfterClass
//	public void tearDown()
//	{
//		DriverUtils.close();
//	}
}
