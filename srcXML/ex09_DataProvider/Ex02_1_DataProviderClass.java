package ex09_DataProvider;

import org.testng.annotations.DataProvider;

public class Ex02_1_DataProviderClass {
	@DataProvider(name = "data-provider")
	public static Object[][] dataProviderMethod() {
		return new Object[][] { { "Chrome" }, { "Firefox" } };
	}
}