package ex03_parallel;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFox {
  @Test
  public void firefox() throws Exception {
	  String driverPath = System.getProperty("user.dir") + File.separator + "drivers" + File.separator
				+ "geckodriver"; // add .exe for windows
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000); //this is a very bad way of waiting. We will learn better ways later
		driver.quit();
  }
}
