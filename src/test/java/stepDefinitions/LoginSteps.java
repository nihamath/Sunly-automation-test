package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.TestContextSetUp;

public class LoginSteps {
	
	//public WebDriver driver;
	public TestContextSetUp testContent;
	public LoginPage loginPage;
	
	public LoginSteps(TestContextSetUp testContent) {
		
		this.testContent=testContent;
		loginPage =testContent.pageObjectManager.getLoginPage();
	}
	@Given("Admin launch the application")
	public void admin_launch_the_application() {
	   
		System.out.println("laucnhed");
	   
	}
	@And("Enter the valid login credentials")
	public void enter_the_valid_login_credentials() {
		
		loginPage.enterEmail(testContent.testBase.readConfig.getEmail());
		loginPage.enterPassword(testContent.testBase.readConfig.getPassword());
	}
	@When("Admin click on the login button")
	public void admin_click_on_the_login_button() {
		loginPage.clickSignIn();
	}
	@Then("Admin gets a toast message {string}")
	public void admin_gets_a_toast_message(String string) throws InterruptedException {
		Thread.sleep(3000);
		
		Assert.assertEquals(loginPage.verifyToastMessage(), string);
	   	}
	
	@And("Enter the invalid login credentials")
	public void enter_the_invalid_login_credentials() {
		
		loginPage.enterEmail(testContent.testBase.readConfig.getEmail());
		loginPage.enterPassword("Test@123");
	}
	
	@And("Enter the valid user app login credentials")
	public void enter_the_valid_user_app_login_credentials() {
		
		loginPage.enterEmail("nihmathulla@qburst.com");
		loginPage.enterPassword("Nihamath@1234");
	}
	
	
	

}
