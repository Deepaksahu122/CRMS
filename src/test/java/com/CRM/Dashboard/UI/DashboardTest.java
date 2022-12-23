package com.CRM.Dashboard.UI;

import org.testng.annotations.Test;

import com.CRM.common.Annotations;
import com.CRM.common.Constants;
import com.CRM.common.Init;

public class DashboardTest extends Annotations implements Init {

	@Test()
	public void OpenHomePage() {
		
		navigate.driver_Get(Constants.hompage);
	}
	
}
