package com.hrms1.lib;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import com.hrms.utility.*;

public class Global {
	public WebDriver driver;
public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
public String un = "admin";
public String pw = "admin";
public String txt_loginname = "txtUserName";
public String txt_password = "txtPassword";
public String btn_login = "Submit";
public String btn_logout = "Logout";
public String frm_add = "rightMenu";
public String btn_add = "//input[@value = 'Add']";
public String txt_FN = "txtEmpFirstName";
public String txt_LN = "txtEmpLastName";
public String btn_Save = "btnEdit";
public String btn_Edit_Name = "EditMain";
public String btn_Save_Edit_xpat = "//input[@value = 'Save']";
public String FN = "Sethan";
public String LN = "Kumar";
public String upload = "//input[@type='file'][@name='photofile']";
//public String addEmp =  "//input[@value='Add']";
//http://127.0.0.1/orangehrm-2.6/login.php



}



