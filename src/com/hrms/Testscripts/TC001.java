package com.hrms.Testscripts;
import com.hrms1.lib.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.w3c.dom.DOMConfiguration;
import org.testng.Reporter;
import org.apache.log4j.xml.DOMConfigurator;


public class TC001 {
@Test(priority = 1)

public void tc001() throws Exception{
	DOMConfigurator.configure("log4j.xml");
	General grm = new General();
	grm.openApplication();
	grm.login();
	grm.enterframe();
	grm.addEmp();
	//grm.addEmp();
	grm.exitframe();
	grm.logout();
	grm.closeApplication();
	
}

}
