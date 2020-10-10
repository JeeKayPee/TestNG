package ex05_verbose;

import org.testng.annotations.Test;

public class test2 {
	@Test
	public void f() {
		System.out.println("test 2");
	}

	// verbose attribute is between 1 to 10
	// default is 0
	// -1 testNG in debugging mode

	// generally, 1 or 2 is what you will use
	// if you report a bug to TestNG team - then they might ask for a higher level
	// of verbose

	// verbose 1
	// Test Suite is displayed
	/// Total number of passed tests
	// detials like test category name, class name files are NOT displayed

	// Verbose 2
	// Test Suite is displayed
	// total number of passed tests
	// detials like test category name, class name files are displayed

}
