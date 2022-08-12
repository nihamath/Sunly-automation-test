package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetUp {
	
	public WebDriver driver;
	 public PageObjectManager pageObjectManager;
	 public TestBase testBase;
	 //public ReadConfig readConfig;
	 public TestContextSetUp() {
		 testBase = new TestBase();
		 pageObjectManager = new PageObjectManager(testBase.webDriverManager());
		 //readConfig = new ReadConfig();
	 }

}
