package com.CRM.webdrverutils;
import org.openqa.selenium.By;
import com.CRM.common.Init;

public class Click extends Set_Webdriver implements Init{
	
	public void Web_driver_Click(By by)
	{
			driver.findElement(by).click();
	}
}
