package ex03_parallel;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {
  @Test
  public void chrome() throws Exception {
	  String driverPath = System.getProperty("user.dir") + File.separator + "drivers" + File.separator
				+ "chromedriver"; // add .exe for windows

		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000); //this is a very bad way of waiting. We will learn better ways later
		driver.quit();
  }
}
