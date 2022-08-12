package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.UserPage;
import utils.TestContextSetUp;

public class UserSteps {
	
	public UserPage userpage;
	public TestContextSetUp testContent;
	public UserSteps(TestContextSetUp testContent) {

		this.testContent=testContent;
		userpage = testContent.pageObjectManager.getUserPage();
	}
	

	@Then("Admin should redirected to the user listing page")
	public void admin_redirected_to_the_userlisting_page() {
		
		Assert.assertEquals(userpage.verifyUserPage(), "User List");
		System.out.println(userpage.verifyUserPage());
	}
	
	@When("Admin click on the User List sub menu under the User menu")
	public void admin_click_on_the_user_list_sub_menu_under_the_User_menu() {
		
		userpage.clickUserMenu();
		userpage.clickUserListMenu();
	}
	
	@And("Observe that {int} records are dispalyed by default")
	public void observe_that_records_are_dispalyed_by_default(Integer int1) {
		
		Assert.assertEquals(userpage.verifyTheDefaultcount(), 10);
	 System.out.println(userpage.verifyTheDefaultcount());
	}
	
	@And("Enter the search value as {string}")
	public void enter_the_search_value_as(String string) {
	    userpage.enterTheSerachValue(string);
	}

	@Then("Search by email result will be displayed successfully")
	public void search_by_email_result_will_be_displayed_successfully() throws InterruptedException {
		Thread.sleep(5000);
	   System.out.println(userpage.verifySearchResult());
	   Assert.assertEquals(userpage.verifySearchResult(), "nihamathulla@qburst.com");
	}



}
