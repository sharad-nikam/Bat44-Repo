package com.parabank.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.base1.Base1;
import com.parabank.pages.LoginPage;


public class LoginPageTest extends Base1 {
	
	    @Test
	    public void validLoginTest() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("john", "demo");  // username & password for demo
	        
	        AssertJUnit.assertTrue(driver.getTitle().contains("ParaBank"));
	    }
	    

		@Test
	    public void verifyTest() {
	        Assert.assertFalse(false);
	    }
	}


