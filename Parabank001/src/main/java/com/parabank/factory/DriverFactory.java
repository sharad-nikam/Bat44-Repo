package com.parabank.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	public static WebDriver driver;
	public static Properties prop;
	
	
	 public static WebDriver initDriver() {

	        prop = new Properties();
	        OptionsManager om= new OptionsManager(prop);

	        try {
	            InputStream ip = DriverFactory.class.getClassLoader()
	                    .getResourceAsStream("configuration/config.qa1.properties");

	            if (ip == null) {
	                throw new RuntimeException("config.qa1.properties NOT found in classpath");
	            }

	            prop.load(ip);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        String browser = prop.getProperty("browser");

	        if ("chrome".equalsIgnoreCase(browser)) {
	            driver = new ChromeDriver(om.getChromeOptions());
	        } 
	        else if ("edge".equalsIgnoreCase(browser)) {
	            driver = new EdgeDriver(om.getEdgeOptions());
	        } 
	        else {
	            throw new RuntimeException("Browser not specified correctly in properties file");
	        }

	        driver.manage().window().maximize();
	        driver.get(prop.getProperty("url"));

	        return driver;
	    }
	}

	

	  
	    
	


