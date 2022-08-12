package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	public ReadConfig readConfig;
	
	public WebDriver webDriverManager() {
		readConfig = new ReadConfig();
		
		if (driver ==null) {
			
			if(readConfig.getBrowser().equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//Resources//chromedriver.exe");
				  driver =  new ChromeDriver();
			}
			
			else if(readConfig.getBrowser().equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Nihamathulla\\driver3\\chromedriver.exe");
				  driver =  new ChromeDriver();
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  driver.get(readConfig.getUrl());
		}
			return driver;
			
		
		
		 
	}

}
