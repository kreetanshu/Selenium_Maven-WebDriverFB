package com.myframeworkmaven.firstmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestFB {
	@Test
	public void TestFireFox(){
	 
	WebDriver driver=new FirefoxDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	 
	//driver.quit();
}
}
