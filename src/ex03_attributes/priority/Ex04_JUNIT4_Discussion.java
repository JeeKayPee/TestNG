package ex03_attributes.priority;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex04_JUNIT4_Discussion {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	/*
	 * Test Order in Junit4 is slightly different
	 * Using 
	 * MethodSorters.DEFAULT = using hash code
	 * in case of hash collision  lexicographical order is used
	 * 
	 * MethodSorters.JVM
	 * This strategy used the natural JVM ordering
	 * which can be different in each run
	 * 
	 * MethodSorters.NAME_ASCENDING
	 * used for running tests in lexocographic order
	 * 
	 * 
	 */
}
