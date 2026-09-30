package com.parabank.base1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.parabank.factory.DriverFactory;



public class Base1 {
	
	    public WebDriver driver;

	    @BeforeMethod
	    public void setup() {
	    	
	    	//driver = new ChromeDriver();
	    	
	        driver = DriverFactory.initDriver();
	       // driver.get("https://parabank.parasoft.com/");
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
	}


