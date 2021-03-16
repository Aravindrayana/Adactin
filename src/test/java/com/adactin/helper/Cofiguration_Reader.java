package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Cofiguration_Reader {

	public static Properties p;
	
	public Cofiguration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\Vishnu\\eclipse-workspace\\adactin\\src\\test\\java\\com\\adactin\\properties\\cofiguration.properties");
		FileInputStream fls = new FileInputStream(f);
		
		//Properties p = new Properties();
	
		p = new Properties();
		
		//load method
		
		p.load(fls);
		
	}
	
	private String getBrowser() {
		
		String browser = p.getProperty("chrome");
		
		return browser;
		

	}
	
	private String getUrl() {
		
		String url = p.getProperty("url");
		
		return url;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
