package ex03_attributes.priority;

import org.testng.annotations.Test;

public class Ex04_00_TestNG_priority_usingAttribute {
//2>1>3
//3>2>1

	@Test(priority = 3)
	public void multiMatch() {
		System.out.println("test 1");
	}

	@Test(priority = 2)
	public void dropDown() {
		System.out.println("test 2");
	}

	@Test(priority = 1)
	public void nestElements() {
		System.out.println("test 3");
	}
}
