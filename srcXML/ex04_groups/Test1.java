package ex04_groups;

import org.testng.annotations.Test;

public class Test1 {
	@Test(groups = {"Smoke"})
	public void test1() {
		System.out.println("Smoke Test 1");
	}

	@Test(groups = {"Smoke"})
	public void test2() {
		System.out.println("Smoke Test 2");
	}

	@Test(groups = {"Regression"})
	public void test3() {
		System.out.println("Regression Test");
	}

	@Test(groups = {"Smoke", "Sanity"})
	public void test4() {
		System.out.println("Sanity Test");
	}

}
