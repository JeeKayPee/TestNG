package ex00_StateLessJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Ex01_02_StateWithStatic {
	static int count = 0;

	@Test
	void test1() {
		count++;
		System.out.println("Test 1 - Count: " + count); // 1
		assertEquals(1, count); // pass
	}

	@Test
	void test2() {
		count++;
		System.out.println("Test 2 - Count: " + count); // 1
		assertEquals(2, count); // pass
	}
	/*
	 * Workaround - use static variables
	 * 
	 * static is "not" JVM friendly
	 * introduces several thread safety pitfalls - usually better avoid
	 * 
	 * 
	 * CONCLUSION - JUnit is being intrusive - it is forcing us to modify code 
	 * 
	 */

}
