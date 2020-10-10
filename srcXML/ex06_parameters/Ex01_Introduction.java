package ex06_parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex01_Introduction {
	@Test
	@Parameters({ "BROWSER" })
	public void test1(String BROWSER) {
		System.out.println("Test 1");
		System.out.println("Browser is " + BROWSER);
	}
	@Test
	@Parameters({ "URL" })
	public void test2(String URL) {
		System.out.println("Test 2");
		System.out.println("URL is " + URL);
	}
	@Test
	@Parameters({ "USERNAME", "PASSWORD" })
	public void test3(String USERNAME, String PASSWORD) {
		System.out.println("Test 3");
		System.out.println("USERNAME is " + USERNAME);
		System.out.println("PASSWORD is " + PASSWORD);
	}
	/*
	 * BONUS DISCUSSION
	 * We will not be able to convert to XML(using IDE once we have added the @Parameters
	 * annotation. 
	 * We have to manually add the classes in XML
	 * reason - unknown
	 * 
	 */
}
