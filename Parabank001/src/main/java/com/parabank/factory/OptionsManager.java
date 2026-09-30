package com.parabank.factory;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class OptionsManager {
	 private Properties prop;
	    private ChromeOptions chromeOptions;
	    private EdgeOptions edgeOptions;
	    public OptionsManager(Properties prop) {
	        this.prop = prop;
	    }
	//chromeOptions
	    public ChromeOptions getChromeOptions() {

	        chromeOptions = new ChromeOptions();

	        if (prop.getProperty("incognito").equals("true")) {
	            chromeOptions.addArguments("--incognito");
	        }

	        if (prop.getProperty("headless").equals("true")) {
	            chromeOptions.addArguments("--headless");
	        }

	        chromeOptions.addArguments("--disable-notifications");
	        chromeOptions.addArguments("--start-maximized");
	       

	        return chromeOptions;
	    }

	    // Edge Options
	    public EdgeOptions getEdgeOptions() {

	        edgeOptions = new EdgeOptions();

	        if (prop.getProperty("incognito").equals("true")) {
	            edgeOptions.addArguments("--inprivate");
	        }
	        if (prop.getProperty("headless").equals("true")) {
	            edgeOptions.addArguments("--headless");
	        }

	        edgeOptions.addArguments("--disable-notifications");

	        return edgeOptions;
	    }
	}
