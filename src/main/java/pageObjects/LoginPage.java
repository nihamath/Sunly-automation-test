package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {
	
	
	public WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}

	//Web Elements
	By txtEmail = By.id("email");
	By txtPassword = By.id("password");
	By btnSignIn = By.xpath("//button[text()='Sign in']");
	By toastMsg = By.xpath("//*[@id='toast-container']/div/div");
	
	

	//Different action methods of the web elements
	public void enterEmail(String email) {
	
		driver.findElement(txtEmail).sendKeys(email);
	}
	
	public void enterPassword(String password) {
		//waitHelper.WaitForElement(txtEmail);
		driver.findElement(txtPassword).sendKeys(password);
	}
	
	public void clickSignIn() {
		driver.findElement(btnSignIn).click();
	}
	
	public String verifyToastMessage() {
		//waitHelper.WaitForElement(txtEmail);
		return driver.findElement(toastMsg).getText();
	}
	
	


}
