package com.CRM.webdrverutils;

import org.openqa.selenium.By;

import com.CRM.common.Init;

public class Send_Keys extends Set_Webdriver implements Init{

	
	public void Web_Driver_Sendkeys(By by,String value) {
		
		driver.findElement(by).sendKeys(value);
		
		
	}
}
