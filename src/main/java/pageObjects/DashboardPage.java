package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	

	public WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By lblDashboard = By.xpath("/html/body/app-root/app-main/div/admin-header/c-container[1]/c-header-nav[1]/span");
	By btnUsername = By.xpath("//button[@class='py-0 nav-link btn']");
	By btnLogout = By.xpath("//ul[@class='pt-0 pr-5 w-auto manage-profile dropdown-menu show']/li[4]");
	
	public String verifyDashboard() {
		//waitHelper.WaitForElement(txtEmail);
		return driver.findElement(lblDashboard).getText();
	}
	
	public void clickUserName() {
		driver.findElement(btnUsername).click();
	}
	
	public void clickLogout() {
		driver.findElement(btnLogout).click();
	}





}
