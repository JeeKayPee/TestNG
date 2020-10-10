package ex02_assertions;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import common.BaseTest1;
import common.Configuration;

public class Ex03_loginLogOut extends BaseTest1 {
	@Test
	public void f() throws Exception {

		WebElement userNameTextField = getDriver().findElement(By.name("log"));
		userNameTextField.sendKeys(Configuration.USER_NAME);
		
		WebElement pwdTextField = getDriver().findElement(By.name("pwd"));
		pwdTextField.sendKeys(Configuration.PASSWORD);
		pwdTextField.submit();
		Thread.sleep(2000);
		
		boolean dboardLoaded = getDriver().findElement(By.id("wpadminbar")).isDisplayed();
		assertTrue(dboardLoaded);
		
		WebElement logout = getDriver().findElement(By.xpath("//*[text()='Log Out']"));
		
		getDriver().get(logout.getAttribute("href"));
		
		Thread.sleep(1000);
		
		WebElement logoutMsg = getDriver().findElement(By.xpath("//*[contains(text(),'logged out')]"));
		assertTrue(logoutMsg.isDisplayed(), "Assert successful login");
		
		
		

	}
}
