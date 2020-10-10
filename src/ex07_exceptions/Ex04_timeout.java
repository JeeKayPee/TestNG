package ex07_exceptions;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Ex04_timeout {
	//this test is expected to fail with the expectedExceptions = ThreadTimeoutException.class
	@Test(timeOut = 3000, expectedExceptions = ThreadTimeoutException.class)
	public void shouldFail() throws Exception {
		Thread.sleep(5000);
	}

	@Test(timeOut = 3000)
	public void shouldSucceed() throws Exception {
		Thread.sleep(1000);
	}
}