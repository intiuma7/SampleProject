package com.pro.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import appConfig.bankConfig;



public class Test1 {
	@Test
	
	public static void test1()
	{
		String browser = bankConfig.browser;
        String url=bankConfig.env+"."+"com";
		
		WebDriver driver = null;
		switch(browser)
		{
		case "chrome" :
			  WebDriverManager.chromedriver().setup();
		      driver = new ChromeDriver();
		      break;
		case "edge":
			  WebDriverManager.edgedriver().setup();
		      driver =new EdgeDriver();
		      break;
		}
		if(driver!= null) {
		driver.get("https://www.linkedin.com/");
		
		System.out.println("URL is " + url );
		}
		
	}

}
