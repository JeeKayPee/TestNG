package ex03_attributes.priority;

import org.junit.jupiter.api.Test;

class Ex04_01_JUNIT_defaultBehaviour {
	
	//deterministic - but unpredictable order
	//@MethodSorters

	@Test
	void test01() {
		System.out.println("test 1");
	}
	@Test
	void test02() {
		System.out.println("test 2");
	}
	@Test
	void test03() {
		System.out.println("test 3");
	}

}
