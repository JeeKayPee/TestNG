package ex00_StateLessJunit;

import org.junit.jupiter.api.Test;

class Ex05_RunningTests {

	@Test
	void test() {
		System.out.println("Test 1");
	}
	@Test
	void test2() {
		System.out.println("Test 2");
	}
	@Test
	void test3() {
		System.out.println("Test 3");
	}

	/*
	 * a common usage while writing/debugging tests is to run only ONE test method 
	 * (or a subset of our entire test suite)
	 * 
	 * IDEs allow us to run methods which we want to run
	 * 
	 * subset of test cases - run some specific test - problem is still there
	 */
}
