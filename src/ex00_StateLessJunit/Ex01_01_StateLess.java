package ex00_StateLessJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex01_01_StateLess {
	private int count =0;
	@Test
	void test1() {
		count++;
		System.out.println("Test 1 - Count: " + count); //1
		assertEquals(1, count); //pass
	}
	@Test
	void test2() {
		count++;
		System.out.println("Test 2 - Count: " + count); //1
		assertEquals(1, count); //pass
	}
	/*
	 * both test cases will pass
	 * JUnit is re instantiates the test class before each test method - count is reset to 0
	 * Is this a bug? or is this intended behaviour
	 * Not a bug>> rather it is intended behaviour
	 * 
	 * each test will start with a state has been reset
	 * ensure that test's don't depend on each other
	 * WORSE - they could side effects on each other
	 * 
	 * This is a VALID Reason - the more independent your tests are - easier to run them in isolation
	 * however - it is counter-intuitive.
	 * Problem 1
	 *  This is a BUG - if we want to maintain state between the two test methods
	 *  We need these states/relations/dependencies in your test activities
	 *  JUNIT is trying to stop us
	 * 
	 */

}
