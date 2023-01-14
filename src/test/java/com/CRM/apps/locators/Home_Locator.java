package com.CRM.apps.locators;

import org.openqa.selenium.By;

public class Home_Locator {
	
	public static By ACC_button =  By.xpath("//span[normalize-space()='My Account']");
	public static By Login_button = By.xpath("//a[contains(text(),'Login')]");
	public static By Continue_button = By.xpath("//a[contains(text(),'Continue')]");
	public static By Actual_header = By.xpath("//h1[text()='Register Account']");
	public static String Expected_header = "Register Account";
	public static By User_Email=By.xpath("//input[@id='input-email']");
	public static By User_Password=By.xpath("//input[@id='input-password']");
	public static By User_submit=By.xpath("//button[contains(text(),'Login')]");
	

}
