package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserPage {

	public WebDriver driver;

	public UserPage(WebDriver driver) {
		this.driver=driver;
	}

	//Web Elements

	By menuUser = By.xpath("//a[text()='Users']");
	By menuUserList = By.xpath("//a[@href='/admin/users/list']");
	By lblUser = By.xpath("/html/body/app-root/app-main/div/admin-header/c-container[1]/c-header-nav[1]/span");
	By tablerow = By.xpath("//table[@role='table']/tbody/tr");
	By serachFeild = By.xpath("//input[@placeholder = 'Search by name']");
	By dataEmail = By.xpath("//table[@role='table']/tbody/tr[1]/td[3]/span");
	
	//Different action methods of the web elements
	public void clickUserMenu() {
		driver.findElement(menuUser).click();
	}
	public void clickUserListMenu() {
		driver.findElement(menuUserList).click();
	}

	public String verifyUserPage() {

		return driver.findElement(lblUser).getText();
	}

	public int verifyTheDefaultcount() {

		List<WebElement> tablerow= driver.findElements(By.xpath("//table[@role='table']/tbody/tr"));
		return tablerow.size();
	}
	
	public void enterTheSerachValue(String searchKey) {

		driver.findElement(serachFeild).sendKeys(searchKey);
	}
	
	public String verifySearchResult() {

		return  driver.findElement(dataEmail).getText();
	}



}
