package com.myntra.test.hybridframework.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.myntra.test.hybridframework.dataprovider.PropertyFileReader;
import com.myntra.test.hybridframework.factory.BrowserFactory;

public class TestAmazonMainWebpage {
	WebDriver driver;
	
	public TestAmazonMainWebpage() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testSignIn() {
		
		 driver = BrowserFactory.getBrowser("firefox");
		 driver.get(PropertyFileReader.getURL());
	}

}
