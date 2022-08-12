package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetUp;

public class ApplicationHooks {
	
	public TestContextSetUp testContent;
	
	public ApplicationHooks(TestContextSetUp testContent) {
		this.testContent=testContent;
	}
	
	@After
	public void quitBrowser() {
		testContent.testBase.webDriverManager().quit();
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) {
		WebDriver driver = testContent.testBase.webDriverManager();
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	}

}
