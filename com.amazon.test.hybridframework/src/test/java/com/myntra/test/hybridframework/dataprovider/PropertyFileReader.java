package com.myntra.test.hybridframework.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	static Properties prop;
	static FileInputStream inputStream;

	static {
		// TODO Auto-generated constructor stub
		try {
			inputStream = new FileInputStream(
					new File("D:\\Selenium-workspace\\com.amazon.test.hybridframework\\config\\configuration.properties"));
			prop = new Properties();
			prop.load(inputStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static String getURL() {

		return prop.getProperty("url");
	}

	public static String getFirefoxPath() {

		return prop.getProperty("FirefoxPath");
	}

	public static String getChromePath() {

		return prop.getProperty("chromePath");
	}

	public static String getIEPath() {

		return prop.getProperty("iePath");
	}

}
