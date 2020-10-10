package ex04_invocations;

import org.testng.annotations.Test;

public class Ex01_Introduction {
	
	@Test(invocationCount = 5)
	public void test() {
		System.out.println("Hello");
	}
}
