package ex01_annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import common.Configuration;

public class Ex02_practical_LoginLogOut {
	@Test
	public void loginLogOut() throws Exception {
		
		WebDriver driver = Configuration.createChromeDriver();
		driver.get(Configuration.ADMIN_URL);
		driver.get(Configuration.ADMIN_URL);
		WebElement userTextBox = driver.findElement(By.name("log"));
		userTextBox.sendKeys(Configuration.USER_NAME);

		WebElement pwdTextBox = driver.findElement(By.name("pwd"));
		pwdTextBox.sendKeys(Configuration.PASSWORD);

		driver.quit();
	}
}
