package ex02_assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import common.BaseTest1;
import common.Configuration;

public class Ex02_EnterAndVerifyTest extends BaseTest1 {
	@Test
	public void enterUserName() {

		String expectedUserName = Configuration.USER_NAME;
		WebElement userNameTextField = getDriver().findElement(By.name("log"));

		assertTrue(userNameTextField.isEnabled(), "Assert that user name text box is enabled");

		userNameTextField.sendKeys(expectedUserName);
		String actualUserName = userNameTextField.getAttribute("value");
		// JUNIT 5
		// assertEquals(expectedUserName, actualUserName, "Assert that user name is
		// entered correctly");
		// TestNG
		assertEquals(actualUserName, expectedUserName, "Assert that user name is entered correctly");
	}
}
