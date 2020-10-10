package ex04_invocations;

import org.testng.annotations.Test;

public class Ex04_threadPoolSize {

	// every invocation received it's own new thread
	// We allocated five extra threads that were never used
	@Test(invocationCount = 5, threadPoolSize = 10)
	public void bigThreadPool() {
		System.out.println("[BIG] thread#: " + Thread.currentThread().getId());
	}
	// only three threads were allocated(13,14 and 15)
	// after the first 3 invocations, no threads are available
	// TestNG will wait for atleast one of these threads to return
	// the thread was reclaimed - used for the next invocation
	// another thread got free and was reused for the test method a 5th time
	
	@Test(invocationCount = 5, threadPoolSize = 3)
	public void smallThreadPool() {
		System.out.println("[BIG] thread#: " + Thread.currentThread().getId());
	}
}
