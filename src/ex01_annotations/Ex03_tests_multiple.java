package ex01_annotations;

import org.testng.annotations.Test;

public class Ex03_tests_multiple {
	//can have multiple test methods - similar to JUnit
	@Test
	public void f1() {
		System.out.println("Hello from test 1");
	}

	@Test
	public void f2() {
		System.out.println("Hello from test 2");
	}
}
