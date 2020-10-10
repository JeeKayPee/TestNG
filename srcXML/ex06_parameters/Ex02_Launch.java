package ex06_parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.Configuration;

public class Ex02_Launch {
	WebDriver driver;

	@Test
	@Parameters({ "BROWSER", "URL", "USERNAME", "PASSWORD" })
	public void f(String BROWSER, String URL, String USERNAME, String PASSWORD) throws Exception {
		System.out.println(BROWSER);
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = Configuration.createChromeDriver();
		}
		driver.get(URL);
		driver.findElement(By.name("log")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);

		Thread.sleep(2000);

		// do some verification here

		driver.quit();
	}
}
