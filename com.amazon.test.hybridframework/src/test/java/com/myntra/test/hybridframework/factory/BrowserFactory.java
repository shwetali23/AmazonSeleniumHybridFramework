package com.myntra.test.hybridframework.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public static WebDriver getBrowser(String browserName) {

		WebDriver driver = null;

		if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "D:\\gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {

		} else if (browserName.equalsIgnoreCase("ie")) {

		}
		return driver;

	}

}
