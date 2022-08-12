package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	
public WebDriver driver;
	
	public WaitHelper(WebDriver ldriver) {
		
		this.driver = ldriver;
	}

	public void WaitForElement(WebElement element) {
		try {
			
			WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		 
	}
	
	public void WaitForElementClickable(WebElement element) {
		try {
			
			WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		 
	}
	
	public void WaitForElemntTextToPresent(WebElement element, String text) {
		try {
			WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
			wait.until(ExpectedConditions.textToBePresentInElement(element, text));}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		 
	}
}
