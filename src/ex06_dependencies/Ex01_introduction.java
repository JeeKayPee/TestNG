package ex06_dependencies;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Ex01_introduction {
	@Test
	public void test01() {
		System.out.println("test 1");
	}

	@Test(dependsOnMethods = "test03")
	public void test02() {
		System.out.println("test 2");
		//only if test03 passes
	}

	@Test
	public void test03() {
		System.out.println("test 3");
		assertEquals(1, 2, "I have failed");
	}
	@Test
	public void test04() {
		System.out.println("test 4");
	}
}
