package ex00_StateLessJunit;

import org.junit.jupiter.api.Test;

class Ex02_Parameters {
	//JUnit 3 - design problems - TestNG
	//JUnit 4 and JUnit 5
	
	//The method name has to be test()
	//In JUnit 5 - any name
	@Test
	void anyName() {
		System.out.println("I can have any name");
		
	}
	
	@Test
	int iWillReturn() {
		int age = 43;
		return age;
	}
	@Test
	void test01() {
		System.out.println(iWillReturn());
	}
	
	@Test
	void willPassParameters() {
		willAcceptParameters("Gaurav");
	}
	@Test
	void willAcceptParameters(String name) {
		System.out.println(name);
	}
	
	/*
	 * Problem 2 - Parameters
	 * 
	 * 
	 * Test Methods in Junit3
	 * 1 - need to have their names with test(not a constraint anymore)
	 * 2 - cannot return values (not a constraint anymore)
	 * 3 - cannot have parameters (somewhat solved)
	 * willPassParameters >> work fine - however willAcceptParameters fails
	 * 
	 * Parameters is a sore point
	 * passing parameters to test methods is very natural - practical
	 * 
	 * Workarounds - convoluted designs
	 * 
	 */

}
