package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	public UserPage userPage;
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public LoginPage getLoginPage()
	{
	
		loginPage= new LoginPage(driver);
	    return loginPage;
	}
	
	public DashboardPage getDashboardPage()
	{
	
		dashboardPage= new DashboardPage(driver);
	    return dashboardPage;
	}
	
	public UserPage getUserPage()
	{
	
		userPage= new UserPage(driver);
	    return userPage;
	}
	
	
	
	
	
	

}
