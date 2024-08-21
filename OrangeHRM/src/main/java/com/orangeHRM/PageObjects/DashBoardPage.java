package com.orangeHRM.PageObjects;

import org.openqa.selenium.By;

import com.orangeHRM.TestBase.BaseClass;
import com.orangeHRM.TestUtility.DriverUtils;

public class DashBoardPage extends BaseClass{

	private String assignLeaveButtonXpathValue="//button[@title='Assign Leave']";
	private By assignLeaveButton=By.xpath(assignLeaveButtonXpathValue);
	
	private String leaveListButtonXpathValue="//button[@title='Leave List']";
	private By leaveListButton=By.xpath(leaveListButtonXpathValue);
	
	private String timeSheetsButtonXpathValue="//button[@title='Timesheets']";
	private By timeSheetButton=By.xpath(timeSheetsButtonXpathValue);
	
	private String applyLeaveButtonXpathValue="//button[@title='Apply Leave']";
	private By applyLeaveButton=By.xpath(applyLeaveButtonXpathValue);
	
	private String myTimeSheetButtonXpathValue="//button[@title='My Timesheet']";
	private By myTimeSheetButton=By.xpath(myTimeSheetButtonXpathValue);
	
	public void clickOnAssignLeaveButton()
	{
		DriverUtils.click(assignLeaveButton);
	}
	
	public void clickOnLeaveListButton()
	{
		DriverUtils.click(leaveListButton);
	}
	
	public void clickOnTimeSheetButton()
	{
		DriverUtils.click(timeSheetButton);
	}
	
	public void clickOnApplyLeaveButton()
	{
		DriverUtils.click(applyLeaveButton);
	}
	
	public void clickOnMyTimeSheetButton()
	{
		DriverUtils.click(myTimeSheetButton);
	}
}
