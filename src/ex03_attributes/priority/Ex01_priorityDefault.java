package ex03_attributes.priority;

import org.testng.annotations.Test;

public class Ex01_priorityDefault {
//	f1>f2>f3
	@Test
	public void f1() {
		System.out.println("test 1");
	}

	@Test
	public void f3() {
		System.out.println("test 3");
	}

	@Test
	public void f2() {
		System.out.println("test 2");
	}
}
