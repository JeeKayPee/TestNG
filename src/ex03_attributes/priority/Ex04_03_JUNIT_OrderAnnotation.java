package ex03_attributes.priority;

import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(Alphanumeric.class)
//using Alphanumeric class
// this is case sensitive
//upper case comes before lower case

class Ex04_03_JUNIT_OrderAnnotation {

	@Test
	void myATest() {
		System.out.println("test 1");
	}

	@Test
	void myBTest() {
		System.out.println("test 2");
	}

	@Test

	void myaTest() {
		System.out.println("test 3");
	}

}
