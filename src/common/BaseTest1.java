package common;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest1 {

	private WebDriver driver = null;

	@BeforeMethod
	void launchBrowser() throws Exception {
		setDriver(Configuration.createChromeDriver());
		getDriver().get(Configuration.ADMIN_URL);
	}

	@AfterMethod
	void closeBrowser() throws Exception {
		getDriver().quit();
	}

	protected WebDriver getDriver() {
		return driver;
	}

	private void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
