package com.hrms.Testscripts;
import com.hrms1.lib.*;
import org.testng.annotations.Test;

public class TC002 {
	@Test

public void tc001() throws Exception {
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

