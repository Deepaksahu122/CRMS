package com.CRM.webdrverutils;


import com.CRM.common.Init;

public class Navigate  extends Set_Webdriver implements Init{

	
	public void driver_Get(String url) {
		
         driver.get(url);
         
		
	}
}
