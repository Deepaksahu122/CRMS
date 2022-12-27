package com.CRM.webdrverutils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import com.CRM.common.Init;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Set_Webdriver implements Init {
	//public final static Set_Webdriver DRIVER=new Set_Webdriver();
	 public static WebDriver driver;
	
		public WebDriver Get_Webdriver() {
			
			if(driver==null) {
				Setup_Webdriver();
			}
			return driver;
			
			
			
		}
		@BeforeSuite
		public void Setup_Webdriver() {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 
		}
	
	

}
