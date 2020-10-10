package ex09_DataProvider;

import org.testng.annotations.Test;

public class Ex02_TestClass {
	@Test(dataProvider = "data-provider", dataProviderClass = Ex02_1_DataProviderClass.class)
	public void testMethod(String data) {
		System.out.println("Data is: " + data);
	}
}