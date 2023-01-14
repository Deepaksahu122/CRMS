package com.CRM.common;

import com.CRM.webdrverutils.Click;
import com.CRM.webdrverutils.Navigate;
import com.CRM.webdrverutils.Send_Keys;
import com.CRM.webdrverutils.Set_Webdriver;

public interface Init {

	Set_Webdriver set_Webdriver = new Set_Webdriver();
	Navigate navigate = new Navigate();
	Click click=new Click();
	Assert asserts = new Assert();
	Send_Keys send_key =new Send_Keys();
}
