package com.parabank.tests;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.parabank.base1.Base1;
import com.parabank.pages.LoginPage;
import com.parabank.pages.OpenAccountPage;

 
public class OpenAccounPageTest extends Base1 {
	
	
	    @Test
	    public void openAccount() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("john", "demo");

	        OpenAccountPage openAccount = new OpenAccountPage(driver);
	        openAccount.openNewAccount();
	    }
	    
}


