package ex07_exceptions;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Ex01_SimpleTestExceptions {
	@Test(expectedExceptions = AssertionError.class)
	public void test01() {
		System.out.println("test 1");
		assertTrue(false);
		
	}
}
