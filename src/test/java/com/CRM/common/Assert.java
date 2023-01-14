package com.CRM.common;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import com.CRM.webdrverutils.Set_Webdriver;

public class Assert extends Set_Webdriver implements Init{

	public void Assert_Equals(By by,String Expected) {
		
		String Actual_val=driver.findElement(by).getText();
		String Expect_val =Expected;
		assertEquals(Actual_val, Expect_val);
	}
	
}
