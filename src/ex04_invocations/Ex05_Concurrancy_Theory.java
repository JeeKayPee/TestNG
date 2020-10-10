package ex04_invocations;

import org.testng.annotations.Test;

public class Ex05_Concurrancy_Theory {
	@Test
	public void f() {

	}
//Developers use multiple threads to run the test object
//tester's should also use multiple thread to run our tests faster
// 
	// Modern CPU have dual CPU or dual Cores
	// more than one process physically in parallel

	// We have 100 test methods
	// run these methods on two different threads.
	// approx dividing the time in two

	// In Test NG - Test Suite - simple set of test methods
	// which needs to be arranged in a certain order before we execute

	// to do this - allocate a thread pool of certain size
	// use these threads to execute our test method - like in demo

	// We have two CPU
	// but we allocate 10 threads
	// equivalent of allocating a pool of 2 threads

	// generally - this sort of calculation is not required
	// later if we have a machine with more than 2 processors
//	our tests will be faster

	// configurations testing.xml

}
