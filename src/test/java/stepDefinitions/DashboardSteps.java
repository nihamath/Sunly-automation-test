package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import pageObjects.DashboardPage;
import utils.TestContextSetUp;

public class DashboardSteps {

	public TestContextSetUp testContent;
	public DashboardPage dashboardPage;
	public DashboardSteps(TestContextSetUp testContent) {

		this.testContent=testContent;
		dashboardPage = testContent.pageObjectManager.getDashboardPage();
	}
	public WebDriver driver;

	@And("Admin redirected to the dashboard page")
	public void admin_redirected_to_the_dashboard_page() {
		
		Assert.assertEquals(dashboardPage.verifyDashboard(), "Dashboard");
	}
	
	@And("Admin click on the username in the dashboard")
	public void admin_click_on_the_username_in_the_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		dashboardPage.clickUserName();
		
	}
	
	@And("Click on the logout button")
	public void click_on_the_logout_button() {
		
		dashboardPage.clickLogout();
		
	}


}
