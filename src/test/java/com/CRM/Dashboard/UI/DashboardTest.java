package com.CRM.Dashboard.UI;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import com.CRM.apps.locators.Home_Locator;
import com.CRM.common.Annotations;
import com.CRM.common.Constants;
import com.CRM.common.Init;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class DashboardTest extends Annotations implements Init {
	//public static final Logger log=LogManager.getLogger(DashboardTest.class);
	
	
	Logger logger = LoggerFactory.getLogger(DashboardTest.class);


	//
	
	@Test(priority=0)
	public void TC_Login() throws InterruptedException {
		//log.info("Test Case 1 is Started");
		logger.info("Test Case 1 has Started !!!");
		navigate.driver_Get(Constants.hompage);
		
		click.Web_driver_Click(Home_Locator.ACC_button);
		Thread.sleep(2000);
		click.Web_driver_Click(Home_Locator.Login_button);
		
        click.Web_driver_Click(Home_Locator.Continue_button);
        Thread.sleep(5000);
        asserts.Assert_Equals(Home_Locator.Actual_header,Home_Locator.Expected_header);
		logger.info("Test Case 1 has Completed");
	}
	
	@Test(priority=1)
	public void TC_LF_2() throws Exception{
		
		logger.info("Test Case 2 has Started to validate correct user Credential");
		click.Web_driver_Click(Home_Locator.ACC_button);
		click.Web_driver_Click(Home_Locator.Login_button);
		Thread.sleep(5000);
		send_key.Web_Driver_Sendkeys(Home_Locator.User_Email,Constants.User_Emailid);
		send_key.Web_Driver_Sendkeys(Home_Locator.User_Password, Constants.User_password);
		click.Web_driver_Click(Home_Locator.User_submit);
		logger.info("Test Case 2 has completed");
	}
	
	
	
}
