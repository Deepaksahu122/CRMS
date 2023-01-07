package com.CRM.Dashboard.UI;
import org.testng.annotations.Test;
import com.CRM.common.Annotations;
import com.CRM.common.Constants;
import com.CRM.common.Init;


public class DashboardTest extends Annotations implements Init {
	//public static final Logger log=LogManager.getLogger(DashboardTest.class);
	
	
	@Test()
	public void TC_Login() {
		
		navigate.driver_Get(Constants.hompage);
		

		log.info("this is me logged");
	}
}
