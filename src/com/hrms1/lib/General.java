package com.hrms1.lib;


import org.openqa.selenium.By;
import com.hrms.utility.Log;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.*;
public class General extends Global {

	public void openApplication () {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Personal\\Desktop\\testing material from 300ct\\driver.exe\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
		//Log.info("Application opened");
		Reporter.log("This report says that the openapplication ");
		
	}
	
	public void login() throws Exception {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
	    //System.out.println("login completed");
	    Thread.sleep(50000);
	    Reporter.log("Reporter login");
	    
	}
	
	//public void addingButton() {
		//driver.findElement(By.name(btn_add)).click();
	//}
	//public void addupload() throws Exception {
		//WebElement file = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
		//file.sendKeys("‪C:\\Users\\Personal\\Desktop\\20Sep.png");
		
		//Thread.sleep(8000);
		//System.out.println("upload completed");
	//}
	
public void closeApplication() {
	driver.close();
	//System.out.println("Driver closed");
	//Log.info("close");
	
}
  
public void enterframe() {
	driver.switchTo().frame(frm_add);
	//System.out.println("entered into frame");
	Log.info("entered frm");
    Reporter.log("reporter framed");
}
 
public void exitframe() {
	driver.switchTo().defaultContent();
	//System.out.println("exit from frame");
	Reporter.log("exit frame from Reporter log ");
	}
  
   public void addEmp() throws Exception {
	driver.findElement(By.xpath(btn_add)).click();
	driver.findElement(By.name(txt_FN)).sendKeys(FN);
	driver.findElement(By.name(txt_LN)).sendKeys(LN);
	WebElement file = driver.findElement(By.xpath(upload));
	file.sendKeys("E:\\keenu quote.jpg");
	
	Thread.sleep(8000);
	System.out.println("upload completed");
	driver.findElement(By.id(btn_Save)).click();
	//System.out.println("new emp added");
	Reporter.log("THIS IS upload reporter sethan ");
	}

public void logout () {
	driver.findElement(By.linkText(btn_logout)).click();
	//System.out.println("logout completed");
	Reporter.log("logout completed");
}
}
//input[@type='file'][@name='photofile']"