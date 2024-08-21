package com.orangeHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SamplePage {
	
	@FindBy(partialLinkText = "Creat") WebElement emailField;

	
	By createButton=By.partialLinkText("Crea");
	By dayDropDown=By.id("day");
	By monthDropDown=By.id("month");
	By yearDropDown=By.id("year");
}
