package ex03_attributes.priority;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)

class Ex04_02_JUNIT_AlphaNumericOrder {
	
	

	@Test
	@Order(1)
	void test01() {
		System.out.println("test 1");
	}
	@Test
	@Order(3)
	void test02() {
		System.out.println("test 2");
	}
	@Test
	@Order(2)
	void test02_01() {
		System.out.println("test 3");
	}

}
